# ![weather_8356649](https://github.com/user-attachments/assets/505d3dac-20af-4415-a48b-f692e09818f8) 날씨 일기 프로젝트

## 목표
OpenWeatherMap API를 이용하여 날씨, 일기를 작성/조회/수정/삭제 하는 백엔드를 구현하는 것이 목표입니다

## 최종 API

1. **POST `/create/diary`**
   - **설명**: 지정한 날짜의 날씨 정보를 가져와 일기와 함께 DB에 저장합니다.
   - **요청 파라미터**:
     - `date`: 일기 작성 날짜 (ISO 형식)
     - `text`: 일기 내용 (Request Body)

2. **GET `/read/diary`**
   - **설명**: 선택한 날짜에 작성된 모든 일기 데이터를 조회합니다.
   - **요청 파라미터**:
     - `date`: 조회할 날짜 (ISO 형식)

3. **GET `/read/diaries`**
   - **설명**: 선택한 기간 동안 작성된 모든 일기 데이터를 조회합니다.
   - **요청 파라미터**:
     - `startDate`: 조회할 기간의 시작 날짜 (ISO 형식)
     - `endDate`: 조회할 기간의 마지막 날짜 (ISO 형식)

4. **PUT `/update/diary`**
   - **설명**: 선택한 날짜의 일기 내용을 업데이트합니다.
   - **요청 파라미터**:
     - `date`: 수정할 일기의 날짜 (ISO 형식)
     - `text`: 새로운 일기 내용 (Request Body)

5. **DELETE `/delete/diary`**
   - **설명**: 선택한 날짜의 일기 데이터를 삭제합니다.
   - **요청 파라미터**:
     - `date`: 삭제할 일기의 날짜 (ISO 형식)


## 개발 환경
<img src="https://img.shields.io/badge/windows-0078D6?style=for-the-badge&logo=windows&logoColor=white"><img src="https://img.shields.io/badge/IntelliJ%20IDEA-000000?style=for-the-badge&logo=intellijidea&logoColor=white"><img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"><img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"><img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white"><img src="https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white"><img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
