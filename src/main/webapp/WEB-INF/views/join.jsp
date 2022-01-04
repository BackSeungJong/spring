
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html;charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/main.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
    <title>Document</title>
</head>
<body>

<div class="header">
    <header>
        <nav class="nav">
            <div class="top_nav">
                <ul class="top_nav_list">
                    <li><a href="">주문 조회</a></li>
                    <li><a href="">회원가입</a></li>
                    <li><a href="">로그인</a></li>
                </ul>
            </div>
            <div class="bottom_nav">

                <ul class="bottom_nav_list">
                    <li><img src="media/item.png" height="50px" width="50px"></li>

                    <li class="menu"><strong><a href="http://naver.com">오늘의 추천 옷</a></strong></li>
                    <li>|</li>
                    <li class="menu"><strong><a href="">MEN</a></strong></li>
                    <li class="menu"><strong><a href="">WOMEN</a></strong></li>
                    <li class="menu"><strong><a href="">KIDS</a></strong></li>
                    <li>|</li>
                    <li class="menu"><strong><a href="/board">문의 사항</a></strong></li>
                    <li>|</li>

                    <div class="left_list">
                        <li>
                            <form>
                                <input type="text">
                                <input type="submit" value="검색">
                            </form>
                        </li>
                        <li>
                            <a href=""><img src="https://image.adidas.co.kr/images/adidas/common/cart_DT.png"></a>
                            <strong>0</strong>
                        </li>
                    </div>
                </ul>
            </div>
            <div id="main_img" ><div></div>
        </nav>
    </header>
</div>

<main>
    <a href="javascript:history.back()"><img src="https://image.adidas.co.kr/images/adidas/common/ico_back.jpg"><strong>back</strong></a>
    <h1>JOINPAGE</h1>
    아이디 :<input type="text" id="id">
    비밀번호 :<input type="password" id="pw">
    비밀번호 확인:<input type="password" id="pw2">

    이름 : <input type="text" id="name">
    성별 :
    <select name="" id="gender">
        <option value="1" selected>남자</option>
        <option value="2">여자</option>
    </select>
    휴대폰번호 : <input type="text" name="" id="PN" placeholder="010-xxxx-xxxx">
    이메일 : <input type="text" name="" id="email">
    주소 : <input type="text" name="" id="address">
    <input type="button" value="가입하기" onclick="join()">

    <script src="script/join.js"></script>

</main>
<footer>
    <div class="info">
        <p>쇼핑몰 서울특별시 서초구 서초대로 74길 4, 삼성생명 서초 타워 23층 (06620) 대표자 : 홍길동</p>
        <p>통신판매업신고 : 2007-서울서초-10391  개인정보관리책임자 : 홍둘리  호스팅서비스사업자 : 쇼핑몰</p>
        <p>고객센터 : 1588-1234  이메일 : asdf@shopping.com</p>
        <p>&copy; shopping_mall Korea,</p>
    </div>
</footer>
</body>
</html>