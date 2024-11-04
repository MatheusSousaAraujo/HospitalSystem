-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema HospitalSystem
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema HospitalSystem
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `HospitalSystem` DEFAULT CHARACTER SET utf8 ;
USE `HospitalSystem` ;

-- -----------------------------------------------------
-- Table `HospitalSystem`.`Paciente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`Paciente` (
  `idPaciente` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `fone1` VARCHAR(13) NULL,
  `fone2` VARCHAR(13) NULL,
  `email` VARCHAR(45) NULL,
  `cpfCnpj` VARCHAR(15) NULL,
  `rgInscricaoEstadual` VARCHAR(20) NULL,
  `dataCadastro` DATE NULL,
  `cep` VARCHAR(8) NULL,
  `cidade` VARCHAR(45) NULL,
  `bairro` VARCHAR(45) NULL,
  `logradouro` VARCHAR(45) NULL,
  `complemento` VARCHAR(80) NULL,
  `tipoSanguineo` VARCHAR(4) NULL,
  `sexo` VARCHAR(1) NULL,
  `nomeSocial` VARCHAR(45) NULL,
  `status` VARCHAR(15) NULL,
  PRIMARY KEY (`idPaciente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HospitalSystem`.`Medico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`Medico` (
  `idMedico` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `fone1` VARCHAR(13) NULL,
  `fone2` VARCHAR(13) NULL,
  `email` VARCHAR(45) NULL,
  `cpfCnpj` VARCHAR(15) NULL,
  `rgInscricaoEstadual` VARCHAR(20) NULL,
  `dataCadastro` DATE NULL,
  `cep` VARCHAR(8) NULL,
  `cidade` VARCHAR(45) NULL,
  `bairro` VARCHAR(45) NULL,
  `logradouro` VARCHAR(45) NULL,
  `complemento` VARCHAR(80) NULL,
  `crm` VARCHAR(20) NULL,
  `sexo` VARCHAR(1) NULL,
  `nomeSocial` VARCHAR(45) NULL,
  `login` VARCHAR(45) NULL,
  `senha` VARCHAR(45) NULL,
  `status` VARCHAR(15) NULL,
  PRIMARY KEY (`idMedico`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HospitalSystem`.`Enfermeiro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`Enfermeiro` (
  `idEnfermeiro` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `fone1` VARCHAR(13) NULL,
  `fone2` VARCHAR(13) NULL,
  `email` VARCHAR(45) NULL,
  `cpfCnpj` VARCHAR(15) NULL,
  `rgInscricaoEstadual` VARCHAR(20) NULL,
  `dataCadastro` DATE NULL,
  `cep` VARCHAR(8) NULL,
  `cidade` VARCHAR(45) NULL,
  `bairro` VARCHAR(45) NULL,
  `logradouro` VARCHAR(45) NULL,
  `complemento` VARCHAR(80) NULL,
  `cre` VARCHAR(20) NULL,
  `sexo` VARCHAR(1) NULL,
  `nomeSocial` VARCHAR(45) NULL,
  `login` VARCHAR(45) NULL,
  `senha` VARCHAR(45) NULL,
  `status` VARCHAR(15) NULL,
  PRIMARY KEY (`idEnfermeiro`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HospitalSystem`.`Farmaceutico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`Farmaceutico` (
  `idFarmaceutico` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `fone1` VARCHAR(13) NULL,
  `fone2` VARCHAR(13) NULL,
  `email` VARCHAR(45) NULL,
  `cpfCnpj` VARCHAR(15) NULL,
  `rgInscricaoEstadual` VARCHAR(20) NULL,
  `dataCadastro` DATE NULL,
  `cep` VARCHAR(8) NULL,
  `cidade` VARCHAR(45) NULL,
  `bairro` VARCHAR(45) NULL,
  `logradouro` VARCHAR(45) NULL,
  `complemento` VARCHAR(80) NULL,
  `crm` VARCHAR(20) NULL,
  `sexo` VARCHAR(1) NULL,
  `nomeSocial` VARCHAR(45) NULL,
  `login` VARCHAR(45) NULL,
  `senha` VARCHAR(45) NULL,
  `status` VARCHAR(15) NULL,
  PRIMARY KEY (`idFarmaceutico`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HospitalSystem`.`Fornecedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`Fornecedor` (
  `idPaciente` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `fone1` VARCHAR(13) NULL,
  `fone2` VARCHAR(13) NULL,
  `email` VARCHAR(45) NULL,
  `cpfCnpj` VARCHAR(15) NULL,
  `rgInscricaoEstadual` VARCHAR(20) NULL,
  `dataCadastro` DATE NULL,
  `cep` VARCHAR(8) NULL,
  `cidade` VARCHAR(45) NULL,
  `bairro` VARCHAR(45) NULL,
  `logradouro` VARCHAR(45) NULL,
  `complemento` VARCHAR(80) NULL,
  `nomeFantasia` VARCHAR(45) NULL,
  `contato` VARCHAR(15) NULL,
  `status` VARCHAR(15) NULL,
  PRIMARY KEY (`idPaciente`))
ENGINE = InnoDB
COMMENT = '																			';


-- -----------------------------------------------------
-- Table `HospitalSystem`.`Jornada`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`Jornada` (
  `idJornada` INT NOT NULL AUTO_INCREMENT,
  `dataInicial` DATE NULL,
  `dataFinal` DATE NULL,
  `cargaHoraria` INT NULL,
  `Medico_idMedico` INT NOT NULL,
  `Enfermeiro_idEnfermeiro` INT NOT NULL,
  `Farmaceutico_idFarmaceutico` INT NOT NULL,
  PRIMARY KEY (`idJornada`, `Medico_idMedico`, `Enfermeiro_idEnfermeiro`, `Farmaceutico_idFarmaceutico`),
  INDEX `fk_Jornada_Medico1_idx` (`Medico_idMedico` ASC) ,
  INDEX `fk_Jornada_Enfermeiro1_idx` (`Enfermeiro_idEnfermeiro` ASC) ,
  INDEX `fk_Jornada_Farmaceutico1_idx` (`Farmaceutico_idFarmaceutico` ASC) ,
  CONSTRAINT `fk_Jornada_Medico1`
    FOREIGN KEY (`Medico_idMedico`)
    REFERENCES `HospitalSystem`.`Medico` (`idMedico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Jornada_Enfermeiro1`
    FOREIGN KEY (`Enfermeiro_idEnfermeiro`)
    REFERENCES `HospitalSystem`.`Enfermeiro` (`idEnfermeiro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Jornada_Farmaceutico1`
    FOREIGN KEY (`Farmaceutico_idFarmaceutico`)
    REFERENCES `HospitalSystem`.`Farmaceutico` (`idFarmaceutico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HospitalSystem`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `login` VARCHAR(45) NULL,
  `senha` VARCHAR(45) NULL,
  `nomeSocial` VARCHAR(45) NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HospitalSystem`.`Atendimento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`Atendimento` (
  `idAtendimento` INT NOT NULL AUTO_INCREMENT,
  `dataHoraAtendimento` DATETIME NULL,
  `pressao` VARCHAR(20) NULL,
  `temperatura` VARCHAR(10) NULL,
  `bpm` VARCHAR(10) NULL,
  `oximetria` FLOAT NULL,
  `historicoDeDoencas` VARCHAR(100) NULL,
  `alergias` VARCHAR(45) NULL,
  `medicacoesEmUso` VARCHAR(45) NULL,
  `anamnese` VARCHAR(45) NULL,
  `tipoDeAtendiemento` VARCHAR(45) NULL,
  `classificacao` VARCHAR(45) NULL,
  `observacao` VARCHAR(100) NULL,
  `status` VARCHAR(15) NULL,
  `Enfermeiro_idEnfermeiro` INT NOT NULL,
  `Usuario_idUsuario` INT NOT NULL,
  `Paciente_idPaciente` INT NOT NULL,
  PRIMARY KEY (`idAtendimento`, `Enfermeiro_idEnfermeiro`, `Usuario_idUsuario`, `Paciente_idPaciente`),
  INDEX `fk_Atendimento_Enfermeiro1_idx` (`Enfermeiro_idEnfermeiro` ASC)  ,
  INDEX `fk_Atendimento_Usuario1_idx` (`Usuario_idUsuario` ASC)  ,
  INDEX `fk_Atendimento_Paciente1_idx` (`Paciente_idPaciente` ASC)  ,
  CONSTRAINT `fk_Atendimento_Enfermeiro1`
    FOREIGN KEY (`Enfermeiro_idEnfermeiro`)
    REFERENCES `HospitalSystem`.`Enfermeiro` (`idEnfermeiro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Atendimento_Usuario1`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `HospitalSystem`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Atendimento_Paciente1`
    FOREIGN KEY (`Paciente_idPaciente`)
    REFERENCES `HospitalSystem`.`Paciente` (`idPaciente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HospitalSystem`.`Internacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`Internacao` (
  `idInternacao` INT NOT NULL AUTO_INCREMENT,
  `dataHoraInternacao` DATETIME NULL,
  `dataHoraAlta` DATETIME NULL,
  `observacao` VARCHAR(100) NULL,
  `status` VARCHAR(15) NULL,
  PRIMARY KEY (`idInternacao`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HospitalSystem`.`Consulta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`Consulta` (
  `idConsulta` INT NOT NULL AUTO_INCREMENT,
  `responsavel` VARCHAR(45) NULL,
  `dataHoraConsulta` DATETIME NULL,
  `anamnese` VARCHAR(45) NULL,
  `diagnostico` VARCHAR(45) NULL,
  `prescricao` VARCHAR(45) NULL,
  `observacoes` VARCHAR(100) NULL,
  `status` VARCHAR(15) NULL,
  `Internacao_idInternacao` INT NOT NULL,
  `Medico_idMedico` INT NOT NULL,
  `Atendimento_idAtendimento` INT NOT NULL,
  PRIMARY KEY (`idConsulta`, `Internacao_idInternacao`, `Medico_idMedico`, `Atendimento_idAtendimento`),
  INDEX `fk_Consulta_Internacao1_idx` (`Internacao_idInternacao` ASC)  ,
  INDEX `fk_Consulta_Medico1_idx` (`Medico_idMedico` ASC)  ,
  INDEX `fk_Consulta_Atendimento1_idx` (`Atendimento_idAtendimento` ASC)  ,
  CONSTRAINT `fk_Consulta_Internacao1`
    FOREIGN KEY (`Internacao_idInternacao`)
    REFERENCES `HospitalSystem`.`Internacao` (`idInternacao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Consulta_Medico1`
    FOREIGN KEY (`Medico_idMedico`)
    REFERENCES `HospitalSystem`.`Medico` (`idMedico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Consulta_Atendimento1`
    FOREIGN KEY (`Atendimento_idAtendimento`)
    REFERENCES `HospitalSystem`.`Atendimento` (`idAtendimento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HospitalSystem`.`Exame`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`Exame` (
  `idExame` INT NOT NULL AUTO_INCREMENT,
  `tituloExame` VARCHAR(45) NULL,
  `tipoExame` VARCHAR(45) NULL,
  `status` VARCHAR(15) NULL,
  PRIMARY KEY (`idExame`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HospitalSystem`.`ConsultaExame`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`ConsultaExame` (
  `idConsultaExame` INT NOT NULL,
  `dataHoraExame` DATETIME NULL,
  `analiseExame` VARCHAR(45) NULL,
  `imagemExame` VARCHAR(45) NULL,
  `status` VARCHAR(15) NULL,
  `Exame_idExame` INT NOT NULL,
  `Consulta_idConsulta` INT NOT NULL,
  `Consulta_Internacao_idInternacao` INT NOT NULL,
  PRIMARY KEY (`idConsultaExame`, `Exame_idExame`, `Consulta_idConsulta`, `Consulta_Internacao_idInternacao`),
  INDEX `fk_ConsultaExame_Exame1_idx` (`Exame_idExame` ASC)  ,
  INDEX `fk_ConsultaExame_Consulta1_idx` (`Consulta_idConsulta` ASC, `Consulta_Internacao_idInternacao` ASC)  ,
  CONSTRAINT `fk_ConsultaExame_Exame1`
    FOREIGN KEY (`Exame_idExame`)
    REFERENCES `HospitalSystem`.`Exame` (`idExame`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ConsultaExame_Consulta1`
    FOREIGN KEY (`Consulta_idConsulta` , `Consulta_Internacao_idInternacao`)
    REFERENCES `HospitalSystem`.`Consulta` (`idConsulta` , `Internacao_idInternacao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HospitalSystem`.`Receita`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`Receita` (
  `idReceita` INT NOT NULL AUTO_INCREMENT,
  `dataHoraReceita` VARCHAR(45) NULL,
  `observacao` VARCHAR(100) NULL,
  `status` VARCHAR(15) NULL,
  `Consulta_idConsulta` INT NOT NULL,
  PRIMARY KEY (`idReceita`, `Consulta_idConsulta`),
  INDEX `fk_Receita_Consulta1_idx` (`Consulta_idConsulta` ASC)  ,
  CONSTRAINT `fk_Receita_Consulta1`
    FOREIGN KEY (`Consulta_idConsulta`)
    REFERENCES `HospitalSystem`.`Consulta` (`idConsulta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HospitalSystem`.`Medicamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`Medicamento` (
  `idMedicamento` INT NOT NULL,
  `descricaoMedicamento` VARCHAR(45) NULL,
  `principioAtivo` VARCHAR(45) NULL,
  `qtdMinima` FLOAT NULL,
  `status` VARCHAR(15) NULL,
  PRIMARY KEY (`idMedicamento`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HospitalSystem`.`ReceitaMedicamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`ReceitaMedicamento` (
  `idReceitaMedicamento` INT NOT NULL AUTO_INCREMENT,
  `prescricao` VARCHAR(100) NULL,
  `status` VARCHAR(15) NULL,
  `Receita_idReceita` INT NOT NULL,
  `Medicamento_idMedicamento` INT NOT NULL,
  PRIMARY KEY (`idReceitaMedicamento`, `Receita_idReceita`, `Medicamento_idMedicamento`),
  INDEX `fk_ReceitaMedicamento_Receita1_idx` (`Receita_idReceita` ASC)  ,
  INDEX `fk_ReceitaMedicamento_Medicamento1_idx` (`Medicamento_idMedicamento` ASC)  ,
  CONSTRAINT `fk_ReceitaMedicamento_Receita1`
    FOREIGN KEY (`Receita_idReceita`)
    REFERENCES `HospitalSystem`.`Receita` (`idReceita`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ReceitaMedicamento_Medicamento1`
    FOREIGN KEY (`Medicamento_idMedicamento`)
    REFERENCES `HospitalSystem`.`Medicamento` (`idMedicamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HospitalSystem`.`Laboratorio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`Laboratorio` (
  `idLaboratorio` INT NOT NULL AUTO_INCREMENT,
  `nomeFantasia` VARCHAR(45) NULL,
  `contato` VARCHAR(45) NULL,
  `status` VARCHAR(15) NULL,
  PRIMARY KEY (`idLaboratorio`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HospitalSystem`.`LaboratorioMedicamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`LaboratorioMedicamento` (
  `idLaboratorioMedicamento` INT NOT NULL AUTO_INCREMENT,
  `codigoBarras` VARCHAR(45) NULL,
  `observacao` VARCHAR(100) NULL,
  `status` VARCHAR(15) NULL,
  `Medicamento_idMedicamento` INT NOT NULL,
  `Laboratorio_idLaboratorio` INT NOT NULL,
  PRIMARY KEY (`idLaboratorioMedicamento`, `Medicamento_idMedicamento`, `Laboratorio_idLaboratorio`),
  INDEX `fk_LaboratorioMedicamento_Medicamento1_idx` (`Medicamento_idMedicamento` ASC)  ,
  INDEX `fk_LaboratorioMedicamento_Laboratorio1_idx` (`Laboratorio_idLaboratorio` ASC)  ,
  CONSTRAINT `fk_LaboratorioMedicamento_Medicamento1`
    FOREIGN KEY (`Medicamento_idMedicamento`)
    REFERENCES `HospitalSystem`.`Medicamento` (`idMedicamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_LaboratorioMedicamento_Laboratorio1`
    FOREIGN KEY (`Laboratorio_idLaboratorio`)
    REFERENCES `HospitalSystem`.`Laboratorio` (`idLaboratorio`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HospitalSystem`.`Lote`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`Lote` (
  `idLote` INT NOT NULL AUTO_INCREMENT,
  `dataHoraMovimento` DATETIME NULL,
  `tipoMovimento` VARCHAR(45) NULL,
  `qtdMedicamento` FLOAT NULL,
  `observacao` VARCHAR(100) NULL,
  `status` VARCHAR(15) NULL,
  `LaboratorioMedicamento_idLaboratorioMedicamento` INT NOT NULL,
  `LaboratorioMedicamento_Medicamento_idMedicamento` INT NOT NULL,
  `LaboratorioMedicamento_Laboratorio_idLaboratorio` INT NOT NULL,
  PRIMARY KEY (`idLote`, `LaboratorioMedicamento_idLaboratorioMedicamento`, `LaboratorioMedicamento_Medicamento_idMedicamento`, `LaboratorioMedicamento_Laboratorio_idLaboratorio`),
  INDEX `fk_Lote_LaboratorioMedicamento1_idx` (`LaboratorioMedicamento_idLaboratorioMedicamento` ASC, `LaboratorioMedicamento_Medicamento_idMedicamento` ASC, `LaboratorioMedicamento_Laboratorio_idLaboratorio` ASC)  ,
  CONSTRAINT `fk_Lote_LaboratorioMedicamento1`
    FOREIGN KEY (`LaboratorioMedicamento_idLaboratorioMedicamento` , `LaboratorioMedicamento_Medicamento_idMedicamento` , `LaboratorioMedicamento_Laboratorio_idLaboratorio`)
    REFERENCES `HospitalSystem`.`LaboratorioMedicamento` (`idLaboratorioMedicamento` , `Medicamento_idMedicamento` , `Laboratorio_idLaboratorio`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HospitalSystem`.`Acompanhante`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`Acompanhante` (
  `idAcompanhante` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `grauParentesco` VARCHAR(45) NULL,
  `cpf` VARCHAR(45) NULL,
  `fone` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `status` VARCHAR(15) NULL,
  PRIMARY KEY (`idAcompanhante`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HospitalSystem`.`Ala`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`Ala` (
  `idAla` INT NOT NULL,
  `descricao` VARCHAR(45) NULL,
  `status` VARCHAR(15) NULL,
  PRIMARY KEY (`idAla`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HospitalSystem`.`Quarto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`Quarto` (
  `idQuarto` INT NOT NULL,
  `descricao` VARCHAR(45) NULL,
  `status` VARCHAR(15) NULL,
  `Ala_idAla` INT NOT NULL,
  PRIMARY KEY (`idQuarto`, `Ala_idAla`),
  INDEX `fk_Quarto_Ala1_idx` (`Ala_idAla` ASC)  ,
  CONSTRAINT `fk_Quarto_Ala1`
    FOREIGN KEY (`Ala_idAla`)
    REFERENCES `HospitalSystem`.`Ala` (`idAla`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HospitalSystem`.`Leito`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`Leito` (
  `idLeito` INT NOT NULL,
  `descricao` VARCHAR(45) NULL,
  `status` VARCHAR(15) NULL,
  `Quarto_idQuarto` INT NOT NULL,
  PRIMARY KEY (`idLeito`, `Quarto_idQuarto`),
  INDEX `fk_Leito_Quarto1_idx` (`Quarto_idQuarto` ASC)  ,
  CONSTRAINT `fk_Leito_Quarto1`
    FOREIGN KEY (`Quarto_idQuarto`)
    REFERENCES `HospitalSystem`.`Quarto` (`idQuarto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HospitalSystem`.`InternacaoLeito`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`InternacaoLeito` (
  `idInternacaoLeito` INT NOT NULL AUTO_INCREMENT,
  `dataHoraAlocacao` DATETIME NULL,
  `dataHoraDesocupacao` DATETIME NULL,
  `status` VARCHAR(15) NULL,
  `Acompanhante_idAcompanhante` INT NOT NULL,
  `Leito_idLeito` INT NOT NULL,
  `Internacao_idInternacao` INT NOT NULL,
  PRIMARY KEY (`idInternacaoLeito`, `Acompanhante_idAcompanhante`, `Leito_idLeito`, `Internacao_idInternacao`),
  INDEX `fk_InternacaoLeito_Acompanhante1_idx` (`Acompanhante_idAcompanhante` ASC)  ,
  INDEX `fk_InternacaoLeito_Leito1_idx` (`Leito_idLeito` ASC)  ,
  INDEX `fk_InternacaoLeito_Internacao1_idx` (`Internacao_idInternacao` ASC)  ,
  CONSTRAINT `fk_InternacaoLeito_Acompanhante1`
    FOREIGN KEY (`Acompanhante_idAcompanhante`)
    REFERENCES `HospitalSystem`.`Acompanhante` (`idAcompanhante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_InternacaoLeito_Leito1`
    FOREIGN KEY (`Leito_idLeito`)
    REFERENCES `HospitalSystem`.`Leito` (`idLeito`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_InternacaoLeito_Internacao1`
    FOREIGN KEY (`Internacao_idInternacao`)
    REFERENCES `HospitalSystem`.`Internacao` (`idInternacao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HospitalSystem`.`Prontuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`Prontuario` (
  `idProntuario` INT NOT NULL AUTO_INCREMENT,
  `dataHoraVisita` DATETIME NULL,
  `descricaoVisita` VARCHAR(45) NULL,
  `observacao` VARCHAR(100) NULL,
  `status` VARCHAR(15) NULL,
  `InternacaoLeito_idInternacaoLeito` INT NOT NULL,
  `InternacaoLeito_Acompanhante_idAcompanhante` INT NOT NULL,
  `InternacaoLeito_Leito_idLeito` INT NOT NULL,
  `Medico_idMedico` INT NOT NULL,
  `Enfermeiro_idEnfermeiro` INT NOT NULL,
  PRIMARY KEY (`idProntuario`, `InternacaoLeito_idInternacaoLeito`, `InternacaoLeito_Acompanhante_idAcompanhante`, `InternacaoLeito_Leito_idLeito`, `Medico_idMedico`, `Enfermeiro_idEnfermeiro`),
  INDEX `fk_Prontuario_InternacaoLeito1_idx` (`InternacaoLeito_idInternacaoLeito` ASC, `InternacaoLeito_Acompanhante_idAcompanhante` ASC, `InternacaoLeito_Leito_idLeito` ASC)  ,
  INDEX `fk_Prontuario_Medico1_idx` (`Medico_idMedico` ASC)  ,
  INDEX `fk_Prontuario_Enfermeiro1_idx` (`Enfermeiro_idEnfermeiro` ASC)  ,
  CONSTRAINT `fk_Prontuario_InternacaoLeito1`
    FOREIGN KEY (`InternacaoLeito_idInternacaoLeito` , `InternacaoLeito_Acompanhante_idAcompanhante` , `InternacaoLeito_Leito_idLeito`)
    REFERENCES `HospitalSystem`.`InternacaoLeito` (`idInternacaoLeito` , `Acompanhante_idAcompanhante` , `Leito_idLeito`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Prontuario_Medico1`
    FOREIGN KEY (`Medico_idMedico`)
    REFERENCES `HospitalSystem`.`Medico` (`idMedico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Prontuario_Enfermeiro1`
    FOREIGN KEY (`Enfermeiro_idEnfermeiro`)
    REFERENCES `HospitalSystem`.`Enfermeiro` (`idEnfermeiro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HospitalSystem`.`AcompanhanteInternacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`AcompanhanteInternacao` (
  `idAcompanhanteInternacao` INT NOT NULL,
  `dataEntrada` DATETIME NULL,
  `dataSaida` DATETIME NULL,
  `observacao` VARCHAR(100) NULL,
  `status` VARCHAR(15) NULL,
  `InternacaoLeito_idInternacaoLeito` INT NOT NULL,
  `Acompanhante_idAcompanhante` INT NOT NULL,
  PRIMARY KEY (`idAcompanhanteInternacao`, `InternacaoLeito_idInternacaoLeito`, `Acompanhante_idAcompanhante`),
  INDEX `fk_AcompanhanteInternacao_InternacaoLeito1_idx` (`InternacaoLeito_idInternacaoLeito` ASC)  ,
  INDEX `fk_AcompanhanteInternacao_Acompanhante1_idx` (`Acompanhante_idAcompanhante` ASC)  ,
  CONSTRAINT `fk_AcompanhanteInternacao_InternacaoLeito1`
    FOREIGN KEY (`InternacaoLeito_idInternacaoLeito`)
    REFERENCES `HospitalSystem`.`InternacaoLeito` (`idInternacaoLeito`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_AcompanhanteInternacao_Acompanhante1`
    FOREIGN KEY (`Acompanhante_idAcompanhante`)
    REFERENCES `HospitalSystem`.`Acompanhante` (`idAcompanhante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HospitalSystem`.`MovimentoMedicamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HospitalSystem`.`MovimentoMedicamento` (
  `idMovimentoMedicamento` INT NOT NULL AUTO_INCREMENT,
  `dataHoraMovimento` DATETIME NULL,
  `tipoMovimento` VARCHAR(45) NULL,
  `qtdMedicamento` FLOAT NULL,
  `observacao` VARCHAR(100) NULL,
  `status` VARCHAR(15) NULL,
  `Lote_idLote` INT NOT NULL,
  `Lote_LaboratorioMedicamento_idLaboratorioMedicamento` INT NOT NULL,
  `Lote_LaboratorioMedicamento_Medicamento_idMedicamento` INT NOT NULL,
  `Lote_LaboratorioMedicamento_Laboratorio_idLaboratorio` INT NOT NULL,
  `Prontuario_idProntuario` INT NOT NULL,
  `Prontuario_InternacaoLeito_idInternacaoLeito` INT NOT NULL,
  `Prontuario_InternacaoLeito_Acompanhante_idAcompanhante` INT NOT NULL,
  `Prontuario_InternacaoLeito_Leito_idLeito` INT NOT NULL,
  `Prontuario_Medico_idMedico` INT NOT NULL,
  `Prontuario_Enfermeiro_idEnfermeiro` INT NOT NULL,
  `ReceitaMedicamento_idReceitaMedicamento` INT NOT NULL,
  `ReceitaMedicamento_Receita_idReceita` INT NOT NULL,
  `ReceitaMedicamento_Medicamento_idMedicamento` INT NOT NULL,
  PRIMARY KEY (`idMovimentoMedicamento`, `Lote_idLote`, `Lote_LaboratorioMedicamento_idLaboratorioMedicamento`, `Lote_LaboratorioMedicamento_Medicamento_idMedicamento`, `Lote_LaboratorioMedicamento_Laboratorio_idLaboratorio`, `Prontuario_idProntuario`, `Prontuario_InternacaoLeito_idInternacaoLeito`, `Prontuario_InternacaoLeito_Acompanhante_idAcompanhante`, `Prontuario_InternacaoLeito_Leito_idLeito`, `Prontuario_Medico_idMedico`, `Prontuario_Enfermeiro_idEnfermeiro`, `ReceitaMedicamento_idReceitaMedicamento`, `ReceitaMedicamento_Receita_idReceita`, `ReceitaMedicamento_Medicamento_idMedicamento`),
  INDEX `fk_MovimentoMedicamento_Lote1_idx` (`Lote_idLote` ASC, `Lote_LaboratorioMedicamento_idLaboratorioMedicamento` ASC, `Lote_LaboratorioMedicamento_Medicamento_idMedicamento` ASC, `Lote_LaboratorioMedicamento_Laboratorio_idLaboratorio` ASC)  ,
  INDEX `fk_MovimentoMedicamento_Prontuario1_idx` (`Prontuario_idProntuario` ASC, `Prontuario_InternacaoLeito_idInternacaoLeito` ASC, `Prontuario_InternacaoLeito_Acompanhante_idAcompanhante` ASC, `Prontuario_InternacaoLeito_Leito_idLeito` ASC, `Prontuario_Medico_idMedico` ASC, `Prontuario_Enfermeiro_idEnfermeiro` ASC)  ,
  INDEX `fk_MovimentoMedicamento_ReceitaMedicamento1_idx` (`ReceitaMedicamento_idReceitaMedicamento` ASC, `ReceitaMedicamento_Receita_idReceita` ASC, `ReceitaMedicamento_Medicamento_idMedicamento` ASC)  ,
  CONSTRAINT `fk_MovimentoMedicamento_Lote1`
    FOREIGN KEY (`Lote_idLote` , `Lote_LaboratorioMedicamento_idLaboratorioMedicamento` , `Lote_LaboratorioMedicamento_Medicamento_idMedicamento` , `Lote_LaboratorioMedicamento_Laboratorio_idLaboratorio`)
    REFERENCES `HospitalSystem`.`Lote` (`idLote` , `LaboratorioMedicamento_idLaboratorioMedicamento` , `LaboratorioMedicamento_Medicamento_idMedicamento` , `LaboratorioMedicamento_Laboratorio_idLaboratorio`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_MovimentoMedicamento_Prontuario1`
    FOREIGN KEY (`Prontuario_idProntuario` , `Prontuario_InternacaoLeito_idInternacaoLeito` , `Prontuario_InternacaoLeito_Acompanhante_idAcompanhante` , `Prontuario_InternacaoLeito_Leito_idLeito` , `Prontuario_Medico_idMedico` , `Prontuario_Enfermeiro_idEnfermeiro`)
    REFERENCES `HospitalSystem`.`Prontuario` (`idProntuario` , `InternacaoLeito_idInternacaoLeito` , `InternacaoLeito_Acompanhante_idAcompanhante` , `InternacaoLeito_Leito_idLeito` , `Medico_idMedico` , `Enfermeiro_idEnfermeiro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_MovimentoMedicamento_ReceitaMedicamento1`
    FOREIGN KEY (`ReceitaMedicamento_idReceitaMedicamento` , `ReceitaMedicamento_Receita_idReceita` , `ReceitaMedicamento_Medicamento_idMedicamento`)
    REFERENCES `HospitalSystem`.`ReceitaMedicamento` (`idReceitaMedicamento` , `Receita_idReceita` , `Medicamento_idMedicamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
