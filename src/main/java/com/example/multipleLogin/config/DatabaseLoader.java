// package com.example.multipleLogin.config;

// import java.util.List;


// import org.springframework.boot.CommandLineRunner;
// import org.springframework.context.annotation.Bean;

// import com.example.multipleLogin.entity.User;
// import com.example.multipleLogin.repository.UserRepository;

// public class DatabaseLoader {
//     private UserRepository repo;

//     public DatabaseLoader(UserRepository repo) {
//         this.repo = repo;
//     }

//     @Bean
//     public CommandLineRunner initDatabase() {
//         return args -> {
//             User user1 = new User(1,"thaonguyen06@gmail.com","admin123",com.example.multipleLogin.entity.Role.ADMIN);  
//             User user2 = new User(2,"lephat08@gmail.com","user123",com.example.multipleLogin.entity.Role.USER);
//             User user3 = new User(3,"johndeep@gmail.com","user123",com.example.multipleLogin.entity.Role.USER);
//             repo.saveAll(List.of(user1,user2,user3));
//             System.out.println("Sample database has been initialized");
//         };
//     }
// }
