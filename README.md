#  🏠SixUniverse (숙박 공유 사이트)   


<img width="1000" alt="image" src="https://user-images.githubusercontent.com/76866502/184530016-157acd6a-9e5d-473c-a0b5-beace2fa9896.png">

- 배포 URL : http://sixuniverse.herokuapp.com/ (현재 서비스 중단 상태)   <br/>
- 최종 발표자료에서 모든 구현 기능과 파트 분배를 자세히 보실 수 있습니다.   <br/>
: https://docs.google.com/presentation/d/19SEoaTjpnbqNx-ZSX_6StphRuKGOOE3d2ch9erz2GDQ/edit?usp=sharing  


## 1. 소개
**SixUniverse** 프로젝트는 방을 빌리는 손님과 주인 사이를 중개해주고 수수료를 떼어가는 시스템의 숙박 공유 예약사이트 입니다.    
따라서 SixuUniverse의 이용자는 손님인 ‘게스트’와 주인인 ‘호스트’로 이원화 되어있으며, 각각의 니즈에 맞는 정보와 편의성을 제공하는 것이 목표입니다.   


## 2. 개발도구 및 환경
- 개발 도구 : `IntelliJ`     
- 사용 언어	: `HTML`, `CSS`, `JavaScript`, `Java(jdk 1.8)`     
- 프레임워크	: `Spring Boot(2.4.3)`, `MyBatis`   
- 뷰 템플릿	: `Thymeleaf`   
- 빌드 툴 : `Gradle`   
- 데이터베이스 : `MySQL(5.7)`   
- 형상관리 : `Git`, `GitHub`   
- 라이브러리	: `aop`, `security`, `oauth2-client`, `websocket`, `gson`, `lombok`, `jquery(latest)`, `datepicker`, `chart.js`, `moment.js`, `fontawesome`, `thymeleaf-layout-dialect`, `thymeleaf-extras-springsecurity5`.  
- API	: Kakao Map, Daum 우편번호, Mailgun, Iamport, Google OAuth2   
- 클라우드 서비스 : AWS S3, AWS RDS, Heroku   

## 3. 프로젝트 구현 (검색, 호스트 예약 기능)
### 3-1. 검색

1. 검색 시작하기
<img width="800" alt="image" src="https://user-images.githubusercontent.com/76866502/184530735-df7837ca-3723-45cc-9d36-0c1128cedbfe.png">


2. 검색 선택
<img width="800" alt="image" src="https://user-images.githubusercontent.com/76866502/184530856-ac177c57-4cab-412b-be08-516eafd605e7.png">

3. 검색 결과   

a. 검색 키워드 4가지 입력 후 검색   
<img width="800" alt="image" src="https://user-images.githubusercontent.com/76866502/184531010-eb00664f-e29e-4c66-a5c6-e02bad4a5274.png">   

b. 체크인, 체크아웃 날짜만 입력 후 검색   
<img width="800" alt="image" src="https://user-images.githubusercontent.com/76866502/184531163-5f30a7c1-49ab-4dfe-bf1d-7fb2ace8f0ff.png">   

c. 게스트 수만 입력 후 검색   
<img width="800" alt="image" src="https://user-images.githubusercontent.com/76866502/184531218-0524e502-2da4-4e4a-8c69-2991b8ee9dde.png">   

d. 아무 입력 없이 검색할 경우   
<img width="800" alt="image" src="https://user-images.githubusercontent.com/76866502/184531331-68d97507-e138-47a1-ad1a-3b82bd570acf.png">


### 3-2. 호스트 예약   

1. 호스트   

a. 예약 목록   
<img width="800" alt="image" src="https://user-images.githubusercontent.com/76866502/184531541-eaa1462c-cd27-4eb0-8d96-f07456d70816.png">   

b. 게스트 변경 요청시 예약목록   
<img width="800" alt="image" src="https://user-images.githubusercontent.com/76866502/184531620-c6bd64c9-ee06-4d11-adfb-0f32e34d32bd.png">   

c. 변경 요청 중 다른 게스트가 이미 예약한 경우   
<img width="800" alt="image" src="https://user-images.githubusercontent.com/76866502/184531700-553e65d2-b22a-41ae-b845-16f202eb61de.png">   


2. 예약 상세내역   
<img width="800" alt="image" src="https://user-images.githubusercontent.com/76866502/184531786-836b9b2b-3cd8-476a-bd78-dc5b5f9e4bc2.png">   
<img width="800" alt="image" src="https://user-images.githubusercontent.com/76866502/184531804-411b7a8e-024d-4b27-b9c4-ce02e2ad8c7d.png">   






