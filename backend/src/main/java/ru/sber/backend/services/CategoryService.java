package ru.sber.backend.services;

import ru.sber.backend.entities.Category;
import ru.sber.backend.entities.Task;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    /**
     * Создает категорию задач
     *
     * @param category создаваемая категория
     * @return id созданной категории
     */
    Category createCategory(Category category);

    /**
     * Ищет категорию по заданному id
     *
     * @param categoryId id категории
     * @return категория с заданным id
     */
    Optional<Category> findCategoryById(Long categoryId);

    /**
     * Ищет все категории по заданному имени
     *
     * @param name название категории
     * @return список категорий с заданным именем
     */
    List<Category> findAllCategoryByName(String name);

    /**
     * Ищет все категории
     *
     * @return список найденных категорий
     */
    List<Category> findAllCategories();

    /**
     * Обновляет категорию
     *
     * @param category обновляемая категория
     * @return обновленная категория
     */
    Category updateCategory(Category category);

    /**
     * Получает все задачи по заданному id категории
     *
     * @param categoryId id категории
     * @return список задач по id категории
     */
    List<Task> getTasksByCategoryId(Long categoryId);

    /**
     * Удаление категории по заданному id
     *
     * @param categoryId id категории
     * @return true, если категория успешно удалена, иначе false
     */
    boolean deleteCategoryById(Long categoryId);
}
