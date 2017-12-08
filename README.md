
# swallow
## 后台：<br>
   #### SpringMVC<br>
   #### Mybatis<br>
   #### Freemarker<br>
   #### Shiro<br>
   #### MybatisPlus<br>
   #### Druid<br>
   #### Mysql<br>
   #### FastJSON<br>
   #### Redis<br>
   #### RabbitMQ<br>
   ***
## 前端：<br>
   #### 整体：easyui和ace admin<br>
   #### 文件上传：Dropzone.js   or  Web Uploader<br>
   #### 日历：calendar<br>
   #### 弹窗：layer<br>
   #### 消息提示：toarst
***


## 开发日志<br>
- 2017.8.22 添加Redis缓存、测试实例和安全加密工具类	add by cy

- 2017.8.23 mybatis添加mapperxml、grid修改下拉框bug	add by cy

- 2017.8.24 添加BaseEntity以及相应的数据库存储	add by cy

- 2017.8.24 添加用户登录记录，修改获取IP的类	add by cy

- 2017.8.25 添加用户登录记录查询查看，查看功能还需修改，以使封装的easyui框架适应field.option这种格式的属性
		   发现分页查询时#BUG001  在列表页点击下一页之后再次点击查询，查询的数据不能被赋值，当第二次点击查询的时候可以正常的显示。目前暂时找不到问题出在哪，
		   服务端返回的数据是正常的，应该是数据绑定的时候出问题了。但是如果不点击下一页，可以正常工作	add by cy
		   
- 2017.8.24 grid修改基本完成，calendar还需完善	add by cy

- 2017.9.01 calendar日程管理基本完成，添加文件上传模块	add by cy

- 2017.9.17 添加shiro权限控制，权限分配尚未完成	  add by cy

- 2017.9.20 权限配置基本完成，无权限提示还需完善	add by cy

- 2017.9.22 用户密码添加md5加密，修改获取当前用户名的基类方法，json添加msg变量，修复登陆第一次点击不跳转	add by cy

- 2017.9.23 添加JsonUtil工具类，添加fastjson，初步出完善权限拦截器，还待优化	add by cy		 

- 2017.9.24 shiro权限异常返回json，权限配置完成	add by cy

- 2017.9.29 shiro登录全部完成	add by cy

- 2017.9.30 集成shiro之后，去除之前的默认的拦截器	add by cy

- 2017.9.30 tabs菜单，双击事件   add  by  zyj

- 2017.10.1 持久层集成MP,修改所有的持久层方法，修改业务层接口名称   add  by  cy

- 2017.10.8 添加权限、角色管理   add  by  cy

- 2017.10.9 添加权限、角色的中文名称字段，添加建库sql，grid模板添加列的hidden   add  by  cy

- 2017.10.10 集成druid数据源，添加用户锁定功能   add  by  cy

- 2017.10.11 去掉启动类的多余备注，修改登录页样式 ，主页样式修改  add  by  cy

- 2017.10.15 添加用户关联角色，角色关联角色功能  add  by  cy

- 2017.10.16 修改shiro的权限控制BUG add  by  cy

- 2017.10.17 查询结果的List中的bean中有变量是null使用@JsonInclude(JsonInclude.Include.NON_NULL)排除,grid页面加载优化 add  by  cy

- 2017.10.22 STORY14：页面管理添加用户锁定/解锁功能,STORY16：系统菜单的存储优化（决定放入数据库）   add  by  cySTORY: 添加MP代码生成器

- 2017.10.28 STORY20：添加MP代码生成器   add  by  cy

- 2017.11.05 STORY21：集成RabbitMQ，并且将插入登录信息放到消息队列实现   add  by  cy

- 2017.11.06 集成activiti环境 add  by  cy

- 2017.11.26 用户添加邮件字段，集成邮件服务（还未测试） add  by  cy

- 2017.11.29 修复用户信息修改bug add  by  cy

- 2017.12.1 消息队列实现用户注册邮件发送管理员提示激活，STORY24: 使用定时器，定时向管理员汇报系统情况(具体发送内容需要完善) add  by  cy	

- 2017.12.8 activiti文件部署初步完成，还未测试  add  by  cy

