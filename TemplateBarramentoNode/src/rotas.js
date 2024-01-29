const express = require('express');
const router = express();
const serv = require('./services/service')

router.use(express.json());
router.use(express.urlencoded({extended:true}));


router.get('/',(req, resp)=>{
     serv.efetuaBusca().then((dados)=>{
        resp.status(200).send(dados)
    })   
})

router.get('/comParametro',(req, resp)=>{
   serv.efetuaBuscaComParametro(req.query.id).then((dados)=>{
      resp.status(200).send(dados)
  })
   
})
router.post('/comBody',(req, resp)=>{
   serv.efetuaBuscaComBody(req.body).then((dados)=>{
      resp.status(200).send(dados)
  })
    
})

module.exports=router;
