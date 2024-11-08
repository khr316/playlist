# 간단한 음악 스트리밍 웹사이트

## 프로젝트 개요

Spring Boot 기반의 간단한 음악 스트리밍 웹사이트<br>

이 웹사이트는 사용자에게 음악 목록을 제공하고, 사용자가 선택한 음악을 웹 브라우저에서 직접 스트리밍할 수 있도록 구현됩니다. <br>
또한, 각 음악에 대한 세부 정보를 보여주고, 음악 파일을 스트리밍할 수 있는 기능을 제공

## 주요 기능

- **음악 목록 조회**: 음악 목록 및 각 음악에 대한 제목과 아티스트 확인
- **음악 스트리밍**: `<audio>` 태그를 사용하여 음악 파일 재생 가능
- **음악 세부 정보 조회**: 각 음악에 대한 정보 확인 (제목, 아티스트, 앨범 등)

## 사용 기술

- **Spring Boot**
- **Gradle**
- **MySQL**
- **HTML5**
- **Css**
- **JavaScript**
- **Git**

## 프로젝트 구조
music-streaming-app/<br>
├── src/<br>
│   ├── main/<br>
│   │   ├── java/<br>
│   │   │   └── org.example/<br>
│   │   │       └── khr/<br>
│   │   │           ├── controller/           # 요청을 처리하는 컨트롤러<br>
│   │   │           ├── dao/                  # 데이터베이스 접근 객체<br>
|   |   |           ├── KhrApplication<br>
│   │   └── resources/<br>
|   |       └── static<br>
|   |       └── templates<br>
│   │       └── application.properties         # 데이터베이스 설정<br>
├── build.gradle                                 # Gradle 의존성 설정<br>
└── README.md                                    # 프로젝트 설명 파일<br>


## 데이터베이스 설정

- 이 프로젝트는 **MySQL** 데이터베이스를 사용하여 음악 데이터를 저장합니다.
- 데이터베이스에는 음악 정보(제목, 아티스트, 파일 경로 등)가 저장됩니다.
- `application.properties` 파일에서 데이터베이스 연결 정보를 설정합니다.

## 음악 스트리밍

- 음악 파일은 웹 서버에서 제공, `<audio>` 태그를 사용하여 브라우저에서 스트리밍 가능
