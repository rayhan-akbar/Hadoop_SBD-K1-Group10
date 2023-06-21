# Hadoop_SBD-K1-Group10

---
## Table of Contents
```
1. Apa itu Hadoop?
2. Tata cara instalasi Hadoop
3. Konfigurasi Hadoop
4. Menjalankan Word Count dengan Hadoop
5. Perbandingan Word Count dengan dan tanpa Hadoop
```
---

## Apa itu Hadoop?

Hadoop adalah kerangka kerja (framework) open-source yang dirancang untuk memproses, menyimpan, dan menganalisis jumlah data besar (big data) secara terdistribusi. Dikembangkan oleh Apache Software Foundation, Hadoop menyediakan solusi untuk mengatasi tantangan dalam pengelolaan dan analisis data yang sangat besar yang tidak dapat ditangani oleh sistem tradisional.

---

## Tata cara instalasi Hadoop.

---

## Konfigurasi Hadoop

Hadoop environment dikonfigurasi dengan mengedit sekumpulan file konfigurasi yaitu :
```
1. bashrc, 
2. hadoop-env.sh 
3. core-site.xml
4. hdfs-site.xml 
5. mapred-site-xml 
6. yarn-site.xml
```
### 1. bashrc

![bashrc](./documentation/bashrc.jpg)

### 2. hadoop-env.sh

![env](./documentation/hadoop-env.jpg)

### 3. core-site.xml

![core-site](./documentation/core-site.jpg)

### 4. hdfs-site.xml

![hdfs-site](./documentation/hdfs-site.jpg)

### 5. mapred-site.xml

![mapred-site](./documentation/mapred-site.jpg)

### 6. yarn-site.xml

![yarn-site](./docs/yarn-site.jpg)

---

## Menjalankan Word Count dengan Hadoop

Langkah-langkah yang perlu dilakukan untuk menjalankan program Word Count dengan Hadoop adalah:
```
1. Memformat NameNode sebelum memulai Hadoop
2. Memulai Hadoop cluster
3. Menempatkan file ujicoba di hadoop
4. Menjalankan program Word Count
5. Mendapatkan hasil Word Count
```

### 1. Memformat NameNode sebelum memulai Hadoop

![namenode-format](./documentation/namenode-format.jpg)

### 2. Memulai Hadoop cluster

![start-cluster](./documentation/start-cluster.jpg)

### 3. Menempatkan file ujicoba di hadoop

![dfs-put](./documentation/dfs-put.jpg)

### 4. Menjalankan program Word Count

![start-WC](./documentation/start-WC.jpg)

### 5. Mendapatkan hasil Word Count

![WC-result](./documentation/WC-result.jpg)

---

## Perbandingan Word Count dengan dan tanpa Hadoop

Spesifikasi sistem untuk eksperimen
```
OS: Ubuntu 20.04 (Virtual Machine)
CPU allocated: 6 CPUs
Base Memory allocated: 8192 GB RAM
```
Langkah-langkah yang perlu dilakukan adalah:
```
1. Menyiapkan program word count dengan Hadoop
2. Menyiapkan program word count tanpa Hadoop
3. Menyiapkan dataset untuk eksperimen
4. Setup Hadoop untuk perbandingan
5. Menjalankan Word Count dengan dan tanpa hadoop untuk masing-masing dataset
6. Melihat grafik perbandingan
```

### Program Word Count dengan Hadoop

![WC-hadoop](./documentation/WC-hadoop.jpg)

### Program Word Count tanpa Hadoop

![WC-java](./documentation/WC-java.jpg)

### Datasets

![dataset-sample](./documentation/dataset-sample.jpg)

### Setup Hadoop untuk perbandingan

![hadoop-setup](./documentation/hadoop-setup.jpg)

### Grafik perbandingan

![grafik-perbandingan](./documentation/grafik-perbandingan.jpg)





