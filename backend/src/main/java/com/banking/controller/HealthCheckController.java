package com.banking.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * HealthCheckController — Your First REST Controller!
 * ════════════════════════════════════════════════════
 *
 * This controller serves as a "heartbeat" endpoint to verify
 * that the application is running and the API is reachable.
 * Every production application should have one.
 *
 * ANNOTATIONS EXPLAINED:
 *
 * @RestController — Combines TWO annotations:
 *   1. @Controller → Marks this class as a Spring MVC controller
 *   2. @ResponseBody → Tells Spring to convert return values to JSON automatically
 *   Without @ResponseBody, Spring would try to resolve a view (HTML page).
 *   With @RestController, every method returns data (JSON), not a view.
 *
 * @RequestMapping("/api") — Sets the BASE URL path for ALL endpoints in this controller.
 *   All methods here will be prefixed with /api
 *   Example: /api/health
 *
 *   Why "/api" prefix?
 *   - Separates API routes from frontend routes
 *   - Industry standard for REST APIs
 *   - Makes it easy to configure security (protect everything under /api)
 */
@RestController
@RequestMapping("/api")
public class HealthCheckController {

    /**
     * Health Check Endpoint
     * ─────────────────────
     * URL: GET http://localhost:8080/api/health
     *
     * @GetMapping("/health") — Maps HTTP GET requests to this method.
     *   GET is used because we're RETRIEVING information, not modifying anything.
     *   HTTP Methods:
     *   - GET    → Retrieve data
     *   - POST   → Create new data
     *   - PUT    → Update existing data
     *   - DELETE → Remove data
     *
     * ResponseEntity<Map<String, Object>> — What is ResponseEntity?
     *   ResponseEntity gives us FULL CONTROL over the HTTP response:
     *   - Status code (200, 404, 500, etc.)
     *   - Headers
     *   - Body (the actual data)
     *
     *   Why not just return a Map directly?
     *   Because ResponseEntity lets us set the proper HTTP status code.
     *   This is critical for REST APIs — clients rely on status codes
     *   to understand what happened.
     *
     * @return JSON response with application status and timestamp
     */
    @GetMapping("/health")
    public ResponseEntity<Map<String, Object>> healthCheck() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "UP");
        response.put("application", "Banking Transaction Management System");
        response.put("version", "1.0.0");
        response.put("timestamp", LocalDateTime.now().toString());

        // ResponseEntity.ok() → Returns HTTP 200 (OK) status with the body
        return ResponseEntity.ok(response);
    }
}
