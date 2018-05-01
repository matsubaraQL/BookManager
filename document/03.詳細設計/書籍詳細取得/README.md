# 成果物：書籍詳細取得(詳細設計書)
====

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
	画面-->>Api: リクエスト送信(書籍ID)
	
	    loop Read
		    Api-->>Rdb: where 書籍ID = ?
	        Rdb-->>Api: 書籍情報
	    end
	
	Api-->>画面: レスポンス送信(書籍情報)
	画面->>ユーザ: 描画
```

## Input
+ 書籍ID

### validation
+ 書籍ID

## Output
+ 書籍ID
+ 更新日時
+ ISBN
+ 書籍名称