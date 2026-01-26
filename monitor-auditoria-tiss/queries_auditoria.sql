-- Filtragem para localizar no banco de dados quais os itens cadastrados no grupo de validacao utilizados para regras de grupo de procedimentos --
SELECT SGI.CD_GRUPO, SG.NM_GRUPO, SGI.CD_ITEM, SCI.DS_ITEM
  FROM BASEPROC.SCE_GRUPOS_ITENS sgi, BASEPROC.SCE_CFG_ITENS sci, BASEPROC.SCE_GRUPOS sg
WHERE SGI.CD_ITEM = SCI.CD_ITEM
   AND SGI.CD_GRUPO = 156200025404
   AND SGI.CD_GRUPO = SG.CD_GRUPO
