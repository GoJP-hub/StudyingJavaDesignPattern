# Builderパターンのノート

## コンセプト
以下の特性を兼ね備えているモノ
- Client（Main）・Director・Builderに分け、それぞれが処理を知らないこと　※互換性を担保する
- Clientでは、①Builder選択の判定処理、②Directorによる利用処理を実装
- Directorでは、①Builderインターフェイスを元に、処理の複合化を行う
- Builderでは、処理の実装を行う

## 補足情報
- オブジェクト生成の際に、Instanceも呼びだしている
