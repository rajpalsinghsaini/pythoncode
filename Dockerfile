FROM nginx:latest
RUN apt-get update -y
WORKDIR /usr/share/nginx/html
RUN touch index.html 
RUN echo "Docker file for Jenkins Testing" > index.html
