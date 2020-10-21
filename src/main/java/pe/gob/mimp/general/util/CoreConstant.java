/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.util;

/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Copyright (C) 2018 Ministerio de la Mujer y Poblaciones Vulnerables (Lima -
 * Peru) DIRECCION GENERAL DE FAMILIA Y COMUNIDAD DIRECCION DE BENEFICENCIA
 * PUBLICAS PROYECTO SISBEN
 *
 * All rights reserved. Used by permission This software is the confidential and
 * proprietary information of MIMP ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with MIMP.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *
 */
/**
 * @objetivo: Contener constantes que son usadas en el sistema
 * @autor: Ing. Oscar Mateo
 * @fecha: 01/03/2018
 *
 * ------------------------------------------------------------------------
 * Modificaciones Fecha Nombre Descripción
 * ------------------------------------------------------------------------
 *
 */
public final class CoreConstant {

    public static final String RESULT_FAILURE = "FAILURE";
    public static final String RESULT_SUCCESS = "SUCCESS";

    public static final String LOGGED_USER = "LOGGED_USER";

    public static final Integer STATUS_ACTIVE = 1;
    public static final Integer STATUS_INACTIVE = 0;

    public static final String DATA_ALL = "TODOS";

    public static final String ACTIVE_YES = "S";
    public static final String ACTIVE_NOT = "N";

    public static final String S = "S";
    public static final String N = "N";

    public static final String BLANCO = " ";
    public static final String VACIO = "";

    public static final String OPERATION_NEW = "OPERATION_NEW";
    public static final String OPERATION_EDIT = "OPERATION_EDIT";
    public static final String OPERATION_VIEW = "OPERATION_VIEW";
    public static final String OPERATION_DELETE = "OPERATION_DELETE";

    public static final String TIPO_MENSAJE_ALERTA = "TIPO_MENSAJE_ALERTA";
    public static final String TIPO_MENSAJE_ERROR = "TIPO_MENSAJE_ERROR";
    public static final String TIPO_MENSAJE_INFO = "TIPO_MENSAJE_INFO";

    public static final String SITUACION_MENSAJE_EN_ESPERA = "SITUACION_MENSAJE_EN_ESPERA";
    public static final String SITUACION_MENSAJE_ENVIANDO = "SITUACION_MENSAJE_ENVIANDO";
    public static final String SITUACION_MENSAJE_RECIBIDO = "SITUACION_MENSAJE_RECIBIDO";
    public static final String SITUACION_MENSAJE_PROBLEMA = "SITUACION_MENSAJE_PROBLEMA";
    public static final String SITUACION_MENSAJE_NOT_FOUND_MAIL = "SITUACION_MENSAJE_NOT_FOUND_MAIL";

    public static final String FMT_FECHA_DDMMYYYY = "dd/MM/yyyy";

    public static final String CONDITION_OR = "or";
    public static final String CONDITION_AND = "and";
    public static final String SEPARATOR_COMA = ",";
    public static final String SEPARATOR_GUION = "-";
    public static final String SEPARATOR_FOLDER = "/";

    public static final String CODIGO_TODOS = "-1"; // "100";

    public static final String SALTO_MENSAJE = "\n";

    public static final Integer MAX_SIZE_FILE_UPLOAD = 10485760;

    public static final Long LEVEL_ZERO = 0L;

    public static final String URL_FORWARD = "pe.gob.mimp.constant.CoreConstant.URL_FORWARD";

    public static final Long ID_NEGATIVE = -1L;
    public static final Long NUMBER_ZERO = 0L;
    public static final Long CARGO_PADRE_ID = 7L;

    public static final Integer ROL_ESPECIALISTA_SBP = 1;
    public static final Integer ROL_ESPECIALISTA_DIBP = 2;
    public static final Integer ROL_DIRECTOR_SBP = 3;
    public static final Integer ROL_DIRECTOR_DIBP = 4;
    public static final Integer ROL_COORDINADOR_DIBP = 5;
    public static final Integer ROL_ADMINISTRADOR_SISTEMA = 6;

    public static final String URL_LINK_SYSTEM = "URL_LINK_SYSTEM";
    public static final String LINK_PAGE_HOME = "LINK_PAGE_HOME";

    public static final String FOLDER_WORKSPACE_SBP = "RUTA_TRABAJO_SBP";
    public static final String FOLDER_RESOLUCION = "FOLDER_RESOLUCION";
    public static final String FOLDER_CONTRATO = "FOLDER_CONTRATO";

    public static final String MODULO_BENEFICENCIA = "BENEFICENCIA";

    public static final String IS_ASSOCIATE_ENTITY = "IS_ASSOCIATE_ENTITY";
    public static final String IS_ADMINISTRATOR = "IS_ADMINISTRATOR";
    public static final String ENTITY_ASSOCIATE_ID = "ENTITY_ASSOCIATE_ID";
    public static final String AMBITO_ENTITY_ID = "AMBITO_ENTITY_ID";

    public static final String CWS_CONNECT_TIMEOUT = "CWS_CONNECT_TIMEOUT";
    public static final String CWS_REQUEST_TIMEOUT = "CWS_REQUEST_TIMEOUT";
    
    public static final String LOCATE_ES_PE = "es_PE";
  public static final String LOCATE_ES_ES = "es_ES";

    protected CoreConstant() {
        throw new UnsupportedOperationException();
    }
}
