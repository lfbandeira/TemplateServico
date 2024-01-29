const axios = require('axios')
const urlGet = 'http://localhost:8080/api/meuGet';


async function efetuaBusca(){
    const response = await axios.get(urlGet);
     return response.data;
}
async function efetuaBuscaComParametro(id){
    const urlGetComParametro = `http://localhost:8080/api/meuGetComParametro/${id}`;
    const response = await axios.get(urlGetComParametro);
     return response.data;
}
async function efetuaBuscaComBody(obj){
    console.log(obj)
    const resp = await axios.post('http://localhost:8080/api/meuPost',obj);
    return resp.data;
   
}
module.exports={
    efetuaBusca,
    efetuaBuscaComParametro,
    efetuaBuscaComBody
};