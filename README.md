#  🏠SixUniverse (숙박 공유 사이트)   


<img width="1200" alt="image" src="https://user-images.githubusercontent.com/76866502/184530016-157acd6a-9e5d-473c-a0b5-beace2fa9896.png">

- 배포 URL : http://sixuniverse.herokuapp.com/ (현재 서비스 중단 상태)   <br/>
- 최종 발표자료에서 모든 구현 기능과 파트 분배를 자세히 보실 수 있습니다.   <br/>
: https://docs.google.com/presentation/d/1bZqgxlj_6bSqxxA4EPhaXeI-9nsY7ilBrusIn-pUGiU/edit#slide=id.gcaf936bbf5_0_5   


## 1. 소개
**SixUniverse** 프로젝트는 방을 빌리는 손님과 주인 사이를 중개해주고 수수료를 떼어가는 시스템의 숙박 공유 사이트 입니다.    
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

- 1. 검색 시작하기
<img width="800" alt="image" src="https://user-images.githubusercontent.com/76866502/184530735-df7837ca-3723-45cc-9d36-0c1128cedbfe.png">


- 2. 검색 선택
<img width="800" alt="image" src="https://user-images.githubusercontent.com/76866502/184530856-ac177c57-4cab-412b-be08-516eafd605e7.png">

- 3. 검색 결과
<img width="800" alt="image" src="https://user-images.githubusercontent.com/76866502/184531010-eb00664f-e29e-4c66-a5c6-e02bad4a5274.png">


