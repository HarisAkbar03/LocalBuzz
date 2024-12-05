package com.localbuzz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthController {

    // Home Page
    @GetMapping("/")
    public String home() {
        return "index"; // This should correspond to index.html in the templates folder
    }

    // Register Page
    @GetMapping("/Register")
    public String registerPage() {
        return "Register"; // This will load register.html from the templates folder
    }

    // Main Page After Login
    @PostMapping("/main")
    public ModelAndView homePage() {
        ModelAndView mav = new ModelAndView("main"); // This will load main.html
        return mav; // This will load home.html from the templates folder
    }

    // About Page
    @GetMapping("/about")
    public String aboutPage() {
        return "about"; // Returns the about.html template
    }

    // Business Sign-Up Page
    @GetMapping("/BuiSign")
    public String businessSignUpPage() {
        return "BuiSign"; // Corresponds to BuiSign.html in your templates folder
    }

    // Handle Business Sign-Up
    @PostMapping("/BuiSign")
    public String handleBusinessSignUp(@RequestParam String businessName, 
                                        @RequestParam String ownerName,
                                        @RequestParam String email,
                                        @RequestParam String phone,
                                        @RequestParam String address,
                                        @RequestParam String category) {
        // Here you can process the business sign-up form, like saving it to the database.
        // After successful sign-up, redirect to the dashboard page.
        return "redirect:/BDashboard"; // Redirects to BDashboard page after business sign-up
    }

    // Business Dashboard
    @GetMapping("/BDashboard")
    public String showDashboard() {
        return "BDashboard"; // This should load BDashboard.html from templates
    }

    // Contact Page
    @GetMapping("/Contact")
    public String contactPage() {
        return "Contact"; // This should load Contact.html from templates
    }
    
    // Handle Contact Form Submission
    @PostMapping("/Contact")
    public String handleContactForm(@RequestParam String name, 
                                    @RequestParam String email, 
                                    @RequestParam String message) {
        // Here you can process the contact form, e.g., saving the message to the database
        // Or sending an email with the message.
        
        // Redirect to a "thank you" page or back to the contact page
        return "redirect:/Contact"; // Or redirect to a thank you page or confirmation
    }
}
