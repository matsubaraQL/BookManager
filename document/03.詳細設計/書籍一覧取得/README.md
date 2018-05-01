# 成果物：書籍一覧取得(詳細設計書)
====

## Api概要
検索条件を指定し、書籍一覧を取得する。  
ソート、ページングには対応しない。

## 処理概要
1. 書籍情報取得(Rdb問い合わせ)
2. レスポンス設定

## シーケンス図

下記は [Mermaid](https://mermaidjs.github.io/) を使用しています。  
GoogleChromのアプリにて描画しているものをスクショしています。  
Macでのスクショ方法は「shift + command + 4」です。  

![overview image](./image/01.png?raw=true)

```mermaid
sequenceDiagram
	ユーザ->>画面: 入力  
	画面-->>Api: リクエスト送信(検索条件)
	
	    loop Read
	        Api-->>Rdb: where 検索条件 like %?%
	        Rdb-->>Api: 書籍情報
	    end
	
	Api-->>画面: レスポンス送信(書籍情報)
	画面->>ユーザ: 描画
```

## Input
+ 書籍ID
+ ISBN
+ 書籍名称

### validation
+ 書籍ID
+ ISBN
+ 書籍名称

## Output
+ 書籍ID
+ 更新回数
+ ISBN
+ 書籍名称