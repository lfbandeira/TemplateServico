const express = require("express");
const router = require("./rotas");
const app = express();
app.use(router);
module.exports = app;
