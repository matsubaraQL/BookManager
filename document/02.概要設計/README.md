# 成果物：社内書籍管理システム(方式設計)
====

## Rdb
+ Postgres10にて管理する。
+ "database"には当システム以外からは呼ばれない。
+ プログラムから呼び出す際は「program」(仮)ユーザーからアクセスする。
+ リリース用とテスト用を用意する。ただし開発用はdockerコンテナを利用する。
+ 具体的なテーブル内容については開発時に決める。
+ データベース・アクセスはJavaの部品にて実現する。
+ ドメイン機能を使用する。

## 画面
+ 作成対象から外すとするも、WebApiとのIFは必ず定義する。

## Api
+ Java(jdk10)にて実装する。
+ アプリケーション・サーバーはSpringBootの内蔵Tomcatを使用するとする。
+ 同時アクセスは最大４人を想定するとする。(社内で使用するので)
+ "RESTful API"の考え方を踏襲するとする。
+ 入力値については検証対象とする。

## ユーザ
+ 画面を介してApiを実行する。

## シーケンス図

下記は [Mermaid](https://mermaidjs.github.io/) を使用しています。  
GoogleChromのアプリにて描画しているものをスクショしています。  
Macでのスクショ方法は「shift + command + 4」です。  

### クライアント<->サーバー

![overview image](https://github.com/mabubu0203/BookManager/blob/master/document/02.概要設計/image/01.png?raw=true)

```mermaid
sequenceDiagram
	ユーザ->>画面: 入力  
	画面-->>Api: リクエスト送信  
	Api->>Api: 各種処理
	    loop CRUD
            Api-->>Rdb: 
            Rdb-->>Api: 
	    end
	Api->>Api: 各種処理
	Api-->>画面: レスポンス送信  
	画面->>ユーザ: 描画
```

### 画面遷移図

![overview image](https://github.com/mabubu0203/BookManager/blob/master/document/02.概要設計/image/02.png?raw=true)

```mermaid
graph TD
	A[メニューリンク] -.-> B(検索画面)
	B -->|検索| B
	B -->|1件取得| C(詳細画面)
	C --> D(編集画面)
	D --> E(編集確認画面)
	E -->|更新| F(編集完了画面)
	E -->|削除| F
	F --> B
	A -.-> H(登録申請画面)
	H --> I(登録申請確認画面)
	I -->|登録申請| J(登録申請完了画面)
	A -.-> M(申請許可確認画面)
	M -->|登録許可| N(申請許可完了画面)
	M -->|登録拒否| N
```

