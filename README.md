# Music Streaming Web Application

## 프로젝트 개요

**프로젝트 이름**: 음악 웹사이트 (Music Streaming Web Application)

이 프로젝트는 사용자가 웹사이트에서 음악을 업로드하고, 재생하고, 좋아요를 누르거나 즐겨찾기를 할 수 있는 음악 스트리밍 웹 애플리케이션입니다. 웹 애플리케이션을 통해 사용자는 자신만의 플레이리스트를 만들고, 다양한 음악을 스트리밍하며, 다른 사용자의 음악을 공유하거나 검색할 수 있는 기능을 제공합니다.

## 주요 기능

- **음악 업로드**: 사용자가 MP3 파일을 업로드하고, 제목과 아티스트를 입력하여 자신만의 음악을 사이트에 추가할 수 있습니다.
- **음악 목록**: 업로드된 음악 리스트를 보여주고, 사용자가 선택하여 음악을 재생할 수 있습니다.
- **음악 재생**: 웹에서 MP3 파일을 직접 재생할 수 있습니다.
- **검색 기능**: 음악을 제목이나 아티스트명으로 검색할 수 있습니다.
- **좋아요 및 즐겨찾기**: 사용자가 좋아하는 음악에 대해 '좋아요'를 누르거나 즐겨찾기 기능을 통해 다시 쉽게 찾을 수 있습니다.
- **사용자 계정 관리**: 회원가입, 로그인, 로그아웃 기능을 제공하여 개인화된 서비스를 이용할 수 있습니다.

## 기술 스택

- **백엔드**: Spring Boot
- **프론트엔드**: HTML, CSS, JavaScript (React 또는 Vue.js)
- **데이터베이스**: MySQL
- **파일 저장**: 로컬 파일 시스템 또는 AWS S3
- **음악 재생**: HTML5 `<audio>` 요소 또는 JavaScript 기반 플레이어 라이브러리
- **인증**: JWT(JSON Web Token) 기반 사용자 인증

## 프로젝트 구조
music-streaming-app/
├── backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── musicstreaming/
│   │   │   │           ├── controller/        # API 컨트롤러
│   │   │   │           ├── dao/               # 데이터 접근 객체 (JPA)
│   │   │   │           ├── service/            # 비즈니스 로직
│   │   │   │           └── model/              # 엔티티 (User, Music, etc.)
│   │   │   ├── resources/
│   │   │   │   ├── application.properties       # DB 및 설정
│   │   │   │   └── static/                      # 정적 파일
│   │   │   └── webapp/
│   │   │       └── WEB-INF/
│   │   └── pom.xml                                # Maven 의존성 설정
├── frontend/
│   ├── src/
│   │   ├── components/                           # React 컴포넌트
│   │   ├── pages/                                # 페이지 컴포넌트
│   │   └── App.js                                # 메인 컴포넌트
│   └── public/
│       └── index.html                            # HTML 템플릿
└── README.md

## 주요 기능 구현

### 1. 백엔드 구현

- **Music 엔티티**: 음악 파일에 대한 정보를 저장하는 `Music` 엔티티 클래스 작성 (제목, 아티스트, 파일 경로 등)
- **음악 업로드**: 사용자가 음악 파일을 업로드하고, 해당 음악의 메타데이터를 저장하는 API 작성
- **음악 목록 조회**: 업로드된 음악 목록을 보여주는 API 구현
- **검색**: 제목 또는 아티스트를 기준으로 음악을 검색할 수 있는 API 제공
- **사용자 인증**: JWT를 사용한 로그인, 회원가입 기능을 통해 사용자 인증 구현

### 2. 프론트엔드 구현

- **음악 목록**: 업로드된 음악 목록을 React로 보여주고, 각 음악에 대해 `<audio>` 태그를 사용해 음악을 재생할 수 있는 기능 구현
- **검색**: 제목과 아티스트를 기준으로 음악을 검색할 수 있는 기능 추가
- **좋아요 및 즐겨찾기**: 사용자가 음악에 좋아요를 눌러 즐겨찾기 목록을 관리할 수 있는 UI 구성
- **로그인/회원가입**: 로그인 및 회원가입 화면을 React로 구성하여 JWT 기반의 인증 기능 제공

### 3. 데이터베이스

- **MySQL**을 사용하여 음악, 사용자 정보, 좋아요 및 즐겨찾기 데이터를 저장
- 데이터베이스 스키마:
  - `Music` 테이블: 음악 제목, 아티스트, 파일 경로, 업로드 날짜
  - `User` 테이블: 사용자 정보 (이메일, 비밀번호 등)
  - `Favorites` 테이블: 사용자가 즐겨찾기한 음악을 저장