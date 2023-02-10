package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelWarneticaris extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer antennaR2;
    private final AdvancedModelRenderer antennaL2;
    private final AdvancedModelRenderer eyeR;
    private final AdvancedModelRenderer eyeL;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legRs;
    private final AdvancedModelRenderer legRs2;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legLs;
    private final AdvancedModelRenderer legLs2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer legL9;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer legR9;
    private final AdvancedModelRenderer gillR;
    private final AdvancedModelRenderer gillL;
    private final AdvancedModelRenderer gillL2;
    private final AdvancedModelRenderer gillL3;
    private final AdvancedModelRenderer gillR2;
    private final AdvancedModelRenderer gillR3;
    private final AdvancedModelRenderer seg;
    private final AdvancedModelRenderer gillR4;
    private final AdvancedModelRenderer gillL4;
    private final AdvancedModelRenderer seg2;
    private final AdvancedModelRenderer gillR5;
    private final AdvancedModelRenderer gillL5;
    private final AdvancedModelRenderer seg3;
    private final AdvancedModelRenderer seg4;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;

    public ModelWarneticaris() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 28.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 33, 0, -2.5F, -14.25F, -2.25F, 5, 4, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 39, 43, -2.5F, -14.25F, -7.25F, 5, 3, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -15.0F, -8.0F, 8, 12, 17, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -15.0F, -8.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.6545F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 29, -3.5F, 0.0F, -7.0F, 8, 9, 7, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -14.25F, -7.25F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.5585F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 39, -2.0F, 0.0F, -6.0F, 4, 3, 6, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-0.25F, -10.0F, -11.5F);
        this.body.addChild(antennaR);
        this.setRotateAngle(antennaR, -0.2182F, 0.2618F, -0.0436F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 30, 22, 0.0F, -4.5F, -12.0F, 0, 5, 12, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.25F, -10.0F, -11.5F);
        this.body.addChild(antennaL);
        this.setRotateAngle(antennaL, -0.2182F, -0.2618F, 0.0436F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 30, 22, 0.0F, -4.5F, -12.0F, 0, 5, 12, 0.0F, true));

        this.antennaR2 = new AdvancedModelRenderer(this);
        this.antennaR2.setRotationPoint(-0.25F, -10.0F, -11.25F);
        this.body.addChild(antennaR2);
        this.setRotateAngle(antennaR2, 0.3927F, 0.0873F, 0.0436F);
        this.antennaR2.cubeList.add(new ModelBox(antennaR2, 23, 17, 0.0F, -4.5F, -12.0F, 0, 5, 12, 0.0F, false));

        this.antennaL2 = new AdvancedModelRenderer(this);
        this.antennaL2.setRotationPoint(0.25F, -10.0F, -11.25F);
        this.body.addChild(antennaL2);
        this.setRotateAngle(antennaL2, 0.3927F, -0.0873F, -0.0436F);
        this.antennaL2.cubeList.add(new ModelBox(antennaL2, 23, 17, 0.0F, -4.5F, -12.0F, 0, 5, 12, 0.0F, true));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(-1.0F, -10.5F, -11.5F);
        this.body.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.4363F, 0.3927F, 0.0F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 8, 13, -0.75F, -0.5F, -2.25F, 1, 1, 2, 0.0F, false));
        this.eyeR.cubeList.add(new ModelBox(eyeR, 11, 0, -1.25F, -1.0F, -2.75F, 2, 2, 1, 0.0F, false));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(1.0F, -10.5F, -11.5F);
        this.body.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.4363F, -0.3927F, 0.0F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 8, 13, -0.25F, -0.5F, -2.25F, 1, 1, 2, 0.0F, true));
        this.eyeL.cubeList.add(new ModelBox(eyeL, 11, 0, -0.75F, -1.0F, -2.75F, 2, 2, 1, 0.0F, true));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-1.75F, -10.5F, -9.0F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, 1.6581F, 0.0436F, 0.2182F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 29, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.legRs = new AdvancedModelRenderer(this);
        this.legRs.setRotationPoint(0.0F, 4.0F, -0.5F);
        this.legR.addChild(legRs);
        this.setRotateAngle(legRs, -2.7053F, 0.0F, 0.0F);
        this.legRs.cubeList.add(new ModelBox(legRs, 0, 45, -0.4F, -0.5F, -1.0F, 1, 6, 2, 0.0F, false));

        this.legRs2 = new AdvancedModelRenderer(this);
        this.legRs2.setRotationPoint(0.0F, 5.5F, 0.5F);
        this.legRs.addChild(legRs2);
        this.setRotateAngle(legRs2, 0.48F, -0.0873F, 0.0F);
        this.legRs2.cubeList.add(new ModelBox(legRs2, 0, 9, 0.0F, -0.75F, -3.5F, 0, 4, 4, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(1.75F, -10.5F, -9.0F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, 1.6581F, -0.0436F, -0.2182F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 29, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, true));

        this.legLs = new AdvancedModelRenderer(this);
        this.legLs.setRotationPoint(0.0F, 4.0F, -0.5F);
        this.legL.addChild(legLs);
        this.setRotateAngle(legLs, -2.7053F, 0.0F, 0.0F);
        this.legLs.cubeList.add(new ModelBox(legLs, 0, 45, -0.6F, -0.5F, -1.0F, 1, 6, 2, 0.0F, true));

        this.legLs2 = new AdvancedModelRenderer(this);
        this.legLs2.setRotationPoint(0.0F, 5.5F, 0.5F);
        this.legLs.addChild(legLs2);
        this.setRotateAngle(legLs2, 0.48F, 0.0873F, 0.0F);
        this.legLs2.cubeList.add(new ModelBox(legLs2, 0, 9, 0.0F, -0.75F, -3.5F, 0, 4, 4, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.25F, -11.5F, -6.0F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, -0.2618F, 0.3491F);
        this.legR2.cubeList.add(new ModelBox(legR2, 28, 45, 0.0F, 0.0F, -0.5F, 0, 9, 3, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.25F, -11.5F, -6.0F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.2618F, -0.3491F);
        this.legL2.cubeList.add(new ModelBox(legL2, 28, 45, 0.0F, 0.0F, -0.5F, 0, 9, 3, 0.0F, true));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.25F, -11.5F, -5.5F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0436F, 0.2618F, -0.3491F);
        this.legL3.cubeList.add(new ModelBox(legL3, 28, 45, 0.0F, 0.0F, -0.5F, 0, 9, 3, 0.0F, true));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.25F, -11.5F, -5.0F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, 0.0873F, 0.2618F, -0.3491F);
        this.legL4.cubeList.add(new ModelBox(legL4, 28, 45, 0.0F, 0.0F, -0.5F, 0, 9, 3, 0.0F, true));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.25F, -11.5F, -4.5F);
        this.body.addChild(legL5);
        this.setRotateAngle(legL5, 0.1309F, 0.2618F, -0.3491F);
        this.legL5.cubeList.add(new ModelBox(legL5, 28, 45, 0.0F, 0.0F, -0.5F, 0, 9, 3, 0.0F, true));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(0.25F, -11.5F, -4.0F);
        this.body.addChild(legL6);
        this.setRotateAngle(legL6, 0.1745F, 0.2618F, -0.3491F);
        this.legL6.cubeList.add(new ModelBox(legL6, 28, 45, 0.0F, 0.0F, -0.5F, 0, 9, 3, 0.0F, true));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(0.25F, -11.5F, -3.5F);
        this.body.addChild(legL7);
        this.setRotateAngle(legL7, 0.2182F, 0.2618F, -0.3491F);
        this.legL7.cubeList.add(new ModelBox(legL7, 28, 45, 0.0F, 0.0F, -0.5F, 0, 9, 3, 0.0F, true));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(0.25F, -11.5F, -3.0F);
        this.body.addChild(legL8);
        this.setRotateAngle(legL8, 0.2618F, 0.2618F, -0.3491F);
        this.legL8.cubeList.add(new ModelBox(legL8, 28, 45, 0.0F, 0.0F, -0.5F, 0, 9, 3, 0.0F, true));

        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(0.25F, -11.5F, -2.5F);
        this.body.addChild(legL9);
        this.setRotateAngle(legL9, 0.3054F, 0.2618F, -0.3491F);
        this.legL9.cubeList.add(new ModelBox(legL9, 28, 45, 0.0F, 0.0F, -0.5F, 0, 9, 3, 0.0F, true));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.25F, -11.5F, -5.5F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0436F, -0.2618F, 0.3491F);
        this.legR3.cubeList.add(new ModelBox(legR3, 28, 45, 0.0F, 0.0F, -0.5F, 0, 9, 3, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.25F, -11.5F, -5.0F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, 0.0873F, -0.2618F, 0.3491F);
        this.legR4.cubeList.add(new ModelBox(legR4, 28, 45, 0.0F, 0.0F, -0.5F, 0, 9, 3, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.25F, -11.5F, -4.5F);
        this.body.addChild(legR5);
        this.setRotateAngle(legR5, 0.1309F, -0.2618F, 0.3491F);
        this.legR5.cubeList.add(new ModelBox(legR5, 28, 45, 0.0F, 0.0F, -0.5F, 0, 9, 3, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-0.25F, -11.5F, -4.0F);
        this.body.addChild(legR6);
        this.setRotateAngle(legR6, 0.1745F, -0.2618F, 0.3491F);
        this.legR6.cubeList.add(new ModelBox(legR6, 28, 45, 0.0F, 0.0F, -0.5F, 0, 9, 3, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-0.25F, -11.5F, -3.5F);
        this.body.addChild(legR7);
        this.setRotateAngle(legR7, 0.2182F, -0.2618F, 0.3491F);
        this.legR7.cubeList.add(new ModelBox(legR7, 28, 45, 0.0F, 0.0F, -0.5F, 0, 9, 3, 0.0F, false));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(-0.25F, -11.5F, -3.0F);
        this.body.addChild(legR8);
        this.setRotateAngle(legR8, 0.2618F, -0.2618F, 0.3491F);
        this.legR8.cubeList.add(new ModelBox(legR8, 28, 45, 0.0F, 0.0F, -0.5F, 0, 9, 3, 0.0F, false));

        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(-0.25F, -11.5F, -2.5F);
        this.body.addChild(legR9);
        this.setRotateAngle(legR9, 0.3054F, -0.2618F, 0.3491F);
        this.legR9.cubeList.add(new ModelBox(legR9, 28, 45, 0.0F, 0.0F, -0.5F, 0, 9, 3, 0.0F, false));

        this.gillR = new AdvancedModelRenderer(this);
        this.gillR.setRotationPoint(-1.0F, -10.5F, -1.0F);
        this.body.addChild(gillR);
        this.setRotateAngle(gillR, 0.4363F, -0.5236F, 0.0436F);
        this.gillR.cubeList.add(new ModelBox(gillR, 12, 5, 0.0F, 0.0F, -0.5F, 0, 7, 2, 0.0F, false));

        this.gillL = new AdvancedModelRenderer(this);
        this.gillL.setRotationPoint(1.0F, -10.5F, -1.0F);
        this.body.addChild(gillL);
        this.setRotateAngle(gillL, 0.4363F, 0.5236F, -0.0436F);
        this.gillL.cubeList.add(new ModelBox(gillL, 12, 5, 0.0F, 0.0F, -0.5F, 0, 7, 2, 0.0F, true));

        this.gillL2 = new AdvancedModelRenderer(this);
        this.gillL2.setRotationPoint(1.0F, -10.5F, 1.0F);
        this.body.addChild(gillL2);
        this.setRotateAngle(gillL2, 0.4363F, 0.5236F, -0.0436F);
        this.gillL2.cubeList.add(new ModelBox(gillL2, 12, 5, 0.0F, 0.0F, -0.5F, 0, 7, 2, 0.0F, true));

        this.gillL3 = new AdvancedModelRenderer(this);
        this.gillL3.setRotationPoint(1.0F, -10.5F, 3.0F);
        this.body.addChild(gillL3);
        this.setRotateAngle(gillL3, 0.4363F, 0.5236F, -0.0436F);
        this.gillL3.cubeList.add(new ModelBox(gillL3, 12, 5, 0.0F, 0.0F, -0.5F, 0, 7, 2, 0.0F, true));

        this.gillR2 = new AdvancedModelRenderer(this);
        this.gillR2.setRotationPoint(-1.0F, -10.5F, 1.0F);
        this.body.addChild(gillR2);
        this.setRotateAngle(gillR2, 0.4363F, -0.5236F, 0.0436F);
        this.gillR2.cubeList.add(new ModelBox(gillR2, 12, 5, 0.0F, 0.0F, -0.5F, 0, 7, 2, 0.0F, false));

        this.gillR3 = new AdvancedModelRenderer(this);
        this.gillR3.setRotationPoint(-1.0F, -10.5F, 3.0F);
        this.body.addChild(gillR3);
        this.setRotateAngle(gillR3, 0.4363F, -0.5236F, 0.0436F);
        this.gillR3.cubeList.add(new ModelBox(gillR3, 12, 5, 0.0F, 0.0F, -0.5F, 0, 7, 2, 0.0F, false));

        this.seg = new AdvancedModelRenderer(this);
        this.seg.setRotationPoint(0.0F, -13.5F, 4.5F);
        this.body.addChild(seg);
        this.setRotateAngle(seg, -0.0436F, 0.0F, 0.0F);
        this.seg.cubeList.add(new ModelBox(seg, 0, 7, -2.0F, -0.75F, 0.0F, 4, 4, 2, 0.0F, false));

        this.gillR4 = new AdvancedModelRenderer(this);
        this.gillR4.setRotationPoint(-1.0F, 3.0F, 0.5F);
        this.seg.addChild(gillR4);
        this.setRotateAngle(gillR4, 0.6109F, -0.5236F, 0.0436F);
        this.gillR4.cubeList.add(new ModelBox(gillR4, 12, 5, 0.0F, -1.0F, -0.5F, 0, 7, 2, 0.0F, false));

        this.gillL4 = new AdvancedModelRenderer(this);
        this.gillL4.setRotationPoint(1.0F, 3.0F, 0.5F);
        this.seg.addChild(gillL4);
        this.setRotateAngle(gillL4, 0.6109F, 0.5236F, -0.0436F);
        this.gillL4.cubeList.add(new ModelBox(gillL4, 12, 5, 0.0F, -1.0F, -0.5F, 0, 7, 2, 0.0F, true));

        this.seg2 = new AdvancedModelRenderer(this);
        this.seg2.setRotationPoint(0.0F, -0.25F, 2.0F);
        this.seg.addChild(seg2);
        this.setRotateAngle(seg2, -0.0436F, 0.0F, 0.0F);
        this.seg2.cubeList.add(new ModelBox(seg2, 0, 0, -2.0F, -0.5F, 0.0F, 4, 4, 3, 0.01F, false));

        this.gillR5 = new AdvancedModelRenderer(this);
        this.gillR5.setRotationPoint(-1.0F, 3.25F, 0.5F);
        this.seg2.addChild(gillR5);
        this.setRotateAngle(gillR5, 0.7854F, -0.5236F, 0.0436F);
        this.gillR5.cubeList.add(new ModelBox(gillR5, 12, 5, 0.0F, -2.0F, -0.5F, 0, 7, 2, 0.0F, false));

        this.gillL5 = new AdvancedModelRenderer(this);
        this.gillL5.setRotationPoint(1.0F, 3.25F, 0.5F);
        this.seg2.addChild(gillL5);
        this.setRotateAngle(gillL5, 0.7854F, 0.5236F, -0.0436F);
        this.gillL5.cubeList.add(new ModelBox(gillL5, 12, 5, 0.0F, -2.0F, -0.5F, 0, 7, 2, 0.0F, true));

        this.seg3 = new AdvancedModelRenderer(this);
        this.seg3.setRotationPoint(0.0F, 0.25F, 2.975F);
        this.seg2.addChild(seg3);
        this.setRotateAngle(seg3, -0.0436F, 0.0F, 0.0F);
        this.seg3.cubeList.add(new ModelBox(seg3, 47, 23, -1.5F, -0.5F, 0.0F, 3, 3, 6, -0.01F, false));

        this.seg4 = new AdvancedModelRenderer(this);
        this.seg4.setRotationPoint(0.0F, -0.4F, 5.95F);
        this.seg3.addChild(seg4);
        this.seg4.cubeList.add(new ModelBox(seg4, 33, 11, -1.0F, 0.0F, -0.5F, 2, 2, 4, 0.0F, false));
        this.seg4.cubeList.add(new ModelBox(seg4, 0, 45, -0.5F, 0.0F, 3.5F, 1, 1, 8, 0.0F, false));
        this.seg4.cubeList.add(new ModelBox(seg4, 56, 36, 0.0F, -0.35F, 0.75F, 0, 1, 9, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, 0.5F, 0.0F);
        this.seg4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.4363F, 0.3491F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 46, -1.0F, 0.5F, 0.0F, 1, 1, 8, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 0.5F, 0.0F);
        this.seg4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.4363F, -0.3491F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 46, 0.0F, 0.5F, 0.0F, 1, 1, 8, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 );
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetY = -0.19F;
        this.body.offsetZ = -0.05F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, -0.3811F, (float) Math.toRadians(90), 0.2956F);
        this.setRotateAngle(cube_r1, 0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.5585F, 0.0F, 0.0F);
        this.setRotateAngle(antennaR, -0.5672F, 0.2618F, -0.0436F);
        this.setRotateAngle(antennaL, -0.0873F, -0.2618F, 0.0436F);
        this.setRotateAngle(antennaR2, 0.829F, 0.0873F, 0.0436F);
        this.setRotateAngle(antennaL2, 0.4363F, -0.0873F, -0.0436F);
        this.setRotateAngle(eyeR, 0.4363F, 0.3927F, 0.0F);
        this.setRotateAngle(eyeL, 0.4363F, -0.3927F, 0.0F);
        this.setRotateAngle(legR, 1.2654F, 0.0436F, 0.2182F);
        this.setRotateAngle(legRs, -2.2689F, 0.0F, 0.0F);
        this.setRotateAngle(legRs2, -0.2182F, -0.0873F, 0.0F);
        this.setRotateAngle(legL, 1.6581F, -0.0436F, -0.2182F);
        this.setRotateAngle(legLs, -2.7053F, 0.0F, 0.0F);
        this.setRotateAngle(legLs2, 0.48F, 0.0873F, 0.0F);
        this.setRotateAngle(legR2, 0.0F, -0.2618F, 0.3491F);
        this.setRotateAngle(legL2, 0.0F, 0.2618F, -0.3491F);
        this.setRotateAngle(legL3, 0.0436F, 0.2618F, -0.3491F);
        this.setRotateAngle(legL4, 0.0873F, 0.2618F, -0.3491F);
        this.setRotateAngle(legL5, 0.1309F, 0.2618F, -0.3491F);
        this.setRotateAngle(legL6, 0.1745F, 0.2618F, -0.3491F);
        this.setRotateAngle(legL7, 0.2182F, 0.2618F, -0.3491F);
        this.setRotateAngle(legL8, 0.2618F, 0.2618F, -0.3491F);
        this.setRotateAngle(legL9, 0.3054F, 0.2618F, -0.3491F);
        this.setRotateAngle(legR3, 0.0436F, -0.2618F, 0.3491F);
        this.setRotateAngle(legR4, 0.0873F, -0.2618F, 0.3491F);
        this.setRotateAngle(legR5, 0.1309F, -0.2618F, 0.3491F);
        this.setRotateAngle(legR6, 0.1745F, -0.2618F, 0.3491F);
        this.setRotateAngle(legR7, 0.2182F, -0.2618F, 0.3491F);
        this.setRotateAngle(legR8, 0.2618F, -0.2618F, 0.3491F);
        this.setRotateAngle(legR9, 0.3054F, -0.2618F, 0.3491F);
        this.setRotateAngle(gillR, 0.4363F, -0.5236F, 0.0436F);
        this.setRotateAngle(gillL, 0.4363F, 0.5236F, -0.0436F);
        this.setRotateAngle(gillL2, 0.4363F, 0.5236F, -0.0436F);
        this.setRotateAngle(gillL3, 0.4363F, 0.5236F, -0.0436F);
        this.setRotateAngle(gillR2, 0.4363F, -0.5236F, 0.0436F);
        this.setRotateAngle(gillR3, 0.4363F, -0.5236F, 0.0436F);
        this.setRotateAngle(seg, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(gillR4, 0.6109F, -0.5236F, 0.0436F);
        this.setRotateAngle(gillL4, 0.6109F, 0.5236F, -0.0436F);
        this.setRotateAngle(seg2, 0.3044F, -0.218F, 0.0097F);
        this.setRotateAngle(gillR5, 0.7854F, -0.5236F, 0.0436F);
        this.setRotateAngle(gillL5, 0.7854F, 0.5236F, -0.0436F);
        this.setRotateAngle(seg3, 0.2233F, -0.2129F, -0.0479F);
        this.setRotateAngle(seg4, 0.3054F, -0.2182F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0F, 0.4363F, 0.3491F);
        this.setRotateAngle(cube_r4, 0.0F, -0.4363F, -0.3491F);
        this.body.offsetY = -0.4F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        AdvancedModelRenderer[] Tail = {this.seg, this.seg2, this.seg3, this.seg4};

        float speed = 0.2F;
        if (!e.isInWater()) {
            speed = 0.45F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.flap(antennaL, 0.3F, -0.2F, true, 0f, 0.2f, f2, 1F);
            this.flap(antennaR, 0.3F, 0.2F, true, 0f, -0.2f, f2, 1F);

            this.walk(antennaL, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);
            this.walk(antennaR, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);

            this.walk(antennaL2, 0.6F, 0.15F, false, 0f, 0f, f2, 1F);

            this.walk(antennaR2, 0.6F, 0.15F, false, 0f, 0f, f2, 1F);

            float tailVdegree = 0.15F;
            float tailHdegree = 0.3F;
            this.chainWave(Tail, speed*0.5F, tailVdegree, -2, f2, 1);


            float speedLeg = 1.2F;
            float degreeLeg = 0.1F;
            this.flap(legL, speedLeg, -degreeLeg, false, 0, 0, f2, 0.7F);
            this.flap(legR, speedLeg, degreeLeg, false, 0, 0, f2, 0.7F);
            this.flap(legL2, speedLeg, -degreeLeg, false, 0.5F, 0, f2, 0.7F);
            this.flap(legR2, speedLeg, degreeLeg, false, 0.5F, 0, f2, 0.7F);
            this.flap(legL3, speedLeg, -degreeLeg, false, 1.0F, 0, f2, 0.7F);
            this.flap(legR3, speedLeg, degreeLeg, false, 1.0F, 0, f2, 0.7F);
            this.flap(legL4, speedLeg, -degreeLeg, false, 1.5F, 0, f2, 0.7F);
            this.flap(legR4, speedLeg, degreeLeg, false, 1.5F, 0, f2, 0.7F);
            this.flap(legL5, speedLeg, -degreeLeg, false, 2.0F, 0, f2, 0.7F);
            this.flap(legR5, speedLeg, degreeLeg, false, 2.0F, 0, f2, 0.7F);
            this.flap(legL6, speedLeg, -degreeLeg, false, 2.5F, 0, f2, 0.7F);
            this.flap(legR6, speedLeg, degreeLeg, false, 2.5F, 0, f2, 0.7F);
            this.flap(legL7, speedLeg, -degreeLeg, false, 3.0F, 0, f2, 0.7F);
            this.flap(legR7, speedLeg, degreeLeg, false, 3.0F, 0, f2, 0.7F);
            this.flap(legL8, speedLeg, -degreeLeg, false, 3.5F, 0, f2, 0.7F);
            this.flap(legR8, speedLeg, degreeLeg, false, 3.5F, 0, f2, 0.7F);
            this.flap(legL9, speedLeg, -degreeLeg, false, 4.0F, 0, f2, 0.7F);
            this.flap(legR9, speedLeg, degreeLeg, false, 4.0F, 0, f2, 0.7F);
            this.flap(gillL, speedLeg, -degreeLeg, false, 4.5F, 0, f2, 0.7F);
            this.flap(gillR, speedLeg, degreeLeg, false, 4.5F, 0, f2, 0.7F);
            this.flap(gillL2, speedLeg, -degreeLeg, false, 5.0F, 0, f2, 0.7F);
            this.flap(gillR2, speedLeg, degreeLeg, false, 5.0F, 0, f2, 0.7F);
            this.flap(gillL3, speedLeg, -degreeLeg, false, 5.5F, 0, f2, 0.7F);
            this.flap(gillR3, speedLeg, degreeLeg, false, 5.5F, 0, f2, 0.7F);
            this.flap(gillL4, speedLeg, -degreeLeg, false, 6F, 0, f2, 0.7F);
            this.flap(gillR4, speedLeg, degreeLeg, false, 6F, 0, f2, 0.7F);
            this.flap(gillL5, speedLeg, -degreeLeg, false, 6.5F, 0, f2, 0.7F);
            this.flap(gillR5, speedLeg, degreeLeg, false, 6.5F, 0, f2, 0.7F);


                if (f3 == 0.0F) {
                    this.bob(body, -speed, 0.15F, false, f2, 2);
                }
                else
                {
                    this.bob(body, -speed, 1F, false, f2, 2);
                }

        }
    }
}
