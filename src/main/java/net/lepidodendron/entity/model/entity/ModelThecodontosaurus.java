package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraThecodontosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelThecodontosaurus extends AdvancedModelBaseExtended {

    private final AdvancedModelRendererExtended Thecodontosaurus;
    private final AdvancedModelRendererExtended Basin;
    private final AdvancedModelRendererExtended HindlimbR;
    private final AdvancedModelRendererExtended KneeR;
    private final AdvancedModelRendererExtended MetatarsalsR;
    private final AdvancedModelRendererExtended PesR;
    private final AdvancedModelRendererExtended HindlimbL;
    private final AdvancedModelRendererExtended KneeL;
    private final AdvancedModelRendererExtended MetatarsalsL;
    private final AdvancedModelRendererExtended PesL;
    private final AdvancedModelRendererExtended Body;
    private final AdvancedModelRendererExtended Chest;
    private final AdvancedModelRendererExtended Breast_CoracoidBristlescrest_r1;
    private final AdvancedModelRendererExtended ForearmR;
    private final AdvancedModelRendererExtended ElbowR;
    private final AdvancedModelRendererExtended ManusR;
    private final AdvancedModelRendererExtended Ungual_r1;
    private final AdvancedModelRendererExtended ForearmL;
    private final AdvancedModelRendererExtended ElbowL;
    private final AdvancedModelRendererExtended ManusL;
    private final AdvancedModelRendererExtended Ungual_r2;
    private final AdvancedModelRendererExtended Neck1;
    private final AdvancedModelRendererExtended Neck_basebristles_r1;
    private final AdvancedModelRendererExtended Neck_base_r1;
    private final AdvancedModelRendererExtended Neck2;
    private final AdvancedModelRendererExtended Neck_bodybristles_r1;
    private final AdvancedModelRendererExtended Neck_body_r1;
    private final AdvancedModelRendererExtended Neck3;
    private final AdvancedModelRendererExtended Cervicalbristles_r1;
    private final AdvancedModelRendererExtended ThroatPouch;
    private final AdvancedModelRendererExtended Throat_pouch_r1;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended maxillaryteeth_r1;
    private final AdvancedModelRendererExtended maxillaryteeth_r2;
    private final AdvancedModelRendererExtended Premaxillaproximal_r1;
    private final AdvancedModelRendererExtended Premaxilladistal_r1;
    private final AdvancedModelRendererExtended Nasalridgedistal_r1;
    private final AdvancedModelRendererExtended Nasalridgeproximal_r1;
    private final AdvancedModelRendererExtended Jaw;
    private final AdvancedModelRendererExtended Dentaryteeth_r1;
    private final AdvancedModelRendererExtended Dentaryteeth_r2;
    private final AdvancedModelRendererExtended Tail1;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended Tail3;
    private final AdvancedModelRendererExtended Caudal_Bodydistal_r1;
    private final AdvancedModelRendererExtended Tail4;
    private final AdvancedModelRendererExtended Caudaldistal_r1;
    private final AdvancedModelRendererExtended Tail5;

    private ModelAnimator animator;

    public ModelThecodontosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Thecodontosaurus = new AdvancedModelRendererExtended(this);
        this.Thecodontosaurus.setRotationPoint(0.0F, 24.0F, 2.0F);


        this.Basin = new AdvancedModelRendererExtended(this);
        this.Basin.setRotationPoint(-0.2F, -24.7F, 0.6F);
        this.Thecodontosaurus.addChild(Basin);
        this.Basin.cubeList.add(new ModelBox(Basin, 48, 0, -2.3F, -0.4F, -0.6F, 5, 8, 8, 0.0F, false));

        this.HindlimbR = new AdvancedModelRendererExtended(this);
        this.HindlimbR.setRotationPoint(-2.3F, 1.6F, 3.1F);
        this.Basin.addChild(HindlimbR);
        this.setRotateAngle(HindlimbR, -0.4538F, 0.0F, 0.0F);
        this.HindlimbR.cubeList.add(new ModelBox(HindlimbR, 31, 50, -1.4F, -0.1F, -2.8F, 3, 10, 6, 0.0F, false));

        this.KneeR = new AdvancedModelRendererExtended(this);
        this.KneeR.setRotationPoint(0.0F, 8.9F, -2.1F);
        this.HindlimbR.addChild(KneeR);
        this.setRotateAngle(KneeR, 0.8727F, 0.0F, 0.0F);
        this.KneeR.cubeList.add(new ModelBox(KneeR, 0, 24, -1.0F, 0.7F, -0.6F, 2, 11, 4, 0.0F, false));

        this.MetatarsalsR = new AdvancedModelRendererExtended(this);
        this.MetatarsalsR.setRotationPoint(0.0F, 11.1F, 2.7F);
        this.KneeR.addChild(MetatarsalsR);
        this.setRotateAngle(MetatarsalsR, -0.6981F, 0.0F, 0.0F);
        this.MetatarsalsR.cubeList.add(new ModelBox(MetatarsalsR, 0, 0, -1.0F, -0.2F, -2.5F, 2, 7, 3, -0.01F, false));

        this.PesR = new AdvancedModelRendererExtended(this);
        this.PesR.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.MetatarsalsR.addChild(PesR);
        this.setRotateAngle(PesR, 0.2967F, 0.0F, 0.0F);
        this.PesR.cubeList.add(new ModelBox(PesR, 44, 63, -1.5F, -1.0F, -5.5F, 3, 2, 6, 0.0F, false));

        this.HindlimbL = new AdvancedModelRendererExtended(this);
        this.HindlimbL.setRotationPoint(2.7F, 1.6F, 3.1F);
        this.Basin.addChild(HindlimbL);
        this.setRotateAngle(HindlimbL, -0.4538F, 0.0F, 0.0F);
        this.HindlimbL.cubeList.add(new ModelBox(HindlimbL, 31, 50, -1.6F, -0.1F, -2.8F, 3, 10, 6, 0.0F, true));

        this.KneeL = new AdvancedModelRendererExtended(this);
        this.KneeL.setRotationPoint(0.0F, 8.9F, -2.1F);
        this.HindlimbL.addChild(KneeL);
        this.setRotateAngle(KneeL, 0.8727F, 0.0F, 0.0F);
        this.KneeL.cubeList.add(new ModelBox(KneeL, 0, 24, -1.0F, 0.7F, -0.6F, 2, 11, 4, 0.0F, true));

        this.MetatarsalsL = new AdvancedModelRendererExtended(this);
        this.MetatarsalsL.setRotationPoint(0.0F, 11.1F, 2.7F);
        this.KneeL.addChild(MetatarsalsL);
        this.setRotateAngle(MetatarsalsL, -0.6981F, 0.0F, 0.0F);
        this.MetatarsalsL.cubeList.add(new ModelBox(MetatarsalsL, 0, 0, -1.0F, -0.2F, -2.5F, 2, 7, 3, -0.01F, true));

        this.PesL = new AdvancedModelRendererExtended(this);
        this.PesL.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.MetatarsalsL.addChild(PesL);
        this.setRotateAngle(PesL, 0.2967F, 0.0F, 0.0F);
        this.PesL.cubeList.add(new ModelBox(PesL, 44, 63, -1.5F, -1.0F, -5.5F, 3, 2, 6, 0.0F, true));

        this.Body = new AdvancedModelRendererExtended(this);
        this.Body.setRotationPoint(0.2F, 2.0F, -0.6F);
        this.Basin.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -3.0F, -2.7F, -13.6F, 6, 9, 14, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 46, 29, -2.5F, 6.2F, -13.0F, 5, 1, 11, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 44, 0.0F, -4.7F, -13.8F, 0, 2, 6, 0.0F, false));

        this.Chest = new AdvancedModelRendererExtended(this);
        this.Chest.setRotationPoint(0.0F, -1.0F, -13.0F);
        this.Body.addChild(Chest);
        this.Chest.cubeList.add(new ModelBox(Chest, 0, 61, -2.5F, -1.4F, -5.0F, 5, 8, 5, 0.0F, false));
        this.Chest.cubeList.add(new ModelBox(Chest, 48, 17, -1.5F, 6.2F, -4.8F, 3, 1, 5, 0.0F, false));

        this.Breast_CoracoidBristlescrest_r1 = new AdvancedModelRendererExtended(this);
        this.Breast_CoracoidBristlescrest_r1.setRotationPoint(0.0F, -1.4F, -1.0F);
        this.Chest.addChild(Breast_CoracoidBristlescrest_r1);
        this.setRotateAngle(Breast_CoracoidBristlescrest_r1, 0.2269F, 0.0F, 0.0F);
        this.Breast_CoracoidBristlescrest_r1.cubeList.add(new ModelBox(Breast_CoracoidBristlescrest_r1, 36, 70, 0.0F, -1.9F, -3.6F, 0, 2, 4, 0.0F, false));

        this.ForearmR = new AdvancedModelRendererExtended(this);
        this.ForearmR.setRotationPoint(-2.5F, 4.1F, -3.4F);
        this.Chest.addChild(ForearmR);
        this.setRotateAngle(ForearmR, 0.6109F, 0.0F, 0.0F);
        this.ForearmR.cubeList.add(new ModelBox(ForearmR, 63, 63, -0.9F, 0.1F, -1.2F, 2, 5, 3, 0.0F, false));

        this.ElbowR = new AdvancedModelRendererExtended(this);
        this.ElbowR.setRotationPoint(0.0F, 4.5F, 0.4F);
        this.ForearmR.addChild(ElbowR);
        this.setRotateAngle(ElbowR, -0.829F, 0.0F, 0.0F);
        this.ElbowR.cubeList.add(new ModelBox(ElbowR, 46, 29, -1.0F, -0.4271F, -1.5839F, 2, 5, 3, 0.0F, false));

        this.ManusR = new AdvancedModelRendererExtended(this);
        this.ManusR.setRotationPoint(-0.3F, 4.2729F, 0.5161F);
        this.ElbowR.addChild(ManusR);
        this.setRotateAngle(ManusR, 0.0F, 0.0F, -0.2182F);
        this.ManusR.cubeList.add(new ModelBox(ManusR, 68, 27, -0.7F, 0.1F, -2.0F, 1, 5, 3, 0.0F, false));

        this.Ungual_r1 = new AdvancedModelRendererExtended(this);
        this.Ungual_r1.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.ManusR.addChild(Ungual_r1);
        this.setRotateAngle(Ungual_r1, 0.6156F, 0.5713F, -0.2713F);
        this.Ungual_r1.cubeList.add(new ModelBox(Ungual_r1, 71, 60, -0.8F, 0.0F, -3.0F, 1, 2, 3, 0.0F, false));

        this.ForearmL = new AdvancedModelRendererExtended(this);
        this.ForearmL.setRotationPoint(2.5F, 4.1F, -3.4F);
        this.Chest.addChild(ForearmL);
        this.setRotateAngle(ForearmL, 0.6109F, 0.0F, 0.0F);
        this.ForearmL.cubeList.add(new ModelBox(ForearmL, 63, 63, -1.1F, 0.1F, -1.2F, 2, 5, 3, 0.0F, true));

        this.ElbowL = new AdvancedModelRendererExtended(this);
        this.ElbowL.setRotationPoint(0.0F, 4.5F, 0.4F);
        this.ForearmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, -0.829F, 0.0F, 0.0F);
        this.ElbowL.cubeList.add(new ModelBox(ElbowL, 46, 29, -1.0F, -0.4271F, -1.5839F, 2, 5, 3, 0.0F, true));

        this.ManusL = new AdvancedModelRendererExtended(this);
        this.ManusL.setRotationPoint(0.3F, 4.2729F, 0.5161F);
        this.ElbowL.addChild(ManusL);
        this.setRotateAngle(ManusL, 0.0F, 0.0F, 0.2182F);
        this.ManusL.cubeList.add(new ModelBox(ManusL, 68, 27, -0.3F, 0.1F, -2.0F, 1, 5, 3, 0.0F, true));

        this.Ungual_r2 = new AdvancedModelRendererExtended(this);
        this.Ungual_r2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.ManusL.addChild(Ungual_r2);
        this.setRotateAngle(Ungual_r2, 0.6156F, -0.5713F, 0.2713F);
        this.Ungual_r2.cubeList.add(new ModelBox(Ungual_r2, 71, 60, -0.2F, 0.0F, -3.0F, 1, 2, 3, 0.0F, true));

        this.Neck1 = new AdvancedModelRendererExtended(this);
        this.Neck1.setRotationPoint(0.0F, 0.0F, -4.6F);
        this.Chest.addChild(Neck1);


        this.Neck_basebristles_r1 = new AdvancedModelRendererExtended(this);
        this.Neck_basebristles_r1.setRotationPoint(0.0F, 4.0F, -1.0F);
        this.Neck1.addChild(Neck_basebristles_r1);
        this.setRotateAngle(Neck_basebristles_r1, -0.1222F, 0.0F, 0.0F);
        this.Neck_basebristles_r1.cubeList.add(new ModelBox(Neck_basebristles_r1, 61, 17, -2.0F, -0.4F, -5.1F, 4, 2, 7, -0.01F, false));

        this.Neck_base_r1 = new AdvancedModelRendererExtended(this);
        this.Neck_base_r1.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Neck1.addChild(Neck_base_r1);
        this.setRotateAngle(Neck_base_r1, -0.0873F, 0.0F, 0.0F);
        this.Neck_base_r1.cubeList.add(new ModelBox(Neck_base_r1, 50, 50, -2.0F, -1.6F, -0.8F, 4, 5, 7, 0.0F, false));

        this.Neck2 = new AdvancedModelRendererExtended(this);
        this.Neck2.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.0873F, 0.0F, 0.0F);


        this.Neck_bodybristles_r1 = new AdvancedModelRendererExtended(this);
        this.Neck_bodybristles_r1.setRotationPoint(0.0F, 0.3F, -4.3F);
        this.Neck2.addChild(Neck_bodybristles_r1);
        this.setRotateAngle(Neck_bodybristles_r1, -0.2793F, 0.0F, 0.0F);
        this.Neck_bodybristles_r1.cubeList.add(new ModelBox(Neck_bodybristles_r1, 40, 0, -1.5F, -0.115F, 0.1638F, 3, 1, 4, 0.0F, false));

        this.Neck_body_r1 = new AdvancedModelRendererExtended(this);
        this.Neck_body_r1.setRotationPoint(0.0F, -1.0F, -5.0F);
        this.Neck2.addChild(Neck_body_r1);
        this.setRotateAngle(Neck_body_r1, -0.2793F, 0.0F, 0.0F);
        this.Neck_body_r1.cubeList.add(new ModelBox(Neck_body_r1, 27, 0, -1.5F, -3.0F, -0.8F, 3, 4, 6, 0.0F, false));

        this.Neck3 = new AdvancedModelRendererExtended(this);
        this.Neck3.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.0436F, 0.0F, 0.0F);


        this.Cervicalbristles_r1 = new AdvancedModelRendererExtended(this);
        this.Cervicalbristles_r1.setRotationPoint(1.0F, -1.0F, -3.0F);
        this.Neck3.addChild(Cervicalbristles_r1);
        this.setRotateAngle(Cervicalbristles_r1, -0.48F, 0.0F, 0.0F);
        this.Cervicalbristles_r1.cubeList.add(new ModelBox(Cervicalbristles_r1, 70, 68, -1.0F, -4.6F, -1.4F, 0, 2, 4, 0.0F, false));
        this.Cervicalbristles_r1.cubeList.add(new ModelBox(Cervicalbristles_r1, 20, 29, -2.0F, -2.6F, -1.4F, 2, 4, 5, 0.0F, false));

        this.ThroatPouch = new AdvancedModelRendererExtended(this);
        this.ThroatPouch.setRotationPoint(0.0F, 0.0F, -3.6F);
        this.Neck3.addChild(ThroatPouch);
        this.setRotateAngle(ThroatPouch, 1.0472F, 0.0F, 0.0F);


        this.Throat_pouch_r1 = new AdvancedModelRendererExtended(this);
        this.Throat_pouch_r1.setRotationPoint(1.0F, -1.0F, 1.0F);
        this.ThroatPouch.addChild(Throat_pouch_r1);
        this.setRotateAngle(Throat_pouch_r1, -1.4399F, 0.0F, 0.0F);
        this.Throat_pouch_r1.cubeList.add(new ModelBox(Throat_pouch_r1, 66, 50, -2.0F, -1.6F, -0.3F, 2, 3, 3, -0.01F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, -3.4F, -3.1F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, 0.0873F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 21, 63, -1.0F, 0.403F, -7.9612F, 2, 2, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 58, 42, -1.5F, -0.597F, -3.9612F, 3, 3, 4, 0.0F, false));

        this.maxillaryteeth_r1 = new AdvancedModelRendererExtended(this);
        this.maxillaryteeth_r1.setRotationPoint(2.7F, 2.4F, -4.0F);
        this.Head.addChild(maxillaryteeth_r1);
        this.setRotateAngle(maxillaryteeth_r1, 0.0F, 0.1047F, 0.0F);
        this.maxillaryteeth_r1.cubeList.add(new ModelBox(maxillaryteeth_r1, 67, 0, -1.9F, -0.4F, -5.0F, 0, 1, 5, 0.0F, true));

        this.maxillaryteeth_r2 = new AdvancedModelRendererExtended(this);
        this.maxillaryteeth_r2.setRotationPoint(-0.7F, 2.4F, -4.0F);
        this.Head.addChild(maxillaryteeth_r2);
        this.setRotateAngle(maxillaryteeth_r2, 0.0F, -0.1047F, 0.0F);
        this.maxillaryteeth_r2.cubeList.add(new ModelBox(maxillaryteeth_r2, 67, 0, -0.1F, -0.4F, -5.0F, 0, 1, 5, 0.0F, false));

        this.Premaxillaproximal_r1 = new AdvancedModelRendererExtended(this);
        this.Premaxillaproximal_r1.setRotationPoint(1.0F, 2.403F, -7.9612F);
        this.Head.addChild(Premaxillaproximal_r1);
        this.setRotateAngle(Premaxillaproximal_r1, 0.0253F, -0.0053F, -0.0098F);
        this.Premaxillaproximal_r1.cubeList.add(new ModelBox(Premaxillaproximal_r1, 9, 24, -1.5F, -1.98F, -0.33F, 1, 2, 1, -0.02F, false));

        this.Premaxilladistal_r1 = new AdvancedModelRendererExtended(this);
        this.Premaxilladistal_r1.setRotationPoint(1.0F, 2.403F, -7.9612F);
        this.Head.addChild(Premaxilladistal_r1);
        this.setRotateAngle(Premaxilladistal_r1, -0.2705F, 0.0F, 0.0F);
        this.Premaxilladistal_r1.cubeList.add(new ModelBox(Premaxilladistal_r1, 20, 24, -1.5F, -1.9F, -1.3F, 1, 2, 1, -0.01F, false));

        this.Nasalridgedistal_r1 = new AdvancedModelRendererExtended(this);
        this.Nasalridgedistal_r1.setRotationPoint(1.0F, 0.403F, -5.9612F);
        this.Head.addChild(Nasalridgedistal_r1);
        this.setRotateAngle(Nasalridgedistal_r1, 0.2269F, 0.0F, 0.0F);
        this.Nasalridgedistal_r1.cubeList.add(new ModelBox(Nasalridgedistal_r1, 16, 61, -1.5F, -0.8F, -2.6049F, 1, 1, 3, 0.0F, false));

        this.Nasalridgeproximal_r1 = new AdvancedModelRendererExtended(this);
        this.Nasalridgeproximal_r1.setRotationPoint(1.0F, 0.403F, -3.9612F);
        this.Head.addChild(Nasalridgeproximal_r1);
        this.setRotateAngle(Nasalridgeproximal_r1, 0.0698F, 0.0F, 0.0F);
        this.Nasalridgeproximal_r1.cubeList.add(new ModelBox(Nasalridgeproximal_r1, 0, 53, -2.0F, -1.0F, -1.8F, 2, 1, 2, -0.01F, false));

        this.Jaw = new AdvancedModelRendererExtended(this);
        this.Jaw.setRotationPoint(0.0F, 2.403F, 0.0388F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 18, 50, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 44, 50, -1.0F, 0.0F, -8.0F, 2, 1, 4, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 8, 0, -0.5F, 0.0F, -9.0F, 1, 1, 1, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 21, 71, -1.0F, -2.0F, -3.1F, 2, 2, 3, 0.01F, false));

        this.Dentaryteeth_r1 = new AdvancedModelRendererExtended(this);
        this.Dentaryteeth_r1.setRotationPoint(2.8F, 0.0F, -3.7F);
        this.Jaw.addChild(Dentaryteeth_r1);
        this.setRotateAngle(Dentaryteeth_r1, 0.0F, 0.1047F, 0.0F);
        this.Dentaryteeth_r1.cubeList.add(new ModelBox(Dentaryteeth_r1, 29, 67, -2.0F, -0.7F, -5.0F, 0, 1, 5, 0.0F, true));

        this.Dentaryteeth_r2 = new AdvancedModelRendererExtended(this);
        this.Dentaryteeth_r2.setRotationPoint(-0.8F, 0.0F, -3.7F);
        this.Jaw.addChild(Dentaryteeth_r2);
        this.setRotateAngle(Dentaryteeth_r2, 0.0F, -0.1047F, 0.0F);
        this.Dentaryteeth_r2.cubeList.add(new ModelBox(Dentaryteeth_r2, 29, 67, 0.0F, -0.7F, -5.0F, 0, 1, 5, 0.0F, false));

        this.Tail1 = new AdvancedModelRendererExtended(this);
        this.Tail1.setRotationPoint(-0.3F, 2.0F, 6.3F);
        this.Basin.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.0262F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 25, 32, -1.5F, -2.2F, 0.0F, 4, 5, 12, 0.0F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.5F, 0.0F, 11.2F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0349F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 28, 11, -1.5F, -2.1F, 0.0F, 3, 4, 13, 0.0F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 12.3F);
        this.Tail2.addChild(Tail3);


        this.Caudal_Bodydistal_r1 = new AdvancedModelRendererExtended(this);
        this.Caudal_Bodydistal_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail3.addChild(Caudal_Bodydistal_r1);
        this.setRotateAngle(Caudal_Bodydistal_r1, -0.0524F, 0.0F, 0.0F);
        this.Caudal_Bodydistal_r1.cubeList.add(new ModelBox(Caudal_Bodydistal_r1, 0, 44, -1.0F, -2.0F, 0.0F, 2, 3, 13, 0.0F, false));

        this.Tail4 = new AdvancedModelRendererExtended(this);
        this.Tail4.setRotationPoint(0.0F, -0.3F, 12.4F);
        this.Tail3.addChild(Tail4);


        this.Caudaldistal_r1 = new AdvancedModelRendererExtended(this);
        this.Caudaldistal_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail4.addChild(Caudaldistal_r1);
        this.setRotateAngle(Caudaldistal_r1, -0.2094F, 0.0F, 0.0F);
        this.Caudaldistal_r1.cubeList.add(new ModelBox(Caudaldistal_r1, 0, 24, -0.5F, -1.0F, 0.0F, 1, 2, 17, 0.0F, false));

        this.Tail5 = new AdvancedModelRendererExtended(this);
        this.Tail5.setRotationPoint(0.0F, 2.9F, 13.0F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.4363F, 0.0F, 0.0F);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Thecodontosaurus.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(HindlimbR, -0.4538F, 0.0F, 0.0F);
        this.setRotateAngle(KneeR, 0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(MetatarsalsR, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(PesR, 0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(HindlimbL, -0.4538F, 0.0F, 0.0F);
        this.setRotateAngle(KneeL, 0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(MetatarsalsL, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(PesL, 0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(Breast_CoracoidBristlescrest_r1, 0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(ForearmR, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(ElbowR, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(ManusR, 0.0F, 0.0F, -0.4363F);
        this.setRotateAngle(Ungual_r1, 0.6156F, 0.5713F, -0.2713F);
        this.setRotateAngle(ForearmL, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(ElbowL, -1.2217F, 0.0F, 0.0F);
        this.setRotateAngle(ManusL, 0.0F, 0.0F, 0.6109F);
        this.setRotateAngle(Ungual_r2, 1.0956F, -0.5713F, 0.2713F);
        this.setRotateAngle(Neck1, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(Neck_basebristles_r1, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(Neck_base_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Neck2, -0.2156F, -0.2634F, 0.0059F);
        this.setRotateAngle(Neck_bodybristles_r1, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(Neck_body_r1, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(Neck3, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Cervicalbristles_r1, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(ThroatPouch, 1.0472F, 0.0F, 0.0F);
        this.setRotateAngle(Throat_pouch_r1, -1.4399F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.1148F, -0.5648F, -0.0555F);
        this.setRotateAngle(maxillaryteeth_r1, 0.0F, 0.1047F, 0.0F);
        this.setRotateAngle(maxillaryteeth_r2, 0.0F, -0.1047F, 0.0F);
        this.setRotateAngle(Premaxillaproximal_r1, 0.0253F, -0.0053F, -0.0098F);
        this.setRotateAngle(Premaxilladistal_r1, -0.2705F, 0.0F, 0.0F);
        this.setRotateAngle(Nasalridgedistal_r1, 0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(Nasalridgeproximal_r1, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(Dentaryteeth_r1, 0.0F, 0.1047F, 0.0F);
        this.setRotateAngle(Dentaryteeth_r2, 0.0F, -0.1047F, 0.0F);
        this.setRotateAngle(Tail1, 0.0262F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(Caudal_Bodydistal_r1, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(Caudaldistal_r1, -0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(Tail5, -0.4363F, 0.0F, 0.0F);
        this.Chest.offsetY = -0.0F;
        this.Chest.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.Thecodontosaurus.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(HindlimbR, -0.8859F, 0.1016F, 0.0827F);
        this.setRotateAngle(KneeR, 1.2217F, 0.0F, 0.0F);
        this.setRotateAngle(MetatarsalsR, -1.2217F, 0.0F, 0.0F);
        this.setRotateAngle(PesR, 1.7366F, 0.0F, 0.0F);
        this.setRotateAngle(HindlimbL, -0.2356F, 0.0F, 0.0F);
        this.setRotateAngle(KneeL, 0.9163F, 0.0F, 0.0F);
        this.setRotateAngle(MetatarsalsL, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(PesL, 0.1658F, 0.0F, 0.0F);
        this.setRotateAngle(Body, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(Chest, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(Breast_CoracoidBristlescrest_r1, 0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(ForearmR, 0.9001F, -0.149F, 0.2161F);
        this.setRotateAngle(ElbowR, -1.2654F, 0.0F, 0.0F);
        this.setRotateAngle(ManusR, 0.0F, 0.0F, -0.5236F);
        this.setRotateAngle(Ungual_r1, 0.6156F, 0.5713F, -0.2713F);
        this.setRotateAngle(ForearmL, 1.0472F, -0.2291F, -0.3747F);
        this.setRotateAngle(ElbowL, -1.4353F, 0.2595F, 0.035F);
        this.setRotateAngle(ManusL, 0.0F, 0.0F, 0.4363F);
        this.setRotateAngle(Ungual_r2, 0.6156F, -0.5713F, 0.2713F);
        this.setRotateAngle(Neck1, -0.2751F, 0.7258F, -0.015F);
        this.setRotateAngle(Neck_basebristles_r1, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(Neck_base_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Neck2, -0.0056F, 0.3477F, -0.0317F);
        this.setRotateAngle(Neck_bodybristles_r1, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(Neck_body_r1, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(Neck3, 0.2679F, 0.2106F, 0.0573F);
        this.setRotateAngle(Cervicalbristles_r1, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(ThroatPouch, 1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(Throat_pouch_r1, -1.4399F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.4356F, -0.0114F, 0.1304F);
        this.setRotateAngle(maxillaryteeth_r1, 0.0F, 0.1047F, 0.0F);
        this.setRotateAngle(maxillaryteeth_r2, 0.0F, -0.1047F, 0.0F);
        this.setRotateAngle(Premaxillaproximal_r1, 0.0253F, -0.0053F, -0.0098F);
        this.setRotateAngle(Premaxilladistal_r1, -0.2705F, 0.0F, 0.0F);
        this.setRotateAngle(Nasalridgedistal_r1, 0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(Nasalridgeproximal_r1, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(Dentaryteeth_r1, 0.0F, 0.1047F, 0.0F);
        this.setRotateAngle(Dentaryteeth_r2, 0.0F, -0.1047F, 0.0F);
        this.setRotateAngle(Tail1, 0.07F, -0.1309F, -0.0034F);
        this.setRotateAngle(Tail2, 0.1661F, -0.1308F, -0.0046F);
        this.setRotateAngle(Tail3, -0.1309F, -0.1745F, 0.0F);
        this.setRotateAngle(Caudal_Bodydistal_r1, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(Tail4, -0.0873F, -0.1745F, 0.0F);
        this.setRotateAngle(Caudaldistal_r1, -0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(Tail5, -0.4363F, 0.0F, 0.0F);
        this.Thecodontosaurus.offsetZ = -0.034F;
        this.Thecodontosaurus.offsetY = -0.07F;
        this.Thecodontosaurus.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraThecodontosaurus EntityThecodontosaurus = (EntityPrehistoricFloraThecodontosaurus) e;

        this.faceTarget(f3, f4, 10, Neck1);
        this.faceTarget(f3, f4, 10, Neck2);
        this.faceTarget(f3, f4, 10, Neck3);
        this.faceTarget(f3, f4, 10, Head);

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] Neck = {this.Neck1, this.Neck2, this.Neck3, this.Head};

        if (EntityThecodontosaurus.getAnimation() == EntityThecodontosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff

            return;
        }
        
        if (!EntityThecodontosaurus.isReallyInWater()) {

            if (f3 == 0.0F || !EntityThecodontosaurus.getIsMoving()) {
                this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                this.chainWave(Tail, (0.15F * 0.5F), 0.125F * 0.35F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                return;
            }

            if (EntityThecodontosaurus.getIsFast()) { //Running


            }
            else { //Walking
                
            }
        }
        else {
            //Swimming pose:
            if (f3 == 0.0F) { //static in water
                return;
            }
            //moving in water
            return;
        }
    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraThecodontosaurus entity = (EntityPrehistoricFloraThecodontosaurus) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 0D) / 8D) * 1D);
            yy = 5D + (((tickAnim - 0D) / 8D) * -6.66667D);
            zz = 0.00001D + (((tickAnim - 0D) / 8D) * 2.5D);
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 1D + (((tickAnim - 8D) / 7D) * -1D);
            yy = -1.66667D + (((tickAnim - 8D) / 7D) * -3.33333D);
            zz = 2.50001D + (((tickAnim - 8D) / 7D) * -2.49999D);
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 15D) / 8D) * 1D);
            yy = -5D + (((tickAnim - 15D) / 8D) * 6.66667D);
            zz = 0.00002D + (((tickAnim - 15D) / 8D) * -2.50001D);
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 1D + (((tickAnim - 23D) / 7D) * -1D);
            yy = 1.66667D + (((tickAnim - 23D) / 7D) * 3.33333D);
            zz = -2.49999D + (((tickAnim - 23D) / 7D) * 2.5D);
        }
        this.setRotateAngle(Basin, Basin.rotateAngleX + (float) Math.toRadians(xx), Basin.rotateAngleY + (float) Math.toRadians(yy), Basin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 0D) / 8D) * 0D);
            yy = -2D + (((tickAnim - 0D) / 8D) * 1.5D);
            zz = 0D + (((tickAnim - 0D) / 8D) * 0D);
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 8D) / 4D) * 0D);
            yy = -0.5D + (((tickAnim - 8D) / 4D) * -0.5D);
            zz = 0D + (((tickAnim - 8D) / 4D) * 0D);
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 12D) / 3D) * 0D);
            yy = -1D + (((tickAnim - 12D) / 3D) * -0.94D);
            zz = 0D + (((tickAnim - 12D) / 3D) * 0D);
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 15D) / 8D) * 0D);
            yy = -1.94D + (((tickAnim - 15D) / 8D) * 1.44D);
            zz = 0D + (((tickAnim - 15D) / 8D) * 0D);
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 23D) / 4D) * 0D);
            yy = -0.5D + (((tickAnim - 23D) / 4D) * -0.5D);
            zz = 0D + (((tickAnim - 23D) / 4D) * 0D);
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 27D) / 3D) * 0D);
            yy = -1D + (((tickAnim - 27D) / 3D) * -1D);
            zz = 0D + (((tickAnim - 27D) / 3D) * 0D);
        }
        this.Basin.offsetX = (float) Math.toRadians(xx);
        this.Basin.offsetY = (float) Math.toRadians(yy);
        this.Basin.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 40.24491D + (((tickAnim - 0D) / 10D) * -75.82045D);
            yy = 2.27929D + (((tickAnim - 0D) / 10D) * 9.6206D);
            zz = 4.85494D + (((tickAnim - 0D) / 10D) * -7.4738D);
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -35.57554D + (((tickAnim - 10D) / 4D) * 6.38685D);
            yy = 11.89989D + (((tickAnim - 10D) / 4D) * 5.13189D);
            zz = -2.61886D + (((tickAnim - 10D) / 4D) * -3.9761D);
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -29.18869D + (((tickAnim - 14D) / 1D) * 4.27737D);
            yy = 17.03178D + (((tickAnim - 14D) / 1D) * 1.02638D);
            zz = -6.59496D + (((tickAnim - 14D) / 1D) * -0.79522D);
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -24.91132D + (((tickAnim - 15D) / 10D) * 43.58212D);
            yy = 18.05816D + (((tickAnim - 15D) / 10D) * -9.70511D);
            zz = -7.39018D + (((tickAnim - 15D) / 10D) * 14.16024D);
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 18.6708D + (((tickAnim - 25D) / 5D) * 21.57411D);
            yy = 8.35305D + (((tickAnim - 25D) / 5D) * -6.07376D);
            zz = 6.77006D + (((tickAnim - 25D) / 5D) * -1.91512D);
        }
        this.setRotateAngle(HindlimbR, HindlimbR.rotateAngleX + (float) Math.toRadians(xx), HindlimbR.rotateAngleY + (float) Math.toRadians(yy), HindlimbR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4.00015D + (((tickAnim - 0D) / 3D) * 32.18985D);
            yy = 0.00437D + (((tickAnim - 0D) / 3D) * -0.00437D);
            zz = 0.0169D + (((tickAnim - 0D) / 3D) * -0.0169D);
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 36.19D + (((tickAnim - 3D) / 7D) * 4.64D);
            yy = 0D + (((tickAnim - 3D) / 7D) * 0D);
            zz = 0D + (((tickAnim - 3D) / 7D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 40.83D + (((tickAnim - 10D) / 5D) * -40.83D);
            yy = 0D + (((tickAnim - 10D) / 5D) * 0D);
            zz = 0D + (((tickAnim - 10D) / 5D) * 0D);
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 15D) / 3D) * 5.17D);
            yy = 0D + (((tickAnim - 15D) / 3D) * 0D);
            zz = 0D + (((tickAnim - 15D) / 3D) * 0D);
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 5.17D + (((tickAnim - 18D) / 1D) * 0.94D);
            yy = 0D + (((tickAnim - 18D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 18D) / 1D) * 0D);
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 6.11D + (((tickAnim - 19D) / 4D) * -4.10992D);
            yy = 0D + (((tickAnim - 19D) / 4D) * 0.00218D);
            zz = 0D + (((tickAnim - 19D) / 4D) * 0.00845D);
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 2.00008D + (((tickAnim - 23D) / 4D) * 8.33337D);
            yy = 0.00218D + (((tickAnim - 23D) / 4D) * 0.00122D);
            zz = 0.00845D + (((tickAnim - 23D) / 4D) * 0.00469D);
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 10.33345D + (((tickAnim - 27D) / 3D) * -6.3333D);
            yy = 0.0034D + (((tickAnim - 27D) / 3D) * 0.00097D);
            zz = 0.01314D + (((tickAnim - 27D) / 3D) * 0.00376D);
        }
        this.setRotateAngle(KneeR, KneeR.rotateAngleX + (float) Math.toRadians(xx), KneeR.rotateAngleY + (float) Math.toRadians(yy), KneeR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 12.5D + (((tickAnim - 0D) / 5D) * -49.27D);
            yy = 0D + (((tickAnim - 0D) / 5D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 5D) * 0D);
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -36.77D + (((tickAnim - 5D) / 3D) * -13.1D);
            yy = 0D + (((tickAnim - 5D) / 3D) * 0D);
            zz = 0D + (((tickAnim - 5D) / 3D) * 0D);
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -49.87D + (((tickAnim - 8D) / 2D) * 21.54D);
            yy = 0D + (((tickAnim - 8D) / 2D) * 0D);
            zz = 0D + (((tickAnim - 8D) / 2D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -28.33D + (((tickAnim - 10D) / 2D) * -0.560000000000002D);
            yy = 0D + (((tickAnim - 10D) / 2D) * 0D);
            zz = 0D + (((tickAnim - 10D) / 2D) * 0D);
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -28.89D + (((tickAnim - 12D) / 3D) * 36.39D);
            yy = 0D + (((tickAnim - 12D) / 3D) * 0D);
            zz = 0D + (((tickAnim - 12D) / 3D) * 0D);
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 7.5D + (((tickAnim - 15D) / 3D) * -15.17D);
            yy = 0D + (((tickAnim - 15D) / 3D) * 0D);
            zz = 0D + (((tickAnim - 15D) / 3D) * 0D);
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -7.67D + (((tickAnim - 18D) / 1D) * -2.61D);
            yy = 0D + (((tickAnim - 18D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 18D) / 1D) * 0D);
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -10.28D + (((tickAnim - 19D) / 4D) * 12.78D);
            yy = 0D + (((tickAnim - 19D) / 4D) * 0D);
            zz = 0D + (((tickAnim - 19D) / 4D) * 0D);
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 2.5D + (((tickAnim - 23D) / 4D) * -3.06D);
            yy = 0D + (((tickAnim - 23D) / 4D) * 0D);
            zz = 0D + (((tickAnim - 23D) / 4D) * 0D);
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -0.56D + (((tickAnim - 27D) / 3D) * 13.06D);
            yy = 0D + (((tickAnim - 27D) / 3D) * 0D);
            zz = 0D + (((tickAnim - 27D) / 3D) * 0D);
        }
        this.setRotateAngle(MetatarsalsR, MetatarsalsR.rotateAngleX + (float) Math.toRadians(xx), MetatarsalsR.rotateAngleY + (float) Math.toRadians(yy), MetatarsalsR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 15.00204D + (((tickAnim - 0D) / 6D) * 103.32796D);
            yy = 1.49178D + (((tickAnim - 0D) / 6D) * -1.49178D);
            zz = 0.15684D + (((tickAnim - 0D) / 6D) * -0.15684D);
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 118.33D + (((tickAnim - 6D) / 6D) * -32.29D);
            yy = 0D + (((tickAnim - 6D) / 6D) * 0D);
            zz = 0D + (((tickAnim - 6D) / 6D) * 0D);
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 86.04D + (((tickAnim - 12D) / 3D) * -72.61139D);
            yy = 0D + (((tickAnim - 12D) / 3D) * -3.81468D);
            zz = 0D + (((tickAnim - 12D) / 3D) * 6.4622D);
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 13.42861D + (((tickAnim - 15D) / 3D) * 1.41229D);
            yy = -3.81468D + (((tickAnim - 15D) / 3D) * 0.61499D);
            zz = 6.4622D + (((tickAnim - 15D) / 3D) * -2.43199D);
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 14.8409D + (((tickAnim - 18D) / 1D) * -5.72513D);
            yy = -3.19969D + (((tickAnim - 18D) / 1D) * 0.41D);
            zz = 4.03021D + (((tickAnim - 18D) / 1D) * -1.62132D);
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 9.11577D + (((tickAnim - 19D) / 4D) * -21.45028D);
            yy = -2.78969D + (((tickAnim - 19D) / 4D) * 0.81999D);
            zz = 2.40889D + (((tickAnim - 19D) / 4D) * -3.24264D);
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -12.33451D + (((tickAnim - 23D) / 2D) * 3.38348D);
            yy = -1.9697D + (((tickAnim - 23D) / 2D) * 0.32813D);
            zz = -0.83375D + (((tickAnim - 23D) / 2D) * -3.5928D);
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = -8.95103D + (((tickAnim - 25D) / 2D) * 13.50145D);
            yy = -1.64157D + (((tickAnim - 25D) / 2D) * 0.0625599999999999D);
            zz = -4.42655D + (((tickAnim - 25D) / 2D) * 1.22188D);
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 4.55042D + (((tickAnim - 27D) / 1D) * 0.868910000000001D);
            yy = -1.57901D + (((tickAnim - 27D) / 1D) * 3.07185D);
            zz = -3.20467D + (((tickAnim - 27D) / 1D) * -2.56963D);
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 5.41933D + (((tickAnim - 28D) / 2D) * 9.58271D);
            yy = 1.49284D + (((tickAnim - 28D) / 2D) * -0.00105999999999984D);
            zz = -5.7743D + (((tickAnim - 28D) / 2D) * 5.93114D);
        }
        this.setRotateAngle(PesR, PesR.rotateAngleX + (float) Math.toRadians(xx), PesR.rotateAngleY + (float) Math.toRadians(yy), PesR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -24.91132D + (((tickAnim - 0D) / 10D) * 43.58212D);
            yy = -18.0582D + (((tickAnim - 0D) / 10D) * 9.7051D);
            zz = 7.3902D + (((tickAnim - 0D) / 10D) * -14.1603D);
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 18.6708D + (((tickAnim - 10D) / 5D) * 21.57411D);
            yy = -8.3531D + (((tickAnim - 10D) / 5D) * 6.0738D);
            zz = -6.7701D + (((tickAnim - 10D) / 5D) * 1.9152D);
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 40.24491D + (((tickAnim - 15D) / 10D) * -75.82045D);
            yy = -2.2793D + (((tickAnim - 15D) / 10D) * -9.6206D);
            zz = -4.8549D + (((tickAnim - 15D) / 10D) * 7.4738D);
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = -35.57554D + (((tickAnim - 25D) / 4D) * 6.38685D);
            yy = -11.8999D + (((tickAnim - 25D) / 4D) * -5.1319D);
            zz = 2.6189D + (((tickAnim - 25D) / 4D) * 3.9761D);
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -29.18869D + (((tickAnim - 29D) / 1D) * 4.27737D);
            yy = -17.0318D + (((tickAnim - 29D) / 1D) * -1.0264D);
            zz = 6.595D + (((tickAnim - 29D) / 1D) * 0.7952D);
        }
        this.setRotateAngle(HindlimbL, HindlimbL.rotateAngleX + (float) Math.toRadians(xx), HindlimbL.rotateAngleY + (float) Math.toRadians(yy), HindlimbL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * 5.17D);
            yy = 0D + (((tickAnim - 0D) / 3D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 3D) * 0D);
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 5.17D + (((tickAnim - 3D) / 1D) * 0.94D);
            yy = 0D + (((tickAnim - 3D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 3D) / 1D) * 0D);
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 6.11D + (((tickAnim - 4D) / 4D) * -4.10992D);
            yy = 0D + (((tickAnim - 4D) / 4D) * 0.00218D);
            zz = 0D + (((tickAnim - 4D) / 4D) * 0.00845D);
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 2.00008D + (((tickAnim - 8D) / 4D) * 8.33337D);
            yy = 0.00218D + (((tickAnim - 8D) / 4D) * 0.00122D);
            zz = 0.00845D + (((tickAnim - 8D) / 4D) * 0.00469D);
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 10.33345D + (((tickAnim - 12D) / 3D) * -6.3333D);
            yy = 0.0034D + (((tickAnim - 12D) / 3D) * 0.00097D);
            zz = 0.01314D + (((tickAnim - 12D) / 3D) * 0.00376D);
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 4.00015D + (((tickAnim - 15D) / 3D) * 32.18985D);
            yy = 0.00437D + (((tickAnim - 15D) / 3D) * -0.00437D);
            zz = 0.0169D + (((tickAnim - 15D) / 3D) * -0.0169D);
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 36.19D + (((tickAnim - 18D) / 7D) * 4.64D);
            yy = 0D + (((tickAnim - 18D) / 7D) * 0D);
            zz = 0D + (((tickAnim - 18D) / 7D) * 0D);
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 40.83D + (((tickAnim - 25D) / 5D) * -40.83D);
            yy = 0D + (((tickAnim - 25D) / 5D) * 0D);
            zz = 0D + (((tickAnim - 25D) / 5D) * 0D);
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 7.5D + (((tickAnim - 0D) / 3D) * -15.17D);
            yy = 0D + (((tickAnim - 0D) / 3D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 3D) * 0D);
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -7.67D + (((tickAnim - 3D) / 1D) * -2.61D);
            yy = 0D + (((tickAnim - 3D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 3D) / 1D) * 0D);
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -10.28D + (((tickAnim - 4D) / 4D) * 12.78D);
            yy = 0D + (((tickAnim - 4D) / 4D) * 0D);
            zz = 0D + (((tickAnim - 4D) / 4D) * 0D);
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 2.5D + (((tickAnim - 8D) / 4D) * -3.06D);
            yy = 0D + (((tickAnim - 8D) / 4D) * 0D);
            zz = 0D + (((tickAnim - 8D) / 4D) * 0D);
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -0.56D + (((tickAnim - 12D) / 3D) * 13.06D);
            yy = 0D + (((tickAnim - 12D) / 3D) * 0D);
            zz = 0D + (((tickAnim - 12D) / 3D) * 0D);
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 12.5D + (((tickAnim - 15D) / 5D) * -49.27D);
            yy = 0D + (((tickAnim - 15D) / 5D) * 0D);
            zz = 0D + (((tickAnim - 15D) / 5D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -36.77D + (((tickAnim - 20D) / 3D) * -13.1D);
            yy = 0D + (((tickAnim - 20D) / 3D) * 0D);
            zz = 0D + (((tickAnim - 20D) / 3D) * 0D);
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -49.87D + (((tickAnim - 23D) / 2D) * 21.54D);
            yy = 0D + (((tickAnim - 23D) / 2D) * 0D);
            zz = 0D + (((tickAnim - 23D) / 2D) * 0D);
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = -28.33D + (((tickAnim - 25D) / 2D) * -0.560000000000002D);
            yy = 0D + (((tickAnim - 25D) / 2D) * 0D);
            zz = 0D + (((tickAnim - 25D) / 2D) * 0D);
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -28.89D + (((tickAnim - 27D) / 3D) * 36.39D);
            yy = 0D + (((tickAnim - 27D) / 3D) * 0D);
            zz = 0D + (((tickAnim - 27D) / 3D) * 0D);
        }
        this.setRotateAngle(MetatarsalsL, MetatarsalsL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalsL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalsL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 13.42861D + (((tickAnim - 0D) / 3D) * 1.41229D);
            yy = 3.8147D + (((tickAnim - 0D) / 3D) * -0.615D);
            zz = -6.4622D + (((tickAnim - 0D) / 3D) * 2.432D);
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 14.8409D + (((tickAnim - 3D) / 1D) * -5.72513D);
            yy = 3.1997D + (((tickAnim - 3D) / 1D) * -0.41D);
            zz = -4.0302D + (((tickAnim - 3D) / 1D) * 1.6213D);
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 9.11577D + (((tickAnim - 4D) / 4D) * -21.45028D);
            yy = 2.7897D + (((tickAnim - 4D) / 4D) * -0.82D);
            zz = -2.4089D + (((tickAnim - 4D) / 4D) * 3.2427D);
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -12.33451D + (((tickAnim - 8D) / 2D) * 3.38348D);
            yy = 1.9697D + (((tickAnim - 8D) / 2D) * -0.3281D);
            zz = 0.8338D + (((tickAnim - 8D) / 2D) * 3.5928D);
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -8.95103D + (((tickAnim - 10D) / 2D) * 13.50145D);
            yy = 1.6416D + (((tickAnim - 10D) / 2D) * -0.0626D);
            zz = 4.4266D + (((tickAnim - 10D) / 2D) * -1.2219D);
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 4.55042D + (((tickAnim - 12D) / 1D) * 0.868910000000001D);
            yy = 1.579D + (((tickAnim - 12D) / 1D) * -3.0718D);
            zz = 3.2047D + (((tickAnim - 12D) / 1D) * 2.5696D);
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 5.41933D + (((tickAnim - 13D) / 2D) * 9.58271D);
            yy = -1.4928D + (((tickAnim - 13D) / 2D) * 0.00099999999999989D);
            zz = 5.7743D + (((tickAnim - 13D) / 2D) * -5.9311D);
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 15.00204D + (((tickAnim - 15D) / 6D) * 103.32796D);
            yy = -1.4918D + (((tickAnim - 15D) / 6D) * 1.4918D);
            zz = -0.1568D + (((tickAnim - 15D) / 6D) * 0.1568D);
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 118.33D + (((tickAnim - 21D) / 6D) * -32.29D);
            yy = 0D + (((tickAnim - 21D) / 6D) * 0D);
            zz = 0D + (((tickAnim - 21D) / 6D) * 0D);
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 86.04D + (((tickAnim - 27D) / 3D) * -72.61139D);
            yy = 0D + (((tickAnim - 27D) / 3D) * 3.8147D);
            zz = 0D + (((tickAnim - 27D) / 3D) * -6.4622D);
        }
        this.setRotateAngle(PesL, PesL.rotateAngleX + (float) Math.toRadians(xx), PesL.rotateAngleY + (float) Math.toRadians(yy), PesL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 0D) / 8D) * 2.5D);
            yy = -3D + (((tickAnim - 0D) / 8D) * 3D);
            zz = 0D + (((tickAnim - 0D) / 8D) * 0D);
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 2.5D + (((tickAnim - 8D) / 7D) * -2.5D);
            yy = 0D + (((tickAnim - 8D) / 7D) * 3D);
            zz = 0D + (((tickAnim - 8D) / 7D) * 0D);
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 15D) / 8D) * 2.5D);
            yy = 3D + (((tickAnim - 15D) / 8D) * -3D);
            zz = 0D + (((tickAnim - 15D) / 8D) * 0D);
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 2.5D + (((tickAnim - 23D) / 7D) * -2.5D);
            yy = 0D + (((tickAnim - 23D) / 7D) * -3D);
            zz = 0D + (((tickAnim - 23D) / 7D) * 0D);
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 2.22D + (((tickAnim - 0D) / 7D) * -2.22D);
            yy = -0.28D + (((tickAnim - 0D) / 7D) * -2.22D);
            zz = 0D + (((tickAnim - 0D) / 7D) * 0D);
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 7D) / 7D) * 2.5D);
            yy = -2.5D + (((tickAnim - 7D) / 7D) * 2.5D);
            zz = 0D + (((tickAnim - 7D) / 7D) * 0D);
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 2.5D + (((tickAnim - 14D) / 8D) * -2.5D);
            yy = 0D + (((tickAnim - 14D) / 8D) * 2.5D);
            zz = 0D + (((tickAnim - 14D) / 8D) * 0D);
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 0D + (((tickAnim - 22D) / 7D) * 2.5D);
            yy = 2.5D + (((tickAnim - 22D) / 7D) * -2.5D);
            zz = 0D + (((tickAnim - 22D) / 7D) * 0D);
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 2.5D + (((tickAnim - 29D) / 1D) * -0.28D);
            yy = 0D + (((tickAnim - 29D) / 1D) * -0.28D);
            zz = 0D + (((tickAnim - 29D) / 1D) * 0D);
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 6.87D + (((tickAnim - 0D) / 1D) * -0.40921D);
            yy = -15.79D + (((tickAnim - 0D) / 1D) * 0.0139999999999993D);
            zz = 2.71D + (((tickAnim - 0D) / 1D) * -0.0112000000000001D);
        }
        else if (tickAnim >= 1 && tickAnim < 6) {
            xx = 6.46079D + (((tickAnim - 1D) / 5D) * 4.95067D);
            yy = -15.776D + (((tickAnim - 1D) / 5D) * -0.151199999999999D);
            zz = 2.6988D + (((tickAnim - 1D) / 5D) * 0.1632D);
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 11.41146D + (((tickAnim - 6D) / 10D) * -4.95067D);
            yy = -15.9272D + (((tickAnim - 6D) / 10D) * 0.151199999999999D);
            zz = 2.862D + (((tickAnim - 6D) / 10D) * -0.1632D);
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 6.46079D + (((tickAnim - 16D) / 5D) * 4.95067D);
            yy = -15.776D + (((tickAnim - 16D) / 5D) * -0.151199999999999D);
            zz = 2.6988D + (((tickAnim - 16D) / 5D) * 0.1632D);
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 11.41146D + (((tickAnim - 21D) / 9D) * -4.54146D);
            yy = -15.9272D + (((tickAnim - 21D) / 9D) * 0.1372D);
            zz = 2.862D + (((tickAnim - 21D) / 9D) * -0.152D);
        }
        this.setRotateAngle(ForearmR, ForearmR.rotateAngleX + (float) Math.toRadians(xx), ForearmR.rotateAngleY + (float) Math.toRadians(yy), ForearmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -26.67D + (((tickAnim - 0D) / 4D) * 4.17D);
            yy = 0D + (((tickAnim - 0D) / 4D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 4D) * 0D);
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -22.5D + (((tickAnim - 4D) / 5D) * -10D);
            yy = 0D + (((tickAnim - 4D) / 5D) * 0D);
            zz = 0D + (((tickAnim - 4D) / 5D) * 0D);
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = -32.5D + (((tickAnim - 9D) / 10D) * 10D);
            yy = 0D + (((tickAnim - 9D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 9D) / 10D) * 0D);
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -22.5D + (((tickAnim - 19D) / 5D) * -10D);
            yy = 0D + (((tickAnim - 19D) / 5D) * 0D);
            zz = 0D + (((tickAnim - 19D) / 5D) * 0D);
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -32.5D + (((tickAnim - 24D) / 6D) * 5.83D);
            yy = 0D + (((tickAnim - 24D) / 6D) * 0D);
            zz = 0D + (((tickAnim - 24D) / 6D) * 0D);
        }
        this.setRotateAngle(ElbowR, ElbowR.rotateAngleX + (float) Math.toRadians(xx), ElbowR.rotateAngleY + (float) Math.toRadians(yy), ElbowR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 6.87D + (((tickAnim - 0D) / 1D) * -0.40921D);
            yy = 15.79D + (((tickAnim - 0D) / 1D) * -0.0140399999999996D);
            zz = -2.71D + (((tickAnim - 0D) / 1D) * 0.0112199999999998D);
        }
        else if (tickAnim >= 1 && tickAnim < 6) {
            xx = 6.46079D + (((tickAnim - 1D) / 5D) * 4.95067D);
            yy = 15.77596D + (((tickAnim - 1D) / 5D) * 0.15128D);
            zz = -2.69878D + (((tickAnim - 1D) / 5D) * -0.16321D);
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 11.41146D + (((tickAnim - 6D) / 10D) * -4.95067D);
            yy = 15.92724D + (((tickAnim - 6D) / 10D) * -0.15128D);
            zz = -2.86199D + (((tickAnim - 6D) / 10D) * 0.16321D);
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 6.46079D + (((tickAnim - 16D) / 5D) * 4.95067D);
            yy = 15.77596D + (((tickAnim - 16D) / 5D) * 0.15128D);
            zz = -2.69878D + (((tickAnim - 16D) / 5D) * -0.16321D);
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 11.41146D + (((tickAnim - 21D) / 9D) * -4.54146D);
            yy = 15.92724D + (((tickAnim - 21D) / 9D) * -0.13724D);
            zz = -2.86199D + (((tickAnim - 21D) / 9D) * 0.15199D);
        }
        this.setRotateAngle(ForearmL, ForearmL.rotateAngleX + (float) Math.toRadians(xx), ForearmL.rotateAngleY + (float) Math.toRadians(yy), ForearmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -26.67D + (((tickAnim - 0D) / 4D) * 4.17D);
            yy = 0D + (((tickAnim - 0D) / 4D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 4D) * 0D);
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -22.5D + (((tickAnim - 4D) / 5D) * -10D);
            yy = 0D + (((tickAnim - 4D) / 5D) * 0D);
            zz = 0D + (((tickAnim - 4D) / 5D) * 0D);
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = -32.5D + (((tickAnim - 9D) / 10D) * 10D);
            yy = 0D + (((tickAnim - 9D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 9D) / 10D) * 0D);
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -22.5D + (((tickAnim - 19D) / 5D) * -10D);
            yy = 0D + (((tickAnim - 19D) / 5D) * 0D);
            zz = 0D + (((tickAnim - 19D) / 5D) * 0D);
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -32.5D + (((tickAnim - 24D) / 6D) * 5.83D);
            yy = 0D + (((tickAnim - 24D) / 6D) * 0D);
            zz = 0D + (((tickAnim - 24D) / 6D) * 0D);
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -1.67D + (((tickAnim - 0D) / 5D) * 1.67D);
            yy = -0.83D + (((tickAnim - 0D) / 5D) * -1.67D);
            zz = 0D + (((tickAnim - 0D) / 5D) * 0D);
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 5D) / 8D) * -2.5D);
            yy = -2.5D + (((tickAnim - 5D) / 8D) * 2.5D);
            zz = 0D + (((tickAnim - 5D) / 8D) * 0D);
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -2.5D + (((tickAnim - 13D) / 7D) * 2.5D);
            yy = 0D + (((tickAnim - 13D) / 7D) * 2.5D);
            zz = 0D + (((tickAnim - 13D) / 7D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0D + (((tickAnim - 20D) / 8D) * -2.5D);
            yy = 2.5D + (((tickAnim - 20D) / 8D) * -2.5D);
            zz = 0D + (((tickAnim - 20D) / 8D) * 0D);
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -2.5D + (((tickAnim - 28D) / 2D) * 0.83D);
            yy = 0D + (((tickAnim - 28D) / 2D) * -0.83D);
            zz = 0D + (((tickAnim - 28D) / 2D) * 0D);
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -1.11D + (((tickAnim - 0D) / 3D) * 1.11D);
            yy = -1.39D + (((tickAnim - 0D) / 3D) * -1.11D);
            zz = 0D + (((tickAnim - 0D) / 3D) * 0D);
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 3D) / 8D) * -2.5D);
            yy = -2.5D + (((tickAnim - 3D) / 8D) * 2.5D);
            zz = 0D + (((tickAnim - 3D) / 8D) * 0D);
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -2.5D + (((tickAnim - 11D) / 7D) * 2.5D);
            yy = 0D + (((tickAnim - 11D) / 7D) * 2.5D);
            zz = 0D + (((tickAnim - 11D) / 7D) * 0D);
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0D + (((tickAnim - 18D) / 8D) * -2.5D);
            yy = 2.5D + (((tickAnim - 18D) / 8D) * -2.5D);
            zz = 0D + (((tickAnim - 18D) / 8D) * 0D);
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -2.5D + (((tickAnim - 26D) / 4D) * 1.39D);
            yy = 0D + (((tickAnim - 26D) / 4D) * -1.39D);
            zz = 0D + (((tickAnim - 26D) / 4D) * 0D);
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.56D + (((tickAnim - 0D) / 2D) * 0.56D);
            yy = -1.94D + (((tickAnim - 0D) / 2D) * -0.56D);
            zz = 0D + (((tickAnim - 0D) / 2D) * 0D);
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 2D) / 7D) * -2.5D);
            yy = -2.5D + (((tickAnim - 2D) / 7D) * 2.5D);
            zz = 0D + (((tickAnim - 2D) / 7D) * 0D);
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = -2.5D + (((tickAnim - 9D) / 8D) * 2.5D);
            yy = 0D + (((tickAnim - 9D) / 8D) * 2.5D);
            zz = 0D + (((tickAnim - 9D) / 8D) * 0D);
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 0D + (((tickAnim - 17D) / 7D) * -2.5D);
            yy = 2.5D + (((tickAnim - 17D) / 7D) * -2.5D);
            zz = 0D + (((tickAnim - 17D) / 7D) * 0D);
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -2.5D + (((tickAnim - 24D) / 6D) * 1.94D);
            yy = 0D + (((tickAnim - 24D) / 6D) * -1.94D);
            zz = 0D + (((tickAnim - 24D) / 6D) * 0D);
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 0D) / 8D) * 4.74742D);
            yy = 2.5D + (((tickAnim - 0D) / 8D) * 4.59348D);
            zz = 0D + (((tickAnim - 0D) / 8D) * -2.1657D);
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 4.74742D + (((tickAnim - 8D) / 7D) * -4.74742D);
            yy = 7.09348D + (((tickAnim - 8D) / 7D) * -9.59348D);
            zz = -2.1657D + (((tickAnim - 8D) / 7D) * 2.1657D);
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 15D) / 8D) * 4.81147D);
            yy = -2.5D + (((tickAnim - 15D) / 8D) * -4.57074D);
            zz = 0D + (((tickAnim - 15D) / 8D) * 1.66238D);
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 4.81147D + (((tickAnim - 23D) / 7D) * -4.81147D);
            yy = -7.07074D + (((tickAnim - 23D) / 7D) * 9.57074D);
            zz = 1.66238D + (((tickAnim - 23D) / 7D) * -1.66238D);
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -1.94D + (((tickAnim - 0D) / 1D) * -0.56D);
            yy = 2.22D + (((tickAnim - 0D) / 1D) * 0.28D);
            zz = 0D + (((tickAnim - 0D) / 1D) * 0D);
        }
        else if (tickAnim >= 1 && tickAnim < 8) {
            xx = -2.5D + (((tickAnim - 1D) / 7D) * 5D);
            yy = 2.5D + (((tickAnim - 1D) / 7D) * -2.5D);
            zz = 0D + (((tickAnim - 1D) / 7D) * 0D);
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 2.5D + (((tickAnim - 8D) / 8D) * -5D);
            yy = 0D + (((tickAnim - 8D) / 8D) * -2.5D);
            zz = 0D + (((tickAnim - 8D) / 8D) * 0D);
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -2.5D + (((tickAnim - 16D) / 7D) * 5D);
            yy = -2.5D + (((tickAnim - 16D) / 7D) * 2.5D);
            zz = 0D + (((tickAnim - 16D) / 7D) * 0D);
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 2.5D + (((tickAnim - 23D) / 7D) * -4.44D);
            yy = 0D + (((tickAnim - 23D) / 7D) * 2.22D);
            zz = 0D + (((tickAnim - 23D) / 7D) * 0D);
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.83D + (((tickAnim - 0D) / 3D) * -1.67D);
            yy = 1.67D + (((tickAnim - 0D) / 3D) * 0.83D);
            zz = 0D + (((tickAnim - 0D) / 3D) * 0D);
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -2.5D + (((tickAnim - 3D) / 7D) * 5D);
            yy = 2.5D + (((tickAnim - 3D) / 7D) * -2.5D);
            zz = 0D + (((tickAnim - 3D) / 7D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 2.5D + (((tickAnim - 10D) / 8D) * -5D);
            yy = 0D + (((tickAnim - 10D) / 8D) * -2.5D);
            zz = 0D + (((tickAnim - 10D) / 8D) * 0D);
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -2.5D + (((tickAnim - 18D) / 7D) * 5D);
            yy = -2.5D + (((tickAnim - 18D) / 7D) * 2.5D);
            zz = 0D + (((tickAnim - 18D) / 7D) * 0D);
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 2.5D + (((tickAnim - 25D) / 5D) * -3.33D);
            yy = 0D + (((tickAnim - 25D) / 5D) * 1.67D);
            zz = 0D + (((tickAnim - 25D) / 5D) * 0D);
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0.28D + (((tickAnim - 0D) / 4D) * -2.78D);
            yy = 1.11D + (((tickAnim - 0D) / 4D) * 1.39D);
            zz = 0D + (((tickAnim - 0D) / 4D) * 0D);
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = -2.5D + (((tickAnim - 4D) / 8D) * 5D);
            yy = 2.5D + (((tickAnim - 4D) / 8D) * -2.5D);
            zz = 0D + (((tickAnim - 4D) / 8D) * 0D);
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 2.5D + (((tickAnim - 12D) / 7D) * -5D);
            yy = 0D + (((tickAnim - 12D) / 7D) * -2.5D);
            zz = 0D + (((tickAnim - 12D) / 7D) * 0D);
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = -2.5D + (((tickAnim - 19D) / 8D) * 5D);
            yy = -2.5D + (((tickAnim - 19D) / 8D) * 2.5D);
            zz = 0D + (((tickAnim - 19D) / 8D) * 0D);
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 2.5D + (((tickAnim - 27D) / 3D) * -2.22D);
            yy = 0D + (((tickAnim - 27D) / 3D) * 1.11D);
            zz = 0D + (((tickAnim - 27D) / 3D) * 0D);
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 1.39D + (((tickAnim - 0D) / 6D) * -3.89D);
            yy = 0.56D + (((tickAnim - 0D) / 6D) * 1.94D);
            zz = 0D + (((tickAnim - 0D) / 6D) * 0D);
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -2.5D + (((tickAnim - 6D) / 7D) * 5D);
            yy = 2.5D + (((tickAnim - 6D) / 7D) * -2.5D);
            zz = 0D + (((tickAnim - 6D) / 7D) * 0D);
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 2.5D + (((tickAnim - 13D) / 8D) * -5D);
            yy = 0D + (((tickAnim - 13D) / 8D) * -2.5D);
            zz = 0D + (((tickAnim - 13D) / 8D) * 0D);
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = -2.5D + (((tickAnim - 21D) / 7D) * 5D);
            yy = -2.5D + (((tickAnim - 21D) / 7D) * 2.5D);
            zz = 0D + (((tickAnim - 21D) / 7D) * 0D);
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 2.5D + (((tickAnim - 28D) / 2D) * -1.11D);
            yy = 0D + (((tickAnim - 28D) / 2D) * 0.56D);
            zz = 0D + (((tickAnim - 28D) / 2D) * 0D);
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 2.5D + (((tickAnim - 0D) / 8D) * -5D);
            yy = 0D + (((tickAnim - 0D) / 8D) * 2.5D);
            zz = 0D + (((tickAnim - 0D) / 8D) * 0D);
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -2.5D + (((tickAnim - 8D) / 7D) * 5D);
            yy = 2.5D + (((tickAnim - 8D) / 7D) * -2.5D);
            zz = 0D + (((tickAnim - 8D) / 7D) * 0D);
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 2.5D + (((tickAnim - 15D) / 8D) * -5D);
            yy = 0D + (((tickAnim - 15D) / 8D) * -2.5D);
            zz = 0D + (((tickAnim - 15D) / 8D) * 0D);
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -2.5D + (((tickAnim - 23D) / 7D) * 5D);
            yy = -2.5D + (((tickAnim - 23D) / 7D) * 2.5D);
            zz = 0D + (((tickAnim - 23D) / 7D) * 0D);
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));

        //He seems to be floating a little:
        this.Thecodontosaurus.offsetY = 0.05F;
    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraThecodontosaurus entity = (EntityPrehistoricFloraThecodontosaurus) entitylivingbaseIn;

        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2D + (((tickAnim - 0D) / 3D) * 1D);
            yy = 5D + (((tickAnim - 0D) / 3D) * -6.66667D);
            zz = 0.00001D + (((tickAnim - 0D) / 3D) * 2.5D);
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3D + (((tickAnim - 3D) / 2D) * -1D);
            yy = -1.66667D + (((tickAnim - 3D) / 2D) * -3.33333D);
            zz = 2.50001D + (((tickAnim - 3D) / 2D) * -2.49999D);
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 2D + (((tickAnim - 5D) / 3D) * 1D);
            yy = -5D + (((tickAnim - 5D) / 3D) * 6.66667D);
            zz = 0.00002D + (((tickAnim - 5D) / 3D) * -2.50001D);
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 3D + (((tickAnim - 8D) / 2D) * -1D);
            yy = 1.66667D + (((tickAnim - 8D) / 2D) * 3.33333D);
            zz = -2.49999D + (((tickAnim - 8D) / 2D) * 2.5D);
        }
        this.setRotateAngle(Basin, Basin.rotateAngleX + (float) Math.toRadians(xx), Basin.rotateAngleY + (float) Math.toRadians(yy), Basin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * 0D);
            yy = -4D + (((tickAnim - 0D) / 3D) * 1.5D);
            zz = 0D + (((tickAnim - 0D) / 3D) * 0D);
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 3D) / 1D) * 0D);
            yy = -2.5D + (((tickAnim - 3D) / 1D) * -0.5D);
            zz = 0D + (((tickAnim - 3D) / 1D) * 0D);
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 4D) / 1D) * 0D);
            yy = -3D + (((tickAnim - 4D) / 1D) * -0.94D);
            zz = 0D + (((tickAnim - 4D) / 1D) * 0D);
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 5D) / 3D) * 0D);
            yy = -3.94D + (((tickAnim - 5D) / 3D) * 1.44D);
            zz = 0D + (((tickAnim - 5D) / 3D) * 0D);
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 8D) / 1D) * 0D);
            yy = -2.5D + (((tickAnim - 8D) / 1D) * -0.5D);
            zz = 0D + (((tickAnim - 8D) / 1D) * 0D);
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 9D) / 1D) * 0D);
            yy = -3D + (((tickAnim - 9D) / 1D) * -1D);
            zz = 0D + (((tickAnim - 9D) / 1D) * 0D);
        }
        this.Basin.offsetX = (float) Math.toRadians(xx);
        this.Basin.offsetY = (float) Math.toRadians(yy);
        this.Basin.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 29.25118D + (((tickAnim - 0D) / 3D) * -64.25118D);
            yy = 9.57892D + (((tickAnim - 0D) / 3D) * -9.57892D);
            zz = 10.40372D + (((tickAnim - 0D) / 3D) * -10.40372D);
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -35D + (((tickAnim - 3D) / 2D) * 4.78325D);
            yy = 0D + (((tickAnim - 3D) / 2D) * 8.48916D);
            zz = 0D + (((tickAnim - 3D) / 2D) * -5.86282D);
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -30.21675D + (((tickAnim - 5D) / 3D) * 20.90209D);
            yy = 8.48916D + (((tickAnim - 5D) / 3D) * 3.98527D);
            zz = -5.86282D + (((tickAnim - 5D) / 3D) * 6.12121D);
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -9.31466D + (((tickAnim - 8D) / 2D) * 38.56584D);
            yy = 12.47443D + (((tickAnim - 8D) / 2D) * -2.89551D);
            zz = 0.25839D + (((tickAnim - 8D) / 2D) * 10.14533D);
        }
        this.setRotateAngle(HindlimbR, HindlimbR.rotateAngleX + (float) Math.toRadians(xx), HindlimbR.rotateAngleY + (float) Math.toRadians(yy), HindlimbR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 36.25D + (((tickAnim - 0D) / 3D) * 23.75D);
            yy = 0D + (((tickAnim - 0D) / 3D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 3D) * 0D);
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 60D + (((tickAnim - 3D) / 1D) * -65.83D);
            yy = 0D + (((tickAnim - 3D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 3D) / 1D) * 0D);
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -5.83D + (((tickAnim - 4D) / 1D) * -17.92D);
            yy = 0D + (((tickAnim - 4D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 4D) / 1D) * 0D);
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -23.75D + (((tickAnim - 5D) / 1D) * 22.08D);
            yy = 0D + (((tickAnim - 5D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 5D) / 1D) * 0D);
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -1.67D + (((tickAnim - 6D) / 1D) * 15.83D);
            yy = 0D + (((tickAnim - 6D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 6D) / 1D) * 0D);
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 14.16D + (((tickAnim - 7D) / 1D) * 5.84D);
            yy = 0D + (((tickAnim - 7D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 7D) / 1D) * 0D);
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 20D + (((tickAnim - 8D) / 2D) * 16.25D);
            yy = 0D + (((tickAnim - 8D) / 2D) * 0D);
            zz = 0D + (((tickAnim - 8D) / 2D) * 0D);
        }
        this.setRotateAngle(KneeR, KneeR.rotateAngleX + (float) Math.toRadians(xx), KneeR.rotateAngleY + (float) Math.toRadians(yy), KneeR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 15.04725D + (((tickAnim - 0D) / 2D) * 6.63275D);
            yy = 0D + (((tickAnim - 0D) / 2D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 2D) * 0D);
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 21.68D + (((tickAnim - 2D) / 1D) * -64.18D);
            yy = 0D + (((tickAnim - 2D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 2D) / 1D) * 0D);
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -42.5D + (((tickAnim - 3D) / 0D) * 8.35D);
            yy = 0D + (((tickAnim - 3D) / 0D) * 0D);
            zz = 0D + (((tickAnim - 3D) / 0D) * 0D);
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -34.15D + (((tickAnim - 3D) / 2D) * 46.69725D);
            yy = 0D + (((tickAnim - 3D) / 2D) * 0D);
            zz = 0D + (((tickAnim - 3D) / 2D) * 0D);
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 12.54725D + (((tickAnim - 5D) / 1D) * -35.81758D);
            yy = 0D + (((tickAnim - 5D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 5D) / 1D) * 0D);
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -23.27033D + (((tickAnim - 6D) / 1D) * -2.06967D);
            yy = 0D + (((tickAnim - 6D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 6D) / 1D) * 0D);
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -25.34D + (((tickAnim - 7D) / 1D) * 27.9345D);
            yy = 0D + (((tickAnim - 7D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 7D) / 1D) * 0D);
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 2.5945D + (((tickAnim - 8D) / 1D) * 30.8055D);
            yy = 0D + (((tickAnim - 8D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 8D) / 1D) * 0D);
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 33.4D + (((tickAnim - 9D) / 1D) * -18.35275D);
            yy = 0D + (((tickAnim - 9D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 9D) / 1D) * 0D);
        }
        this.setRotateAngle(MetatarsalsR, MetatarsalsR.rotateAngleX + (float) Math.toRadians(xx), MetatarsalsR.rotateAngleY + (float) Math.toRadians(yy), MetatarsalsR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 46.25D + (((tickAnim - 0D) / 3D) * 63.75D);
            yy = -0.02D + (((tickAnim - 0D) / 3D) * 0.02D);
            zz = -2.5D + (((tickAnim - 0D) / 3D) * 2.5D);
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 110D + (((tickAnim - 3D) / 1D) * -65.89859D);
            yy = 0D + (((tickAnim - 3D) / 1D) * -2.84805D);
            zz = 0D + (((tickAnim - 3D) / 1D) * 0.09067D);
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 44.10141D + (((tickAnim - 4D) / 1D) * -5.58047D);
            yy = -2.84805D + (((tickAnim - 4D) / 1D) * -3.48658D);
            zz = 0.09067D + (((tickAnim - 4D) / 1D) * 1.46424D);
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 38.52094D + (((tickAnim - 5D) / 1D) * 6.33279D);
            yy = -6.33463D + (((tickAnim - 5D) / 1D) * 1.26677D);
            zz = 1.55491D + (((tickAnim - 5D) / 1D) * -1.95035D);
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 44.85373D + (((tickAnim - 6D) / 1D) * -21.33952D);
            yy = -5.06786D + (((tickAnim - 6D) / 1D) * 0.35863D);
            zz = -0.39544D + (((tickAnim - 6D) / 1D) * 0.90798D);
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 23.51421D + (((tickAnim - 7D) / 1D) * -41.01421D);
            yy = -4.70923D + (((tickAnim - 7D) / 1D) * 4.70923D);
            zz = 0.51254D + (((tickAnim - 7D) / 1D) * -0.51254D);
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -17.5D + (((tickAnim - 8D) / 0D) * -3.74863D);
            yy = 0D + (((tickAnim - 8D) / 0D) * 0.04058D);
            zz = 0D + (((tickAnim - 8D) / 0D) * -1.6677D);
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -21.24863D + (((tickAnim - 8D) / 1D) * 59.99926D);
            yy = 0.04058D + (((tickAnim - 8D) / 1D) * -0.06844D);
            zz = -1.6677D + (((tickAnim - 8D) / 1D) * -1.66557D);
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 38.75063D + (((tickAnim - 9D) / 1D) * 7.49937D);
            yy = -0.02786D + (((tickAnim - 9D) / 1D) * 0.00786D);
            zz = -3.33327D + (((tickAnim - 9D) / 1D) * 0.83327D);
        }
        this.setRotateAngle(PesR, PesR.rotateAngleX + (float) Math.toRadians(xx), PesR.rotateAngleY + (float) Math.toRadians(yy), PesR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -30.21675D + (((tickAnim - 0D) / 3D) * 20.90209D);
            yy = -8.4892D + (((tickAnim - 0D) / 3D) * -3.9852D);
            zz = 5.8628D + (((tickAnim - 0D) / 3D) * -6.1212D);
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -9.31466D + (((tickAnim - 3D) / 2D) * 38.56584D);
            yy = -12.4744D + (((tickAnim - 3D) / 2D) * 2.8955D);
            zz = -0.2584D + (((tickAnim - 3D) / 2D) * -10.1453D);
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 29.25118D + (((tickAnim - 5D) / 3D) * -64.25118D);
            yy = -9.5789D + (((tickAnim - 5D) / 3D) * 9.5789D);
            zz = -10.4037D + (((tickAnim - 5D) / 3D) * 10.4037D);
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -35D + (((tickAnim - 8D) / 2D) * 4.78325D);
            yy = 0D + (((tickAnim - 8D) / 2D) * -8.4892D);
            zz = 0D + (((tickAnim - 8D) / 2D) * 5.8628D);
        }
        this.setRotateAngle(HindlimbL, HindlimbL.rotateAngleX + (float) Math.toRadians(xx), HindlimbL.rotateAngleY + (float) Math.toRadians(yy), HindlimbL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -23.75D + (((tickAnim - 0D) / 1D) * 22.08D);
            yy = 0D + (((tickAnim - 0D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 1D) * 0D);
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -1.67D + (((tickAnim - 1D) / 1D) * 15.83D);
            yy = 0D + (((tickAnim - 1D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 1D) / 1D) * 0D);
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 14.16D + (((tickAnim - 2D) / 1D) * 5.84D);
            yy = 0D + (((tickAnim - 2D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 2D) / 1D) * 0D);
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 20D + (((tickAnim - 3D) / 2D) * 16.25D);
            yy = 0D + (((tickAnim - 3D) / 2D) * 0D);
            zz = 0D + (((tickAnim - 3D) / 2D) * 0D);
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 36.25D + (((tickAnim - 5D) / 3D) * 23.75D);
            yy = 0D + (((tickAnim - 5D) / 3D) * 0D);
            zz = 0D + (((tickAnim - 5D) / 3D) * 0D);
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 60D + (((tickAnim - 8D) / 1D) * -65.83D);
            yy = 0D + (((tickAnim - 8D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 8D) / 1D) * 0D);
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -5.83D + (((tickAnim - 9D) / 1D) * -17.92D);
            yy = 0D + (((tickAnim - 9D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 9D) / 1D) * 0D);
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 12.54725D + (((tickAnim - 0D) / 1D) * -35.81758D);
            yy = 0D + (((tickAnim - 0D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 1D) * 0D);
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -23.27033D + (((tickAnim - 1D) / 1D) * -2.06967D);
            yy = 0D + (((tickAnim - 1D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 1D) / 1D) * 0D);
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -25.34D + (((tickAnim - 2D) / 1D) * 27.9345D);
            yy = 0D + (((tickAnim - 2D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 2D) / 1D) * 0D);
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 2.5945D + (((tickAnim - 3D) / 1D) * 30.8055D);
            yy = 0D + (((tickAnim - 3D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 3D) / 1D) * 0D);
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 33.4D + (((tickAnim - 4D) / 1D) * -18.35275D);
            yy = 0D + (((tickAnim - 4D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 4D) / 1D) * 0D);
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 15.04725D + (((tickAnim - 5D) / 2D) * 6.63275D);
            yy = 0D + (((tickAnim - 5D) / 2D) * 0D);
            zz = 0D + (((tickAnim - 5D) / 2D) * 0D);
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 21.68D + (((tickAnim - 7D) / 1D) * -64.18D);
            yy = 0D + (((tickAnim - 7D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 7D) / 1D) * 0D);
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -42.5D + (((tickAnim - 8D) / 0D) * 8.35D);
            yy = 0D + (((tickAnim - 8D) / 0D) * 0D);
            zz = 0D + (((tickAnim - 8D) / 0D) * 0D);
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -34.15D + (((tickAnim - 8D) / 2D) * 46.69725D);
            yy = 0D + (((tickAnim - 8D) / 2D) * 0D);
            zz = 0D + (((tickAnim - 8D) / 2D) * 0D);
        }
        this.setRotateAngle(MetatarsalsL, MetatarsalsL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalsL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalsL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 38.52094D + (((tickAnim - 0D) / 1D) * 6.33279D);
            yy = 6.3346D + (((tickAnim - 0D) / 1D) * -1.2667D);
            zz = -1.5549D + (((tickAnim - 0D) / 1D) * 1.9503D);
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 44.85373D + (((tickAnim - 1D) / 1D) * -21.33952D);
            yy = 5.0679D + (((tickAnim - 1D) / 1D) * -0.3587D);
            zz = 0.3954D + (((tickAnim - 1D) / 1D) * -0.9079D);
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 23.51421D + (((tickAnim - 2D) / 1D) * -41.01421D);
            yy = 4.7092D + (((tickAnim - 2D) / 1D) * -4.7092D);
            zz = -0.5125D + (((tickAnim - 2D) / 1D) * 0.5125D);
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -17.5D + (((tickAnim - 3D) / 0D) * -3.74863D);
            yy = 0D + (((tickAnim - 3D) / 0D) * -0.0406D);
            zz = 0D + (((tickAnim - 3D) / 0D) * 1.6677D);
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -21.24863D + (((tickAnim - 3D) / 1D) * 59.99926D);
            yy = -0.0406D + (((tickAnim - 3D) / 1D) * 0.0685D);
            zz = 1.6677D + (((tickAnim - 3D) / 1D) * 1.6656D);
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 38.75063D + (((tickAnim - 4D) / 1D) * 7.49937D);
            yy = 0.0279D + (((tickAnim - 4D) / 1D) * -0.0079D);
            zz = 3.3333D + (((tickAnim - 4D) / 1D) * -0.8333D);
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 46.25D + (((tickAnim - 5D) / 3D) * 63.75D);
            yy = 0.02D + (((tickAnim - 5D) / 3D) * -0.02D);
            zz = 2.5D + (((tickAnim - 5D) / 3D) * -2.5D);
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 110D + (((tickAnim - 8D) / 1D) * -65.89859D);
            yy = 0D + (((tickAnim - 8D) / 1D) * 2.848D);
            zz = 0D + (((tickAnim - 8D) / 1D) * -0.0907D);
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 44.10141D + (((tickAnim - 9D) / 1D) * -5.58047D);
            yy = 2.848D + (((tickAnim - 9D) / 1D) * 3.4866D);
            zz = -0.0907D + (((tickAnim - 9D) / 1D) * -1.4642D);
        }
        this.setRotateAngle(PesL, PesL.rotateAngleX + (float) Math.toRadians(xx), PesL.rotateAngleY + (float) Math.toRadians(yy), PesL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -1D + (((tickAnim - 0D) / 3D) * 2.5D);
            yy = -3D + (((tickAnim - 0D) / 3D) * 3D);
            zz = 0D + (((tickAnim - 0D) / 3D) * 0D);
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1.5D + (((tickAnim - 3D) / 2D) * -2.5D);
            yy = 0D + (((tickAnim - 3D) / 2D) * 3D);
            zz = 0D + (((tickAnim - 3D) / 2D) * 0D);
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -1D + (((tickAnim - 5D) / 3D) * 2.5D);
            yy = 3D + (((tickAnim - 5D) / 3D) * -3D);
            zz = 0D + (((tickAnim - 5D) / 3D) * 0D);
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1.5D + (((tickAnim - 8D) / 2D) * -2.5D);
            yy = 0D + (((tickAnim - 8D) / 2D) * -3D);
            zz = 0D + (((tickAnim - 8D) / 2D) * 0D);
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 8.52D + (((tickAnim - 0D) / 3D) * -2.52D);
            yy = -0.28D + (((tickAnim - 0D) / 3D) * -2.22D);
            zz = 0D + (((tickAnim - 0D) / 3D) * 0D);
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 6D + (((tickAnim - 3D) / 2D) * 2.5D);
            yy = -2.5D + (((tickAnim - 3D) / 2D) * 2.5D);
            zz = 0D + (((tickAnim - 3D) / 2D) * 0D);
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 8.5D + (((tickAnim - 5D) / 3D) * -2.5D);
            yy = 0D + (((tickAnim - 5D) / 3D) * 2.5D);
            zz = 0D + (((tickAnim - 5D) / 3D) * 0D);
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 6D + (((tickAnim - 8D) / 2D) * 2.52D);
            yy = 2.5D + (((tickAnim - 8D) / 2D) * -2.78D);
            zz = 0D + (((tickAnim - 8D) / 2D) * 0D);
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 18.46079D + (((tickAnim - 0D) / 2D) * 4.95067D);
            yy = -15.776D + (((tickAnim - 0D) / 2D) * -0.151199999999999D);
            zz = 2.6988D + (((tickAnim - 0D) / 2D) * 0.1632D);
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 23.41146D + (((tickAnim - 2D) / 3D) * -4.95067D);
            yy = -15.9272D + (((tickAnim - 2D) / 3D) * 0.151199999999999D);
            zz = 2.862D + (((tickAnim - 2D) / 3D) * -0.1632D);
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 18.46079D + (((tickAnim - 5D) / 3D) * 4.95067D);
            yy = -15.776D + (((tickAnim - 5D) / 3D) * -0.151199999999999D);
            zz = 2.6988D + (((tickAnim - 5D) / 3D) * 0.1632D);
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 23.41146D + (((tickAnim - 8D) / 2D) * -4.54146D);
            yy = -15.9272D + (((tickAnim - 8D) / 2D) * 0.1372D);
            zz = 2.862D + (((tickAnim - 8D) / 2D) * -0.152D);
        }
        this.setRotateAngle(ForearmR, ForearmR.rotateAngleX + (float) Math.toRadians(xx), ForearmR.rotateAngleY + (float) Math.toRadians(yy), ForearmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -49.67D + (((tickAnim - 0D) / 2D) * 4.17D);
            yy = 0D + (((tickAnim - 0D) / 2D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 2D) * 0D);
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -45.5D + (((tickAnim - 2D) / 1D) * -10D);
            yy = 0D + (((tickAnim - 2D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 2D) / 1D) * 0D);
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -55.5D + (((tickAnim - 3D) / 4D) * 10D);
            yy = 0D + (((tickAnim - 3D) / 4D) * 0D);
            zz = 0D + (((tickAnim - 3D) / 4D) * 0D);
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -45.5D + (((tickAnim - 7D) / 1D) * -10D);
            yy = 0D + (((tickAnim - 7D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 7D) / 1D) * 0D);
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -55.5D + (((tickAnim - 8D) / 2D) * 5.83D);
            yy = 0D + (((tickAnim - 8D) / 2D) * 0D);
            zz = 0D + (((tickAnim - 8D) / 2D) * 0D);
        }
        this.setRotateAngle(ElbowR, ElbowR.rotateAngleX + (float) Math.toRadians(xx), ElbowR.rotateAngleY + (float) Math.toRadians(yy), ElbowR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 17.46079D + (((tickAnim - 0D) / 2D) * 4.95067D);
            yy = 15.77596D + (((tickAnim - 0D) / 2D) * 0.15128D);
            zz = -2.69878D + (((tickAnim - 0D) / 2D) * -0.16321D);
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 22.41146D + (((tickAnim - 2D) / 3D) * -4.95067D);
            yy = 15.92724D + (((tickAnim - 2D) / 3D) * -0.15128D);
            zz = -2.86199D + (((tickAnim - 2D) / 3D) * 0.16321D);
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 17.46079D + (((tickAnim - 5D) / 3D) * 4.95067D);
            yy = 15.77596D + (((tickAnim - 5D) / 3D) * 0.15128D);
            zz = -2.69878D + (((tickAnim - 5D) / 3D) * -0.16321D);
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 22.41146D + (((tickAnim - 8D) / 2D) * -4.54146D);
            yy = 15.92724D + (((tickAnim - 8D) / 2D) * -0.13724D);
            zz = -2.86199D + (((tickAnim - 8D) / 2D) * 0.15199D);
        }
        this.setRotateAngle(ForearmL, ForearmL.rotateAngleX + (float) Math.toRadians(xx), ForearmL.rotateAngleY + (float) Math.toRadians(yy), ForearmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -49.67D + (((tickAnim - 0D) / 2D) * 4.17D);
            yy = 0D + (((tickAnim - 0D) / 2D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 2D) * 0D);
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -45.5D + (((tickAnim - 2D) / 1D) * -10D);
            yy = 0D + (((tickAnim - 2D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 2D) / 1D) * 0D);
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -55.5D + (((tickAnim - 3D) / 4D) * 10D);
            yy = 0D + (((tickAnim - 3D) / 4D) * 0D);
            zz = 0D + (((tickAnim - 3D) / 4D) * 0D);
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -45.5D + (((tickAnim - 7D) / 1D) * -10D);
            yy = 0D + (((tickAnim - 7D) / 1D) * 0D);
            zz = 0D + (((tickAnim - 7D) / 1D) * 0D);
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -55.5D + (((tickAnim - 8D) / 2D) * 5.83D);
            yy = 0D + (((tickAnim - 8D) / 2D) * 0D);
            zz = 0D + (((tickAnim - 8D) / 2D) * 0D);
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -7.67D + (((tickAnim - 0D) / 2D) * 1.67D);
            yy = -0.83D + (((tickAnim - 0D) / 2D) * -1.67D);
            zz = 0D + (((tickAnim - 0D) / 2D) * 0D);
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -6D + (((tickAnim - 2D) / 2D) * -2.5D);
            yy = -2.5D + (((tickAnim - 2D) / 2D) * 2.5D);
            zz = 0D + (((tickAnim - 2D) / 2D) * 0D);
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -8.5D + (((tickAnim - 4D) / 3D) * 2.5D);
            yy = 0D + (((tickAnim - 4D) / 3D) * 2.5D);
            zz = 0D + (((tickAnim - 4D) / 3D) * 0D);
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -6D + (((tickAnim - 7D) / 2D) * -2.5D);
            yy = 2.5D + (((tickAnim - 7D) / 2D) * -2.5D);
            zz = 0D + (((tickAnim - 7D) / 2D) * 0D);
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -8.5D + (((tickAnim - 9D) / 1D) * 0.83D);
            yy = 0D + (((tickAnim - 9D) / 1D) * -0.83D);
            zz = 0D + (((tickAnim - 9D) / 1D) * 0D);
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -3.11D + (((tickAnim - 0D) / 1D) * 1.11D);
            yy = -1.39D + (((tickAnim - 0D) / 1D) * -1.11D);
            zz = 0D + (((tickAnim - 0D) / 1D) * 0D);
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -2D + (((tickAnim - 1D) / 2D) * -2.5D);
            yy = -2.5D + (((tickAnim - 1D) / 2D) * 2.5D);
            zz = 0D + (((tickAnim - 1D) / 2D) * 0D);
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -4.5D + (((tickAnim - 3D) / 3D) * 2.5D);
            yy = 0D + (((tickAnim - 3D) / 3D) * 2.5D);
            zz = 0D + (((tickAnim - 3D) / 3D) * 0D);
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -2D + (((tickAnim - 6D) / 3D) * -2.5D);
            yy = 2.5D + (((tickAnim - 6D) / 3D) * -2.5D);
            zz = 0D + (((tickAnim - 6D) / 3D) * 0D);
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -4.5D + (((tickAnim - 9D) / 1D) * 1.39D);
            yy = 0D + (((tickAnim - 9D) / 1D) * -1.39D);
            zz = 0D + (((tickAnim - 9D) / 1D) * 0D);
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -0.56D + (((tickAnim - 0D) / 1D) * 0.56D);
            yy = -1.94D + (((tickAnim - 0D) / 1D) * -0.56D);
            zz = 0D + (((tickAnim - 0D) / 1D) * 0D);
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 1D) / 2D) * -2.5D);
            yy = -2.5D + (((tickAnim - 1D) / 2D) * 2.5D);
            zz = 0D + (((tickAnim - 1D) / 2D) * 0D);
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -2.5D + (((tickAnim - 3D) / 3D) * 2.5D);
            yy = 0D + (((tickAnim - 3D) / 3D) * 2.5D);
            zz = 0D + (((tickAnim - 3D) / 3D) * 0D);
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 6D) / 2D) * -2.5D);
            yy = 2.5D + (((tickAnim - 6D) / 2D) * -2.5D);
            zz = 0D + (((tickAnim - 6D) / 2D) * 0D);
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.5D + (((tickAnim - 8D) / 2D) * 1.94D);
            yy = 0D + (((tickAnim - 8D) / 2D) * -1.94D);
            zz = 0D + (((tickAnim - 8D) / 2D) * 0D);
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * 4.74742D);
            yy = 2.5D + (((tickAnim - 0D) / 3D) * 4.59348D);
            zz = 0D + (((tickAnim - 0D) / 3D) * -2.1657D);
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 4.74742D + (((tickAnim - 3D) / 2D) * -4.74742D);
            yy = 7.09348D + (((tickAnim - 3D) / 2D) * -9.59348D);
            zz = -2.1657D + (((tickAnim - 3D) / 2D) * 2.1657D);
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 5D) / 3D) * 4.81147D);
            yy = -2.5D + (((tickAnim - 5D) / 3D) * -4.57074D);
            zz = 0D + (((tickAnim - 5D) / 3D) * 1.66238D);
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 4.81147D + (((tickAnim - 8D) / 2D) * -4.81147D);
            yy = -7.07074D + (((tickAnim - 8D) / 2D) * 9.57074D);
            zz = 1.66238D + (((tickAnim - 8D) / 2D) * -1.66238D);
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -2.5D + (((tickAnim - 0D) / 3D) * 5D);
            yy = 2.5D + (((tickAnim - 0D) / 3D) * -2.5D);
            zz = 0D + (((tickAnim - 0D) / 3D) * 0D);
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2.5D + (((tickAnim - 3D) / 2D) * -5D);
            yy = 0D + (((tickAnim - 3D) / 2D) * -2.5D);
            zz = 0D + (((tickAnim - 3D) / 2D) * 0D);
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -2.5D + (((tickAnim - 5D) / 3D) * 5D);
            yy = -2.5D + (((tickAnim - 5D) / 3D) * 2.5D);
            zz = 0D + (((tickAnim - 5D) / 3D) * 0D);
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2.5D + (((tickAnim - 8D) / 2D) * -4.44D);
            yy = 0D + (((tickAnim - 8D) / 2D) * 2.22D);
            zz = 0D + (((tickAnim - 8D) / 2D) * 0D);
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -1.83D + (((tickAnim - 0D) / 1D) * -1.67D);
            yy = 1.67D + (((tickAnim - 0D) / 1D) * 0.83D);
            zz = 0D + (((tickAnim - 0D) / 1D) * 0D);
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -3.5D + (((tickAnim - 1D) / 2D) * 5D);
            yy = 2.5D + (((tickAnim - 1D) / 2D) * -2.5D);
            zz = 0D + (((tickAnim - 1D) / 2D) * 0D);
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 1.5D + (((tickAnim - 3D) / 3D) * -5D);
            yy = 0D + (((tickAnim - 3D) / 3D) * -2.5D);
            zz = 0D + (((tickAnim - 3D) / 3D) * 0D);
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -3.5D + (((tickAnim - 6D) / 2D) * 5D);
            yy = -2.5D + (((tickAnim - 6D) / 2D) * 2.5D);
            zz = 0D + (((tickAnim - 6D) / 2D) * 0D);
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1.5D + (((tickAnim - 8D) / 2D) * -3.33D);
            yy = 0D + (((tickAnim - 8D) / 2D) * 1.67D);
            zz = 0D + (((tickAnim - 8D) / 2D) * 0D);
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -1.22D + (((tickAnim - 0D) / 2D) * -3.28D);
            yy = 1.11D + (((tickAnim - 0D) / 2D) * 1.39D);
            zz = 0D + (((tickAnim - 0D) / 2D) * 0D);
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -4.5D + (((tickAnim - 2D) / 2D) * 5D);
            yy = 2.5D + (((tickAnim - 2D) / 2D) * -2.5D);
            zz = 0D + (((tickAnim - 2D) / 2D) * 0D);
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0.5D + (((tickAnim - 4D) / 3D) * -5D);
            yy = 0D + (((tickAnim - 4D) / 3D) * -2.5D);
            zz = 0D + (((tickAnim - 4D) / 3D) * 0D);
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -4.5D + (((tickAnim - 7D) / 2D) * 5D);
            yy = -2.5D + (((tickAnim - 7D) / 2D) * 2.5D);
            zz = 0D + (((tickAnim - 7D) / 2D) * 0D);
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0.5D + (((tickAnim - 9D) / 1D) * -1.72D);
            yy = 0D + (((tickAnim - 9D) / 1D) * 1.11D);
            zz = 0D + (((tickAnim - 9D) / 1D) * 0D);
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.5D + (((tickAnim - 0D) / 2D) * -5D);
            yy = 0D + (((tickAnim - 0D) / 2D) * 2.5D);
            zz = 0D + (((tickAnim - 0D) / 2D) * 0D);
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -5.5D + (((tickAnim - 2D) / 2D) * 5D);
            yy = 2.5D + (((tickAnim - 2D) / 2D) * -2.5D);
            zz = 0D + (((tickAnim - 2D) / 2D) * 0D);
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -0.5D + (((tickAnim - 4D) / 4D) * -5D);
            yy = 0D + (((tickAnim - 4D) / 4D) * -2.5D);
            zz = 0D + (((tickAnim - 4D) / 4D) * 0D);
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -5.5D + (((tickAnim - 8D) / 2D) * 5D);
            yy = -2.5D + (((tickAnim - 8D) / 2D) * 2.5D);
            zz = 0D + (((tickAnim - 8D) / 2D) * 0D);
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));


    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraThecodontosaurus ee = (EntityPrehistoricFloraThecodontosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {

            if (!ee.getIsMoving()) {
                return;
            }

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

            }
            else { //Walking
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                return;
            }
            //moving in water
            return;
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraThecodontosaurus e = (EntityPrehistoricFloraThecodontosaurus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        //setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.DRINK_ANIMATION);
        animator.startKeyframe(10);
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(10);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(Head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck3, (float) Math.toRadians(20.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(20.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck1, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.EAT_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(Head, (float) Math.toRadians(-28), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck3, (float) Math.toRadians(27.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(20.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck1, (float) Math.toRadians(32.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(Chest, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck3, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Head, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
