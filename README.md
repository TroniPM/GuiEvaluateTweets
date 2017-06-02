# GuiEvaluateTweet

input example (semi-colon as separator):
01012017 20:54:00;815707677573713920;cicerarocha;sicilia, italia;pt;RT @turquim5: Petrobras...Interesses Ocultos da Lava Jato!!! Assista: https://t.co/kmi3Ovia8F CTL @zcarlosf https://t.co/HWxh7KtRZg

  - Date(dd-MM-yyyy H:m:s): 01012017 20:54:00;
  - Tweet ID: 815707677573713920;
  - Username: cicerarocha;
  - Location: sicilia, italia;
  - Language: pt;
  - Tweet Text: RT @turquim5: Petrobras...Interesses Ocultos da Lava Jato!!! Assista: https://t.co/kmi3Ovia8F CTL @zcarlosf https://t.co/HWxh7KtRZg

output example (semi-colon/comma as separator, choose which one at GUI):
01012017 20:54:00;815707677573713920;cicerarocha;sicilia, italia;pt;RT @turquim5: Petrobras...Interesses Ocultos da Lava Jato!!! Assista: https://t.co/kmi3Ovia8F CTL @zcarlosf https://t.co/HWxh7KtRZg

  - Date(dd-MM-yyyy H:m:s): 01012017 20:54:00;
  - Tweet ID: 815707677573713920;
  - Username: cicerarocha;
  - Location: sicilia, italia;
  - Language: pt;
  - Tweet Text: RT @turquim5: Petrobras...Interesses Ocultos da Lava Jato!!! Assista: https://t.co/kmi3Ovia8F CTL @zcarlosf https://t.co/HWxh7KtRZg
  - Evaluation: neg OR neu OR pos

`The input file MUST have "coletado" on the name. Because of this, the output file will replace "coletado" by "rotulado".`