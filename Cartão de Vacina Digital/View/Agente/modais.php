


<div id="pesquisarPOP" class="modal fade" role="dialog">
    <div class="modal-dialog">
        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">Pesquisar População</h4>
       
            </div>
            <div class="modal-body">
                <form method="POST" action="#Visitas">
                    <input type="text" name="campo_pesquisa_pop" autofocus  placeholder="Nome da População" required="" class="form-control my-2"> <br>                   
                    <input type="submit" value="Pesquisar" class="btn btn-success">
                    </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
            </div>
                
        </div>
    </div>
</div>

<div id="sitemodal2" class="modal fade" role="dialog">
    <div class="modal-dialog">
        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Deseja Realmente sair ?</h5>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>
            <div class="modal-body">
                          <a class="btn btn-danger" href="../../Controller/sair.php" role="button">Sim</a>
                            <a class="btn btn-success" href="" data-dismiss="modal" role="button">Não</a>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-dark" data-dismiss="modal">Fechar</button>
            </div>
        </div>
    </div>
</div>

<div class="modal fade" id="sitepdf" role="dialog">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Gerar PDF:</h5>
      </div>
      
      <div class="modal-body">

          <a type="button" class="btn btn btn-primary" target="_blank" href="rotapdf.php">Rota</a>
          <a type="button" class="btn btn-danger" target="_blank"  href="visitapdf.php">Visita</a> 
      </div>

      <div class="modal-footer">
        <button data-dismiss="modal" class="btn btn-dark">Fechar</button>
      </div>
    </div>
  </div>

</div>