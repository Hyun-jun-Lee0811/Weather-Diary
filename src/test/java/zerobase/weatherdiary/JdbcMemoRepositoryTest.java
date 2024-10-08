package zerobase.weatherdiary;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import zerobase.weatherdiary.domain.Memo;
import zerobase.weatherdiary.repository.JdbcMemoRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
public class JdbcMemoRepositoryTest {

  @Autowired
  JdbcMemoRepository jdbcMemoRepository;

  @Test
  void insertMemoTest() {
    //given
    Memo newMemo = new Memo(2, "insertMemoTest");
    //when
    jdbcMemoRepository.save(newMemo);

    //then
    Optional<Memo> result = jdbcMemoRepository.findById(2);
    assertEquals(result.get().getText(), "insertMemoTest");
  }

  @Test
  void findAllMemoTest() {
    List<Memo> memoList = jdbcMemoRepository.findAll();
    System.out.println(memoList);
    assertNotNull(memoList);
  }
}
