package com.zydcc.zrdc.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.zydcc.zrdc.model.dic.BZLXDM;
import com.zydcc.zrdc.model.dic.DLTB;
import com.zydcc.zrdc.model.dic.BSLXDM;
import com.zydcc.zrdc.model.dic.BZGZZDDM;
import com.zydcc.zrdc.model.bean.ProjectFile;
import com.zydcc.zrdc.model.bean.Project;
import com.zydcc.zrdc.model.bean.Layer;

import com.zydcc.zrdc.greendao.BZLXDMDao;
import com.zydcc.zrdc.greendao.DLTBDao;
import com.zydcc.zrdc.greendao.BSLXDMDao;
import com.zydcc.zrdc.greendao.BZGZZDDMDao;
import com.zydcc.zrdc.greendao.ProjectFileDao;
import com.zydcc.zrdc.greendao.ProjectDao;
import com.zydcc.zrdc.greendao.LayerDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig bZLXDMDaoConfig;
    private final DaoConfig dLTBDaoConfig;
    private final DaoConfig bSLXDMDaoConfig;
    private final DaoConfig bZGZZDDMDaoConfig;
    private final DaoConfig projectFileDaoConfig;
    private final DaoConfig projectDaoConfig;
    private final DaoConfig layerDaoConfig;

    private final BZLXDMDao bZLXDMDao;
    private final DLTBDao dLTBDao;
    private final BSLXDMDao bSLXDMDao;
    private final BZGZZDDMDao bZGZZDDMDao;
    private final ProjectFileDao projectFileDao;
    private final ProjectDao projectDao;
    private final LayerDao layerDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        bZLXDMDaoConfig = daoConfigMap.get(BZLXDMDao.class).clone();
        bZLXDMDaoConfig.initIdentityScope(type);

        dLTBDaoConfig = daoConfigMap.get(DLTBDao.class).clone();
        dLTBDaoConfig.initIdentityScope(type);

        bSLXDMDaoConfig = daoConfigMap.get(BSLXDMDao.class).clone();
        bSLXDMDaoConfig.initIdentityScope(type);

        bZGZZDDMDaoConfig = daoConfigMap.get(BZGZZDDMDao.class).clone();
        bZGZZDDMDaoConfig.initIdentityScope(type);

        projectFileDaoConfig = daoConfigMap.get(ProjectFileDao.class).clone();
        projectFileDaoConfig.initIdentityScope(type);

        projectDaoConfig = daoConfigMap.get(ProjectDao.class).clone();
        projectDaoConfig.initIdentityScope(type);

        layerDaoConfig = daoConfigMap.get(LayerDao.class).clone();
        layerDaoConfig.initIdentityScope(type);

        bZLXDMDao = new BZLXDMDao(bZLXDMDaoConfig, this);
        dLTBDao = new DLTBDao(dLTBDaoConfig, this);
        bSLXDMDao = new BSLXDMDao(bSLXDMDaoConfig, this);
        bZGZZDDMDao = new BZGZZDDMDao(bZGZZDDMDaoConfig, this);
        projectFileDao = new ProjectFileDao(projectFileDaoConfig, this);
        projectDao = new ProjectDao(projectDaoConfig, this);
        layerDao = new LayerDao(layerDaoConfig, this);

        registerDao(BZLXDM.class, bZLXDMDao);
        registerDao(DLTB.class, dLTBDao);
        registerDao(BSLXDM.class, bSLXDMDao);
        registerDao(BZGZZDDM.class, bZGZZDDMDao);
        registerDao(ProjectFile.class, projectFileDao);
        registerDao(Project.class, projectDao);
        registerDao(Layer.class, layerDao);
    }
    
    public void clear() {
        bZLXDMDaoConfig.clearIdentityScope();
        dLTBDaoConfig.clearIdentityScope();
        bSLXDMDaoConfig.clearIdentityScope();
        bZGZZDDMDaoConfig.clearIdentityScope();
        projectFileDaoConfig.clearIdentityScope();
        projectDaoConfig.clearIdentityScope();
        layerDaoConfig.clearIdentityScope();
    }

    public BZLXDMDao getBZLXDMDao() {
        return bZLXDMDao;
    }

    public DLTBDao getDLTBDao() {
        return dLTBDao;
    }

    public BSLXDMDao getBSLXDMDao() {
        return bSLXDMDao;
    }

    public BZGZZDDMDao getBZGZZDDMDao() {
        return bZGZZDDMDao;
    }

    public ProjectFileDao getProjectFileDao() {
        return projectFileDao;
    }

    public ProjectDao getProjectDao() {
        return projectDao;
    }

    public LayerDao getLayerDao() {
        return layerDao;
    }

}