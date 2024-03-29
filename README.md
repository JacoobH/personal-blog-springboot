## :bulb: 此项目为项目《个人博客》的后台
前端项目在https://github.com/JacoobH/personal-blog-angular2

<div align="center">
    <a href="https://github.com/JacoobH/personal-blog-angular2"> <img src="https://badgen.net/github/stars/JacoobH/personal-blog-angular2?icon=github&color=4ab8a1"></a>
    <a href="https://github.com/JacoobH/personal-blog-angular2"> <img src="https://badgen.net/github/forks/JacoobH/personal-blog-angular2?icon=github&color=4ab8a1"></a>
</div>

| 系统介绍 |数据库设计|Docker镜像
| :---: | :----: | :----: |
| [:computer:](#computer-系统介绍)  |[:floppy_disk:](#floppy_disk-数据库设计)|[:floppy_disk:](#floppy_disk-Docker镜像)|

## :computer: 系统介绍

本系统采用**Spring Boot**、**Angular**框架技术进行开发，使用Windows10操作系统作为本系统运行需要的软件环境，选用分别选用Spring Boot自带的服务器和NPM服务器进行搭建。打开浏览器（本系统测试浏览器为Chrome浏览器），输入：
http://localhost:4200
### 5.2系统的功能实现
由根据系统用户分析，个人博客的角色主要包含博主、读者和游客，在功能上主要是通过用户权限划分的。 下面将进行功能实现描述。
#### 5.2.1系统登录板块
在登录系统的时候，登录包含的输入项主要是登录名、登录密码，等系统验证全面信息符合规范并且一一对应后，方可成功登录系统，若其中任意一项的数据不正确，那么将被拦截，会弹出用户名或密码错误的橙色提醒框。当所有信息输入符合规范且后台比对数据无误后，进入个人信息界面，登录界面如图5-1所示。
 <div align="center"> <img src="https://github.com/JacoobH/personal-blog-angular2/blob/master/images/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20210310185055.png"/> </div><br>
<div align="center">图5-1登录页面</div><br>

#### 5.2.2系统注册板块
若游客没有可登录的账户则需要注册。其中用户名、密码与再次输入密码为必填项，其中用户名已存在或密码与再次输入的密码不符则注册失败当所有信息输入正确时，进入登录界面，注册界面如图5-2所示。
<div align="center"> <img src="https://github.com/JacoobH/personal-blog-angular2/blob/master/images/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20210310185110.png"/> </div><br>
<div align="center">图5-2注册页面</div><br>

#### 5.2.3共有功能权限
##### 文章列表
文章列表是由文章标题、文章内容的前1000个字符以及发布日期租车的列表项组合而成的，并只显示最近发布的10篇文章，拉到底部后，点击“加载更多”按钮，列表则会在此列表基础上再从后台请求10篇的数据并添加到文章列表中。此文章列表采用了angular-parallax插件，实现了视差效果，使列表更美观。文章列表界面如图5-2所示。

<div align="center"> <img src="https://github.com/JacoobH/personal-blog-angular2/blob/master/images/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20210310185117.png"/> </div><br>
 <div align="center">图5-3 文章列表页面</div><br>


##### 时间轴
时间轴是由文章标题、文章内容的前500个字符以及发布日期租车的列表项组合而成的，并只显示最近发布的20篇文章，拉到底部后，点击“加载更多”按钮，列表则会在此列表基础上再从后台请求10篇的数据并添加到时间轴中。时间轴界面如图5-3所示。
<div align="center"> <img src="https://github.com/JacoobH/personal-blog-angular2/blob/master/images/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20210310185122.png"/> </div><br>
  <div align="center">图5-4 时间轴页面</div><br>


##### 归档
归档由时间归档和标签归档组成、时间归档根据文章发布的年份与月份进行归档，而标签归档则是通过标签筛选文章。归档界面如图5-5所示。
<div align="center"> <img src="https://github.com/JacoobH/personal-blog-angular2/blob/master/images/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20210310185129.png"/> </div><br>

   <div align="center">图5-5 归档页面</div><br>

##### 文章详情页面
通过点击文章列表中的“查看全文”按钮进入文章详情页，文章详情页拥有文章的全部内容信息，文章详情页如图5-6所示。
<div align="center"> <img src="https://github.com/JacoobH/personal-blog-angular2/blob/master/images/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20210310185134.png"/> </div><br>
     <div align="center">图5-6 文章详情页面</div><br>


##### 评论列表页面
文章详情页的底部为该文章的评论列表，可以通过右上方的按钮切换排序方式，默认的排序方式为按点赞数递减排列。按时间排序则为按时间先后排序，最新的评论排在前面。未登录的游客有查看的权限，读者和博主有回复与点赞反对的权限。评论列表如图5-7所示。
<div align="center"> <img src="https://github.com/JacoobH/personal-blog-angular2/blob/master/images/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20210310185139.png"/> </div><br>
  <div align="center">图5-7 评论列表页面</div><br>

#### 5.2.4读者功能权限

##### 个人信息页面
个人信息界面展示了该登录中用户的信息，可以进行用户信息的修改和删除该用户。删除用户会弹出让用户确认的模态框，用户在输入密码后，该用户会被删除，随即跳转到文章列表界面。个人信息界面如图5-8所示。
<div align="center"> <img src="https://github.com/JacoobH/personal-blog-angular2/blob/master/images/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20210310185146.png"/> </div><br>

<div align="center">图5-8 个人信息页面</div><br>

##### 评论页面
用户登陆后即获得读者权限，可以进行评论，评论界面如图5-9所示
<div align="center"> <img src="https://github.com/JacoobH/personal-blog-angular2/blob/master/images/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20210310185151.png"/> </div><br>

 <div align="center">图5-9 评论页面</div><br>


#### 5.2.5博主功能权限
##### 统计信息页面
通过在地址栏键入/dashboard进入管理界面，进入管理界面前会验证登录用户的身份，若为博主则放行，管理界面的首页为统计信息界面，统计文章的浏览数，注册数及其他一些数据，以图标的方式展现，统计信息界面如5-10所示
<div align="center"> <img src="https://github.com/JacoobH/personal-blog-angular2/blob/master/images/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20210310185158.png"/> </div><br>
 <div align="center">图5-10 统计信息页面</div><br>


##### 文章管理页面
通过点击侧边导航栏的“文章管理”进入文章管理界面，搜索栏采用动态搜索，即用户停止输入超过300ms后自动进行搜索，若新的搜索条件与之前的相同，则忽略，若搜索栏为空则切换为无筛选查询，左下角的选择框动态切换每页显示的文章条数，有三个选项，分别为“每页5行”、“每页10行”、“每页20行”满足不同屏幕的需要。增加按钮则直接调转到文章编辑界面，而点击文章列表的条目则跳转到文章编辑界面并切换为修改模式。点击文章条目的操作项中的评论图标则会跳转到该篇文章所关联的评论列表。点击标签图标则会弹出该篇文章所对应的标签模态框，支持标签修改。文章管理界面如5-11所示
<div align="center"> <img src="https://github.com/JacoobH/personal-blog-angular2/blob/master/images/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20210310185203.png"/> </div><br>
 <div align="center">图5-11 文章管理页面</div><br>


##### 评论管理界面
通过点击文章管理的评论图标按钮，进入相应的评论管理界面，评论管理界面如5-12所示
<div align="center"> <img src="https://github.com/JacoobH/personal-blog-angular2/blob/master/images/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20210310185209.png"/> </div><br>

 <div align="center">图5-12 评论管理界面</div><br>


##### 用户管理界面
通过点击侧边导航栏的“用户管理”进入用户管理界面，用户管理界面与文章管理相似，同拥有对用户进行增删改查的操作，不同点在于可以通关点击操作栏的评论图标以查找该名用户的所有评论信息，用户管理界面如5-13所示
<div align="center"> <img src="https://github.com/JacoobH/personal-blog-angular2/blob/master/images/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20210310185214.png"/> </div><br>
 <div align="center">图5-13 用户管理界面</div><br>


##### 文章编辑界面
通过点击侧边导航栏的“文章编辑”按钮进入文章编辑界面，该界面使用了angular-editor插件，提供了富文本编辑器，其图片等二进制文件内容转换为base64编码存储到数据库中。同时使用tag-chips插件实现风格化的标签输入，最多输入5个标签且各个标签使用enter键进行分隔。点击“新标签”按钮会弹出标签模态框，提供此系统中存在的所有标签项，点击添加关联，并允许添加新的标签，文章编辑界面如5-14所示
<div align="center"> <img src="https://github.com/JacoobH/personal-blog-angular2/blob/master/images/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20210310185218.png"/> </div><br>
 <div align="center">图5-14 文章编辑界面</div><br>

## :floppy_disk: 数据库设计 
### mysql安装教程
如下：https://danserlesgens.blogspot.com/2018/03/mysqlzip.html
### 创建表脚本
如下：https://github.com/JacoobH/personal-blog-springboot/tree/master/sql
### 更改application.properties的数据库配置
application.properties在项目中的路径如下/src/main/resources/application.properties

## :floppy_disk: Docker镜像

使用如下命令拉起 镜像
> docker pull chia11/personal-blog-spring

使用run命令启动容器
> docker run -d -p 8080:8080 --name pb-spring personal-blog-spring

关于此镜像，请访问下述地址
https://hub.docker.com/repository/docker/chia11/personal-blog-spring
