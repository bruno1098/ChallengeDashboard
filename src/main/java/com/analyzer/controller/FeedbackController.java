package com.analyzer.controller;

import com.analyzer.model.Feedback;
import com.analyzer.model.Usuario;
import com.analyzer.service.FeedbackService;
import com.analyzer.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/feedbacks")
    public String listarFeedbacks(Model model) {
        List<Feedback> feedbacks = feedbackService.listarTodos();
        List<Usuario> usuarios = usuarioService.listarTodos(); // Carrega todos os usuários
        model.addAttribute("feedbacks", feedbacks);
        model.addAttribute("usuarios", usuarios); // Adiciona a lista de usuários ao modelo
        return "feedbacks/listar";
    }

    // Formulário para novo feedback
    @GetMapping("/feedbacks/novo")
    public String novoFeedbackForm(Model model) {
        model.addAttribute("feedback", new Feedback());
        model.addAttribute("usuarios", usuarioService.listarTodos());
        return "feedbacks/novo";  // Exibe a página novo.html
    }

    // Salvar novo feedback
    @PostMapping("/feedbacks")
    public String salvarFeedback(@ModelAttribute Feedback feedback) {
        feedbackService.salvar(feedback);
        return "redirect:/feedbacks";  // Redireciona para a listagem de feedbacks
    }

    // Formulário para editar feedback
    @GetMapping("/feedbacks/editar/{id}")
    public String editarFeedbackForm(@PathVariable Long id, Model model) {
        Feedback feedback = feedbackService.buscarPorId(id)
                .orElseThrow(() -> new IllegalArgumentException("ID inválido: " + id));
        model.addAttribute("feedback", feedback);
        model.addAttribute("usuarios", usuarioService.listarTodos());
        return "feedbacks/editar";  // Exibe a página editar.html
    }

    @PostMapping("/feedbacks/editar/{id}")
    public String atualizarFeedback(@PathVariable Long id, @ModelAttribute Feedback feedback, Model model) {
        try {
            // Verifica se o feedback e o usuário existem
            Feedback feedbackExistente = feedbackService.buscarPorId(id)
                    .orElseThrow(() -> new IllegalArgumentException("ID inválido: " + id));

            // Busca o usuário associado ao feedback
            Usuario usuario = usuarioService.buscarPorId(feedback.getUsuario().getId())
                    .orElseThrow(() -> new IllegalArgumentException("ID de usuário inválido: " + feedback.getUsuario().getId()));

            // Atualiza os dados do feedback existente com os novos valores
            feedbackExistente.setDescricao(feedback.getDescricao());
            feedbackExistente.setNota(feedback.getNota());
            feedbackExistente.setUsuario(usuario);

            // Salva o feedback atualizado
            feedbackService.salvar(feedbackExistente);

            return "redirect:/feedbacks";
        } catch (Exception e) {
            model.addAttribute("errorMessage", "Erro ao atualizar o feedback: " + e.getMessage());
            return "feedbacks/editar"; // Retorna ao formulário com mensagem de erro
        }
    }


    @GetMapping("/feedbacks/deletar/{id}")
    public String deletarFeedback(@PathVariable Long id) {
        // Exclui o feedback pelo ID
        feedbackService.deletarPorId(id);
        return "redirect:/feedbacks";  // Redireciona para a página de listagem após a exclusão
    }
}

