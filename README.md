# DeadLockForTest

Um deadlock é uma circunstância onde um conjunto de processos é bloqueado porque ele está segurando um recurso que espera por outro processo que o outro espera pelo primeiro.
Nessa situação na computação em um ou mais processos não conseguem seguir suas atividades pois outro processo está aguardando a liberação do sistema.
Um prático exemplo, quando dois bondinhos estão vindo em direção um ao outro pelo mesmo trilho e há somente um, nenhum dos dois bondinhos podem se mexer uma vez que estejam um na frente do outro, esse é um grande exemplo prático de como funciona o deadlock.
O Sistema Operacional tem algumas regras de como ele utiliza os recursos, sendo elas uma solicitação, depois aloca o recurso para assim depois dessas premissas liberar o recurso para uso.
Pode ocorrer um problema quando existem dois ou mais processos que guardam alguns recursos e esperam por recursos armazenados por outros. 