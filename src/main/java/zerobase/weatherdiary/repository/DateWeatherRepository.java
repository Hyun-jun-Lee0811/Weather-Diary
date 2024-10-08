package zerobase.weatherdiary.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.weatherdiary.domain.DateWeather;

import java.time.LocalDate;

@Repository
public interface DateWeatherRepository extends JpaRepository<DateWeather, LocalDate> {

  List<DateWeather> findAllByDate(LocalDate localDate);
}
