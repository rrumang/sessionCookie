package org.zerock.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.w2.dao.TodoDao;
import org.zerock.w2.domain.TodoVO;

import java.time.LocalDate;
import java.util.List;

public class TodoDaoTests {

    private TodoDao todoDao;

    @BeforeEach
    public void ready() {
        todoDao = new TodoDao();
    }

    @Test
    public void testTime() throws Exception {
        System.out.println(todoDao.getTime());
    }

    @Test
    public void testInsert() throws Exception {
        TodoVO todoVO = TodoVO.builder()
                .title("sample title...")
                .dueDate(LocalDate.of(2021,12,31))
                .build();

        todoDao.insert(todoVO);
    }

    @Test
    public void testList() throws Exception {
        List<TodoVO> list = todoDao.selectAll();
        list.forEach(vo -> System.out.println(vo));
    }

    @Test
    public void testOne() throws Exception {
        TodoVO vo = todoDao.selectOne(1);
        System.out.println(vo);
    }

    @Test
    public void testUpdateOne() throws Exception {
        TodoVO todoVO = TodoVO.builder()
                .tno(1L)
                .title("sample title...")
                .dueDate(LocalDate.of(2021, 12,31))
                .finished(true)
                .build();

        todoDao.updateOne(todoVO);
    }
}
