<!--
 * @Author: your name
 * @Date: 2019-12-31 10:16:00
 * @LastEditTime : 2020-01-03 10:27:09
 * @LastEditors  : Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \undefinedd:\Github\毕业设计\Readme.md
 -->
# 毕业设计

## 初步后台文档
### obj
#### 用户对象
##### 属性：
- UID,用户ID  
- Name,用户名 
- Emil,邮箱
- Password,用户密码   
- Imagepath,头像路径  
- Ifadmin,判断管理员 
- Signupdate,注册时间 
- Lastdata,上次登录的时间
- Lastip,上次登录IP   
- Lastsite,上次登录地址   
- Age,年龄    
- Sex,性别    
- Initegral,积分  
#### 用户图片
##### 属性：
- IID,图片ID
- Name,用户名	
- Data,上传时间	
- Path,路径	
- Type_mime,图片类型
- Alt,图片描述
#### 帖子
##### 属性：
- TID,帖子的ID
- Path,帖子的路径
- Article,文章
- UID,Int
- Data,时间
#### 评论
##### 属性：
- PID,评论ID
- TID,帖子ID
- UID,用户ID
- Comment,评论
- Data,时间
- AtPID,回复@的ID
- ReplyID,回复评论的ID
#### 基金
##### 属性：
- JID,基金的ID
- UID,用户的ID
- Data,时间
- Change,变化类型（增长or使用）
- Value,变化值
#### 广告
##### 属性：
- GID,广告的ID
- Path,路径
- IID,图片的路径
### dao
#### 链接
##### 