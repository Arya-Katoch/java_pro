package com.banking.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * RootController — Handles the root URL (/)
 * ═════════════════════════════════════════
 *
 * Why is this controller needed?
 * - When users type "http://localhost:8080" in the browser, Spring Boot defaults to a 
 *   404 "Whitelabel Error Page" if no mapping exists for the root path (/).
 * - This controller handles the root path and returns a friendly JSON guide instead of an error.
 */
@RestController
public class RootController {

    /**
     * Root Welcome Endpoint
     * ─────────────────────
     * URL: GET http://localhost:8080/
     *
     * Maps GET requests to the root path (/) and returns a helpful response.
     */
    @GetMapping("/")
    public ResponseEntity<Map<String, Object>> welcome() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Welcome to the Banking Transaction Management System API");
        response.put("healthCheckUrl", "http://localhost:8080/api/health");
        response.put("status", "Active");
        
        return ResponseEntity.ok(response);
    }
}
