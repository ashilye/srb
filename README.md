反向代理
nginx 配置：
1.解压 nginx-1.18.0.zip
2.打开 nginx-1.18.0\conf\nginx.conf
```
    server {
        listen       80;
        server_name  localhost;
     
       # 配置反向代理	--->开始<---
        location ~ /core/ {
	        proxy_pass http://localhost:8110;
        }

        location ~ /sms/ {
	        proxy_pass http://localhost:8120;
        }

        location ~ /oss/ {
	        proxy_pass http://localhost:8130;
        }
     # 配置反向代理	--->结束<---

        #charset koi8-r;

        #access_log  logs/host.access.log  main;

```
3. 启动/停止
   nginx-1.18.0目录下cmd
   
   start nginx.exe   //启动
   nginx.exe -s stop //停止
   nginx.exe -s reload //重新加载