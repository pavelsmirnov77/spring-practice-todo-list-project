package ru.sber.backend.repositories;

import ru.sber.backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * Ищет пользователя по имени
     *
     * @param username заданное имя пользователя
     * @return пользователя с заданным именем
     */
    Optional<User> findByUsername(String username);

    /**
     * Проверяет существует ли пользователь с заданным именем
     *
     * @param username заданное имя пользователя
     * @return true, если пользователь существует, иначче false
     */
    Boolean existsByUsername(String username);

    /**
     * Проверяет существует ли пользователь с заданным email
     *
     * @param email заданный email пользователя
     * @return true, если пользователь существует, иначе false
     */
    Boolean existsByEmail(String email);
}