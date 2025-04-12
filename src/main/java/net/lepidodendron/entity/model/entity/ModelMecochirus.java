package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraMecochirus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMecochirus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer eyeR;
    private final AdvancedModelRenderer eyeL;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer antennaR2;
    private final AdvancedModelRenderer antennaL2;
    private final AdvancedModelRenderer clawR;
    private final AdvancedModelRenderer armR2;
    private final AdvancedModelRenderer armR3;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer armR4;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer clawL;
    private final AdvancedModelRenderer armL2;
    private final AdvancedModelRenderer armL3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer armL4;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer pleopodR;
    private final AdvancedModelRenderer pleopodL;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer pleopodR2;
    private final AdvancedModelRenderer pleopodL2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer pleopodR3;
    private final AdvancedModelRenderer pleopodL3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer pleopodR4;
    private final AdvancedModelRenderer pleopodL4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tailfanR;
    private final AdvancedModelRenderer tailfanL;
    private final AdvancedModelRenderer tailfanR2;
    private final AdvancedModelRenderer tailfanL2;

    public ModelMecochirus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 25.05F, 5.0F);
        this.body.cubeList.add(new ModelBox(body, 27, 14, -1.5F, -6.0F, -5.0F, 3, 4, 4, 0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 20, 8, -1.0F, -6.0F, -6.0F, 2, 3, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 5, 18, -1.0F, -6.0F, -7.0F, 2, 2, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 5, 5, -0.5F, -6.0F, -8.0F, 1, 0, 1, 0.0F, false));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(-0.5F, -4.9F, -7.0F);
        this.body.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.0F, 0.2182F, 0.0F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 8, 0, -0.85F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(0.5F, -4.9F, -7.0F);
        this.body.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.0F, -0.2182F, 0.0F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 8, 0, -0.15F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-0.25F, -5.25F, -7.0F);
        this.body.addChild(antennaR);
        this.setRotateAngle(antennaR, -0.1309F, 0.1309F, -0.1309F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 0, 0.0F, -5.5F, -25.0F, 0, 6, 25, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.25F, -5.25F, -7.0F);
        this.body.addChild(antennaL);
        this.setRotateAngle(antennaL, -0.1309F, -0.1309F, 0.1309F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 0, 0, 0.0F, -5.5F, -25.0F, 0, 6, 25, 0.0F, true));

        this.antennaR2 = new AdvancedModelRenderer(this);
        this.antennaR2.setRotationPoint(-0.025F, -5.25F, -7.0F);
        this.body.addChild(antennaR2);
        this.setRotateAngle(antennaR2, 0.1745F, 0.1309F, 0.0F);
        this.antennaR2.cubeList.add(new ModelBox(antennaR2, 0, 2, 0.0F, -0.5F, -3.0F, 0, 1, 3, 0.0F, false));

        this.antennaL2 = new AdvancedModelRenderer(this);
        this.antennaL2.setRotationPoint(0.025F, -5.25F, -7.0F);
        this.body.addChild(antennaL2);
        this.setRotateAngle(antennaL2, 0.1745F, -0.1309F, 0.0F);
        this.antennaL2.cubeList.add(new ModelBox(antennaL2, 0, 2, 0.0F, -0.5F, -3.0F, 0, 1, 3, 0.0F, true));

        this.clawR = new AdvancedModelRenderer(this);
        this.clawR.setRotationPoint(-0.5F, -2.75F, -4.5F);
        this.body.addChild(clawR);
        this.setRotateAngle(clawR, -0.5236F, 0.2182F, 0.0F);
        this.clawR.cubeList.add(new ModelBox(clawR, 0, 13, -0.5F, -0.5F, -11.0F, 1, 1, 11, 0.0F, false));

        this.armR2 = new AdvancedModelRenderer(this);
        this.armR2.setRotationPoint(0.0F, -0.1F, -10.6F);
        this.clawR.addChild(armR2);
        this.setRotateAngle(armR2, 0.5236F, 0.0F, 0.0F);
        this.armR2.cubeList.add(new ModelBox(armR2, 0, 18, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.01F, false));

        this.armR3 = new AdvancedModelRenderer(this);
        this.armR3.setRotationPoint(0.0F, -0.025F, -2.75F);
        this.armR2.addChild(armR3);
        this.setRotateAngle(armR3, 0.2618F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.armR3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0349F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.0F, -0.5F, -12.0F, 1, 1, 12, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.armR3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 1, 0.0F, -0.5F, -12.0F, 1, 1, 12, 0.0F, false));

        this.armR4 = new AdvancedModelRenderer(this);
        this.armR4.setRotationPoint(-0.5F, 0.0F, -12.0F);
        this.armR3.addChild(armR4);
        this.setRotateAngle(armR4, 0.3927F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armR4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0349F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 11, 0.5F, -0.8F, -6.5F, 0, 2, 7, 0.0F, false));

        this.clawL = new AdvancedModelRenderer(this);
        this.clawL.setRotationPoint(0.5F, -2.75F, -4.5F);
        this.body.addChild(clawL);
        this.setRotateAngle(clawL, -0.5236F, -0.2182F, 0.0F);
        this.clawL.cubeList.add(new ModelBox(clawL, 0, 13, -0.5F, -0.5F, -11.0F, 1, 1, 11, 0.0F, true));

        this.armL2 = new AdvancedModelRenderer(this);
        this.armL2.setRotationPoint(0.0F, -0.1F, -10.6F);
        this.clawL.addChild(armL2);
        this.setRotateAngle(armL2, 0.5236F, 0.0F, 0.0F);
        this.armL2.cubeList.add(new ModelBox(armL2, 0, 18, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.01F, true));

        this.armL3 = new AdvancedModelRenderer(this);
        this.armL3.setRotationPoint(0.0F, -0.025F, -2.75F);
        this.armL2.addChild(armL3);
        this.setRotateAngle(armL3, 0.2618F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.armL3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.0F, -0.5F, -12.0F, 1, 1, 12, 0.01F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.armL3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 1, -1.0F, -0.5F, -12.0F, 1, 1, 12, 0.0F, true));

        this.armL4 = new AdvancedModelRenderer(this);
        this.armL4.setRotationPoint(0.5F, 0.0F, -12.0F);
        this.armL3.addChild(armL4);
        this.setRotateAngle(armL4, 0.3927F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armL4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 11, -0.5F, -0.8F, -6.5F, 0, 2, 7, 0.0F, true));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-1.25F, -3.0F, -5.0F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, -0.1309F, 0.5236F, 0.0F);
        this.legR.cubeList.add(new ModelBox(legR, 13, 5, 0.0F, -0.75F, -9.0F, 0, 4, 9, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(1.25F, -3.0F, -5.0F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, -0.1309F, -0.5236F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 13, 5, 0.0F, -0.75F, -9.0F, 0, 4, 9, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.5F, -2.25F, -4.0F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 1.2217F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 3, 0.0F, -1.75F, -6.0F, 0, 3, 6, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.5F, -2.25F, -4.0F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, -1.2217F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 3, 0.0F, -1.75F, -6.0F, 0, 3, 6, 0.0F, true));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.5F, -2.25F, -3.0F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 1.6581F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 0, 0.0F, -1.75F, -6.0F, 0, 3, 6, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.5F, -2.25F, -3.0F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -1.6581F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 0, 0.0F, -1.75F, -6.0F, 0, 3, 6, 0.0F, true));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-1.5F, -2.25F, -2.0F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 2.5307F, 0.0F);
        this.legR4.cubeList.add(new ModelBox(legR4, 14, 6, 0.0F, -1.75F, -3.0F, 0, 3, 3, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(1.5F, -2.25F, -2.0F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, -2.5307F, 0.0F);
        this.legL4.cubeList.add(new ModelBox(legL4, 14, 6, 0.0F, -1.75F, -3.0F, 0, 3, 3, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -5.9F, -1.5F);
        this.body.addChild(body1);
        this.setRotateAngle(body1, 0.1309F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 21, 20, -1.0F, 0.25F, 0.25F, 2, 2, 1, 0.01F, false));

        this.pleopodR = new AdvancedModelRenderer(this);
        this.pleopodR.setRotationPoint(-0.5F, 3.0F, 1.5F);
        this.body1.addChild(pleopodR);
        this.setRotateAngle(pleopodR, 0.0F, 0.3491F, 0.2182F);
        this.pleopodR.cubeList.add(new ModelBox(pleopodR, 0, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.pleopodL = new AdvancedModelRenderer(this);
        this.pleopodL.setRotationPoint(0.5F, 3.0F, 1.5F);
        this.body1.addChild(pleopodL);
        this.setRotateAngle(pleopodL, 0.0F, -0.3491F, -0.2182F);
        this.pleopodL.cubeList.add(new ModelBox(pleopodL, 0, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.25F, 1.0F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, -0.0436F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 13, -1.5F, -0.25F, 0.0F, 3, 3, 2, 0.0F, false));

        this.pleopodR2 = new AdvancedModelRenderer(this);
        this.pleopodR2.setRotationPoint(-0.5F, 2.75F, 2.25F);
        this.body2.addChild(pleopodR2);
        this.setRotateAngle(pleopodR2, 0.0F, 0.3491F, 0.2182F);
        this.pleopodR2.cubeList.add(new ModelBox(pleopodR2, 0, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.pleopodL2 = new AdvancedModelRenderer(this);
        this.pleopodL2.setRotationPoint(0.5F, 2.75F, 2.25F);
        this.body2.addChild(pleopodL2);
        this.setRotateAngle(pleopodL2, 0.0F, -0.3491F, -0.2182F);
        this.pleopodL2.cubeList.add(new ModelBox(pleopodL2, 0, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.2F, 1.9F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.1309F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, -1.5F, 0.0F, -0.25F, 3, 3, 2, -0.01F, false));

        this.pleopodR3 = new AdvancedModelRenderer(this);
        this.pleopodR3.setRotationPoint(-0.5F, 2.7F, 2.35F);
        this.body3.addChild(pleopodR3);
        this.setRotateAngle(pleopodR3, 0.0F, 0.3491F, 0.2182F);
        this.pleopodR3.cubeList.add(new ModelBox(pleopodR3, 0, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.pleopodL3 = new AdvancedModelRenderer(this);
        this.pleopodL3.setRotationPoint(0.5F, 2.7F, 2.35F);
        this.body3.addChild(pleopodL3);
        this.setRotateAngle(pleopodL3, 0.0F, -0.3491F, -0.2182F);
        this.pleopodL3.cubeList.add(new ModelBox(pleopodL3, 0, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.25F, 1.75F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.1309F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 18, 4, -1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 13, 20, -1.0F, 1.45F, 0.0F, 2, 1, 2, -0.005F, false));

        this.pleopodR4 = new AdvancedModelRenderer(this);
        this.pleopodR4.setRotationPoint(-0.5F, 2.2F, 2.35F);
        this.body4.addChild(pleopodR4);
        this.setRotateAngle(pleopodR4, 0.0F, 0.3491F, 0.2182F);
        this.pleopodR4.cubeList.add(new ModelBox(pleopodR4, 0, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.pleopodL4 = new AdvancedModelRenderer(this);
        this.pleopodL4.setRotationPoint(0.5F, 2.2F, 2.35F);
        this.body4.addChild(pleopodL4);
        this.setRotateAngle(pleopodL4, 0.0F, -0.3491F, -0.2182F);
        this.pleopodL4.cubeList.add(new ModelBox(pleopodL4, 0, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.25F, 2.0F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, -0.2182F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 18, 0, -1.0F, 0.0F, -0.5F, 2, 2, 2, -0.01F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.25F, 1.5F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, -0.2618F, 0.0F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 0, 22, -1.0F, 0.0F, 0.0F, 2, 1, 1, -0.02F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body6.addChild(tail2);
        this.setRotateAngle(tail2, -0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 11, 6, -0.99F, 0.25F, 0.0F, 2, 0, 3, 0.0F, false));

        this.tailfanR = new AdvancedModelRenderer(this);
        this.tailfanR.setRotationPoint(-0.25F, 0.25F, 0.0F);
        this.tail2.addChild(tailfanR);
        this.setRotateAngle(tailfanR, -0.1309F, -0.3491F, -0.1309F);
        this.tailfanR.cubeList.add(new ModelBox(tailfanR, 11, 3, -1.01F, 0.0F, 0.0F, 2, 0, 3, 0.0F, false));

        this.tailfanL = new AdvancedModelRenderer(this);
        this.tailfanL.setRotationPoint(0.25F, 0.25F, 0.0F);
        this.tail2.addChild(tailfanL);
        this.setRotateAngle(tailfanL, -0.1309F, 0.3491F, 0.1309F);
        this.tailfanL.cubeList.add(new ModelBox(tailfanL, 11, 3, -0.99F, 0.0F, 0.0F, 2, 0, 3, 0.0F, true));

        this.tailfanR2 = new AdvancedModelRenderer(this);
        this.tailfanR2.setRotationPoint(-0.25F, 0.25F, 0.0F);
        this.tail2.addChild(tailfanR2);
        this.setRotateAngle(tailfanR2, -0.2618F, -0.6109F, -0.4363F);
        this.tailfanR2.cubeList.add(new ModelBox(tailfanR2, 11, 0, -1.01F, 0.0F, 0.0F, 2, 0, 3, 0.0F, false));

        this.tailfanL2 = new AdvancedModelRenderer(this);
        this.tailfanL2.setRotationPoint(0.25F, 0.25F, 0.0F);
        this.tail2.addChild(tailfanL2);
        this.setRotateAngle(tailfanL2, -0.2618F, 0.6109F, 0.4363F);
        this.tailfanL2.cubeList.add(new ModelBox(tailfanL2, 11, 0, -0.99F, 0.0F, 0.0F, 2, 0, 3, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    public void renderStaticDisplayCase(float f) {
        this.body.offsetZ = -0.01F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body1, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body3, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body4, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body5, -0.15F, 0.0F, 0.0F);
        this.setRotateAngle(body6, -0.15F, 0.0F, 0.0F);
        this.setRotateAngle(armL2, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(armL3, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(armL4, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(armR2, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(armR3, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(armR4, 0.2F, 0.0F, 0.0F);
        this.body.offsetY = 0.1F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -2.2F;
        this.body.offsetX = -1.4F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 2.2F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(body1, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body3, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body4, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body5, -0.15F, 0.0F, 0.0F);
        this.setRotateAngle(body6, -0.15F, 0.0F, 0.0F);
        this.setRotateAngle(armL2, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(armL3, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(armL4, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(armR2, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(armR3, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(armR4, 0.2F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraMecochirus ee = (EntityPrehistoricFloraMecochirus) entitylivingbaseIn;

        if (ee.isInWater()) {
            if(ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

        }
        else {

        }


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMecochirus entity = (EntityPrehistoricFloraMecochirus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -2.4D + (((tickAnim - 0D) / 5D) * (-0.75D-(-2.4D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = -2.5D + (((tickAnim - 0D) / 5D) * (-1.93D-(-2.5D)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -0.75D + (((tickAnim - 5D) / 4D) * (0D-(-0.75D)));
            yy = 0D + (((tickAnim - 5D) / 4D) * (0D-(0D)));
            zz = -1.93D + (((tickAnim - 5D) / 4D) * (-0.16667D-(-1.93D)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 9D) / 6D) * (-0.75D-(0D)));
            yy = 0D + (((tickAnim - 9D) / 6D) * (0D-(0D)));
            zz = -0.16667D + (((tickAnim - 9D) / 6D) * (1.87D-(-0.16667D)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.75D + (((tickAnim - 15D) / 5D) * (-2.5D-(-0.75D)));
            yy = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
            zz = 1.87D + (((tickAnim - 15D) / 5D) * (2.5D-(1.87D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -2.5D + (((tickAnim - 20D) / 5D) * (-4.15D-(-2.5D)));
            yy = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
            zz = 2.5D + (((tickAnim - 20D) / 5D) * (1.87D-(2.5D)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = -4.15D + (((tickAnim - 25D) / 6D) * (-5D-(-4.15D)));
            yy = 0D + (((tickAnim - 25D) / 6D) * (0D-(0D)));
            zz = 1.87D + (((tickAnim - 25D) / 6D) * (-0.16667D-(1.87D)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -5D + (((tickAnim - 31D) / 4D) * (-4.15D-(-5D)));
            yy = 0D + (((tickAnim - 31D) / 4D) * (0D-(0D)));
            zz = -0.16667D + (((tickAnim - 31D) / 4D) * (-1.93D-(-0.16667D)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -4.15D + (((tickAnim - 35D) / 5D) * (-2.4D-(-4.15D)));
            yy = 0D + (((tickAnim - 35D) / 5D) * (0D-(0D)));
            zz = -1.93D + (((tickAnim - 35D) / 5D) * (-2.5D-(-1.93D)));
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(antennaR, antennaR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*90/0.25+115))*5), antennaR.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*45/0.25+145))*2.5), antennaR.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(antennaL, antennaL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*90/0.25-115))*5), antennaL.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*45/0.25-145))*2.5), antennaL.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(clawR, clawR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*45/0.25+115))*2), clawR.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*45/0.25+145))*4), clawR.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(clawL, clawL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*45/0.25-115))*2), clawL.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*45/0.25-145))*4), clawL.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (5.51466D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (-12.19421D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (17.06847D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 5.51466D + (((tickAnim - 5D) / 5D) * (8.46186D-(5.51466D)));
            yy = -12.19421D + (((tickAnim - 5D) / 5D) * (-15.70935D-(-12.19421D)));
            zz = 17.06847D + (((tickAnim - 5D) / 5D) * (-8.42763D-(17.06847D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 8.46186D + (((tickAnim - 10D) / 10D) * (0D-(8.46186D)));
            yy = -15.70935D + (((tickAnim - 10D) / 10D) * (0D-(-15.70935D)));
            zz = -8.42763D + (((tickAnim - 10D) / 10D) * (0D-(-8.42763D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 20D) / 5D) * (5.51466D-(0D)));
            yy = 0D + (((tickAnim - 20D) / 5D) * (-12.19421D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 5D) * (17.06847D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 5.51466D + (((tickAnim - 25D) / 5D) * (8.46186D-(5.51466D)));
            yy = -12.19421D + (((tickAnim - 25D) / 5D) * (-15.70935D-(-12.19421D)));
            zz = 17.06847D + (((tickAnim - 25D) / 5D) * (-8.42763D-(17.06847D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 8.46186D + (((tickAnim - 30D) / 10D) * (0D-(8.46186D)));
            yy = -15.70935D + (((tickAnim - 30D) / 10D) * (0D-(-15.70935D)));
            zz = -8.42763D + (((tickAnim - 30D) / 10D) * (0D-(-8.42763D)));
        }
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(xx), legR.rotateAngleY + (float) Math.toRadians(yy), legR.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 7.48D + (((tickAnim - 0D) / 2D) * (8.46186D-(7.48D)));
            yy = 14.54D + (((tickAnim - 0D) / 2D) * (15.70935D-(14.54D)));
            zz = -0.07D + (((tickAnim - 0D) / 2D) * (8.42763D-(-0.07D)));
        }
        else if (tickAnim >= 2 && tickAnim < 12) {
            xx = 8.46186D + (((tickAnim - 2D) / 10D) * (0D-(8.46186D)));
            yy = 15.70935D + (((tickAnim - 2D) / 10D) * (0D-(15.70935D)));
            zz = 8.42763D + (((tickAnim - 2D) / 10D) * (0D-(8.42763D)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 12D) / 5D) * (5.51466D-(0D)));
            yy = 0D + (((tickAnim - 12D) / 5D) * (12.19421D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 5D) * (-17.06847D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 5.51466D + (((tickAnim - 17D) / 5D) * (8.46186D-(5.51466D)));
            yy = 12.19421D + (((tickAnim - 17D) / 5D) * (15.70935D-(12.19421D)));
            zz = -17.06847D + (((tickAnim - 17D) / 5D) * (8.42763D-(-17.06847D)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 8.46186D + (((tickAnim - 22D) / 10D) * (0D-(8.46186D)));
            yy = 15.70935D + (((tickAnim - 22D) / 10D) * (0D-(15.70935D)));
            zz = 8.42763D + (((tickAnim - 22D) / 10D) * (0D-(8.42763D)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0D + (((tickAnim - 32D) / 5D) * (5.51466D-(0D)));
            yy = 0D + (((tickAnim - 32D) / 5D) * (12.19421D-(0D)));
            zz = 0D + (((tickAnim - 32D) / 5D) * (-17.06847D-(0D)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 5.51466D + (((tickAnim - 37D) / 3D) * (7.48D-(5.51466D)));
            yy = 12.19421D + (((tickAnim - 37D) / 3D) * (14.54D-(12.19421D)));
            zz = -17.06847D + (((tickAnim - 37D) / 3D) * (-0.07D-(-17.06847D)));
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2.35D + (((tickAnim - 0D) / 3D) * (4.95152D-(2.35D)));
            yy = -8.37D + (((tickAnim - 0D) / 3D) * (-16.52155D-(-8.37D)));
            zz = 12.37D + (((tickAnim - 0D) / 3D) * (-5.34502D-(12.37D)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 4.95152D + (((tickAnim - 3D) / 10D) * (-3.2945D-(4.95152D)));
            yy = -16.52155D + (((tickAnim - 3D) / 10D) * (16.83111D-(-16.52155D)));
            zz = -5.34502D + (((tickAnim - 3D) / 10D) * (3.79181D-(-5.34502D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -3.2945D + (((tickAnim - 13D) / 5D) * (1.05027D-(-3.2945D)));
            yy = 16.83111D + (((tickAnim - 13D) / 5D) * (-4.29822D-(16.83111D)));
            zz = 3.79181D + (((tickAnim - 13D) / 5D) * (21.22451D-(3.79181D)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 1.05027D + (((tickAnim - 18D) / 5D) * (4.95152D-(1.05027D)));
            yy = -4.29822D + (((tickAnim - 18D) / 5D) * (-16.52155D-(-4.29822D)));
            zz = 21.22451D + (((tickAnim - 18D) / 5D) * (-5.34502D-(21.22451D)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 4.95152D + (((tickAnim - 23D) / 10D) * (-3.2945D-(4.95152D)));
            yy = -16.52155D + (((tickAnim - 23D) / 10D) * (16.83111D-(-16.52155D)));
            zz = -5.34502D + (((tickAnim - 23D) / 10D) * (3.79181D-(-5.34502D)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -3.2945D + (((tickAnim - 33D) / 5D) * (1.05027D-(-3.2945D)));
            yy = 16.83111D + (((tickAnim - 33D) / 5D) * (-4.29822D-(16.83111D)));
            zz = 3.79181D + (((tickAnim - 33D) / 5D) * (21.22451D-(3.79181D)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 1.05027D + (((tickAnim - 38D) / 2D) * (2.35D-(1.05027D)));
            yy = -4.29822D + (((tickAnim - 38D) / 2D) * (-8.37D-(-4.29822D)));
            zz = 21.22451D + (((tickAnim - 38D) / 2D) * (12.37D-(21.22451D)));
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.83D + (((tickAnim - 0D) / 5D) * (-3.2945D-(0.83D)));
            yy = -0.15D + (((tickAnim - 0D) / 5D) * (-16.83111D-(-0.15D)));
            zz = 0.78D + (((tickAnim - 0D) / 5D) * (-3.79181D-(0.78D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -3.2945D + (((tickAnim - 5D) / 5D) * (1.05027D-(-3.2945D)));
            yy = -16.83111D + (((tickAnim - 5D) / 5D) * (4.29822D-(-16.83111D)));
            zz = -3.79181D + (((tickAnim - 5D) / 5D) * (-21.22451D-(-3.79181D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1.05027D + (((tickAnim - 10D) / 5D) * (4.95152D-(1.05027D)));
            yy = 4.29822D + (((tickAnim - 10D) / 5D) * (16.52155D-(4.29822D)));
            zz = -21.22451D + (((tickAnim - 10D) / 5D) * (5.34502D-(-21.22451D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 4.95152D + (((tickAnim - 15D) / 10D) * (-3.2945D-(4.95152D)));
            yy = 16.52155D + (((tickAnim - 15D) / 10D) * (-16.83111D-(16.52155D)));
            zz = 5.34502D + (((tickAnim - 15D) / 10D) * (-3.79181D-(5.34502D)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -3.2945D + (((tickAnim - 25D) / 5D) * (1.05027D-(-3.2945D)));
            yy = -16.83111D + (((tickAnim - 25D) / 5D) * (4.29822D-(-16.83111D)));
            zz = -3.79181D + (((tickAnim - 25D) / 5D) * (-21.22451D-(-3.79181D)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 1.05027D + (((tickAnim - 30D) / 5D) * (4.95152D-(1.05027D)));
            yy = 4.29822D + (((tickAnim - 30D) / 5D) * (16.52155D-(4.29822D)));
            zz = -21.22451D + (((tickAnim - 30D) / 5D) * (5.34502D-(-21.22451D)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 4.95152D + (((tickAnim - 35D) / 5D) * (0.83D-(4.95152D)));
            yy = 16.52155D + (((tickAnim - 35D) / 5D) * (-0.15D-(16.52155D)));
            zz = 5.34502D + (((tickAnim - 35D) / 5D) * (0.78D-(5.34502D)));
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -1.57D + (((tickAnim - 0D) / 2D) * (-2.57129D-(-1.57D)));
            yy = 11.34D + (((tickAnim - 0D) / 2D) * (16.96639D-(11.34D)));
            zz = 1.77D + (((tickAnim - 0D) / 2D) * (2.85264D-(1.77D)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -2.57129D + (((tickAnim - 2D) / 5D) * (0.37046D-(-2.57129D)));
            yy = 16.96639D + (((tickAnim - 2D) / 5D) * (-4.37439D-(16.96639D)));
            zz = 2.85264D + (((tickAnim - 2D) / 5D) * (21.65911D-(2.85264D)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0.37046D + (((tickAnim - 7D) / 5D) * (3.4427D-(0.37046D)));
            yy = -4.37439D + (((tickAnim - 7D) / 5D) * (-16.79985D-(-4.37439D)));
            zz = 21.65911D + (((tickAnim - 7D) / 5D) * (-3.64399D-(21.65911D)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 3.4427D + (((tickAnim - 12D) / 10D) * (-2.57129D-(3.4427D)));
            yy = -16.79985D + (((tickAnim - 12D) / 10D) * (16.96639D-(-16.79985D)));
            zz = -3.64399D + (((tickAnim - 12D) / 10D) * (2.85264D-(-3.64399D)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -2.57129D + (((tickAnim - 22D) / 5D) * (0.37046D-(-2.57129D)));
            yy = 16.96639D + (((tickAnim - 22D) / 5D) * (-4.37439D-(16.96639D)));
            zz = 2.85264D + (((tickAnim - 22D) / 5D) * (21.65911D-(2.85264D)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0.37046D + (((tickAnim - 27D) / 5D) * (3.4427D-(0.37046D)));
            yy = -4.37439D + (((tickAnim - 27D) / 5D) * (-16.79985D-(-4.37439D)));
            zz = 21.65911D + (((tickAnim - 27D) / 5D) * (-3.64399D-(21.65911D)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 3.4427D + (((tickAnim - 32D) / 8D) * (-1.57D-(3.4427D)));
            yy = -16.79985D + (((tickAnim - 32D) / 8D) * (11.34D-(-16.79985D)));
            zz = -3.64399D + (((tickAnim - 32D) / 8D) * (1.77D-(-3.64399D)));
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.39D + (((tickAnim - 0D) / 3D) * (3.4427D-(1.39D)));
            yy = 8.52D + (((tickAnim - 0D) / 3D) * (16.79985D-(8.52D)));
            zz = -13.22D + (((tickAnim - 0D) / 3D) * (3.64399D-(-13.22D)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 3.4427D + (((tickAnim - 3D) / 10D) * (-2.57129D-(3.4427D)));
            yy = 16.79985D + (((tickAnim - 3D) / 10D) * (-16.96639D-(16.79985D)));
            zz = 3.64399D + (((tickAnim - 3D) / 10D) * (-2.85264D-(3.64399D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -2.57129D + (((tickAnim - 13D) / 5D) * (0.37046D-(-2.57129D)));
            yy = -16.96639D + (((tickAnim - 13D) / 5D) * (4.37439D-(-16.96639D)));
            zz = -2.85264D + (((tickAnim - 13D) / 5D) * (-21.65911D-(-2.85264D)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0.37046D + (((tickAnim - 18D) / 5D) * (3.4427D-(0.37046D)));
            yy = 4.37439D + (((tickAnim - 18D) / 5D) * (16.79985D-(4.37439D)));
            zz = -21.65911D + (((tickAnim - 18D) / 5D) * (3.64399D-(-21.65911D)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 3.4427D + (((tickAnim - 23D) / 10D) * (-2.57129D-(3.4427D)));
            yy = 16.79985D + (((tickAnim - 23D) / 10D) * (-16.96639D-(16.79985D)));
            zz = 3.64399D + (((tickAnim - 23D) / 10D) * (-2.85264D-(3.64399D)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -2.57129D + (((tickAnim - 33D) / 5D) * (0.37046D-(-2.57129D)));
            yy = -16.96639D + (((tickAnim - 33D) / 5D) * (4.37439D-(-16.96639D)));
            zz = -2.85264D + (((tickAnim - 33D) / 5D) * (-21.65911D-(-2.85264D)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0.37046D + (((tickAnim - 38D) / 2D) * (1.39D-(0.37046D)));
            yy = 4.37439D + (((tickAnim - 38D) / 2D) * (8.52D-(4.37439D)));
            zz = -21.65911D + (((tickAnim - 38D) / 2D) * (-13.22D-(-21.65911D)));
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.18624D + (((tickAnim - 0D) / 5D) * (4.63788D-(0.18624D)));
            yy = -4.39691D + (((tickAnim - 0D) / 5D) * (-16.57347D-(-4.39691D)));
            zz = 21.50803D + (((tickAnim - 0D) / 5D) * (-2.07666D-(21.50803D)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 4.63788D + (((tickAnim - 5D) / 10D) * (-4.86371D-(4.63788D)));
            yy = -16.57347D + (((tickAnim - 5D) / 10D) * (16.67917D-(-16.57347D)));
            zz = -2.07666D + (((tickAnim - 5D) / 10D) * (0.73038D-(-2.07666D)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -4.86371D + (((tickAnim - 15D) / 5D) * (0.18624D-(-4.86371D)));
            yy = 16.67917D + (((tickAnim - 15D) / 5D) * (-4.39691D-(16.67917D)));
            zz = 0.73038D + (((tickAnim - 15D) / 5D) * (21.50803D-(0.73038D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0.18624D + (((tickAnim - 20D) / 5D) * (4.63788D-(0.18624D)));
            yy = -4.39691D + (((tickAnim - 20D) / 5D) * (-16.57347D-(-4.39691D)));
            zz = 21.50803D + (((tickAnim - 20D) / 5D) * (-2.07666D-(21.50803D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 4.63788D + (((tickAnim - 25D) / 10D) * (-4.86371D-(4.63788D)));
            yy = -16.57347D + (((tickAnim - 25D) / 10D) * (16.67917D-(-16.57347D)));
            zz = -2.07666D + (((tickAnim - 25D) / 10D) * (0.73038D-(-2.07666D)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -4.86371D + (((tickAnim - 35D) / 5D) * (0.18624D-(-4.86371D)));
            yy = 16.67917D + (((tickAnim - 35D) / 5D) * (-4.39691D-(16.67917D)));
            zz = 0.73038D + (((tickAnim - 35D) / 5D) * (21.50803D-(0.73038D)));
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 1.47D + (((tickAnim - 0D) / 7D) * (-4.86371D-(1.47D)));
            yy = 5.49D + (((tickAnim - 0D) / 7D) * (-16.67917D-(5.49D)));
            zz = 1.14D + (((tickAnim - 0D) / 7D) * (-0.73038D-(1.14D)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -4.86371D + (((tickAnim - 7D) / 5D) * (0.18624D-(-4.86371D)));
            yy = -16.67917D + (((tickAnim - 7D) / 5D) * (4.39691D-(-16.67917D)));
            zz = -0.73038D + (((tickAnim - 7D) / 5D) * (-21.50803D-(-0.73038D)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0.18624D + (((tickAnim - 12D) / 5D) * (4.63788D-(0.18624D)));
            yy = 4.39691D + (((tickAnim - 12D) / 5D) * (16.57347D-(4.39691D)));
            zz = -21.50803D + (((tickAnim - 12D) / 5D) * (2.07666D-(-21.50803D)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 4.63788D + (((tickAnim - 17D) / 10D) * (-4.86371D-(4.63788D)));
            yy = 16.57347D + (((tickAnim - 17D) / 10D) * (-16.67917D-(16.57347D)));
            zz = 2.07666D + (((tickAnim - 17D) / 10D) * (-0.73038D-(2.07666D)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -4.86371D + (((tickAnim - 27D) / 5D) * (0.18624D-(-4.86371D)));
            yy = -16.67917D + (((tickAnim - 27D) / 5D) * (4.39691D-(-16.67917D)));
            zz = -0.73038D + (((tickAnim - 27D) / 5D) * (-21.50803D-(-0.73038D)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0.18624D + (((tickAnim - 32D) / 5D) * (4.63788D-(0.18624D)));
            yy = 4.39691D + (((tickAnim - 32D) / 5D) * (16.57347D-(4.39691D)));
            zz = -21.50803D + (((tickAnim - 32D) / 5D) * (2.07666D-(-21.50803D)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 4.63788D + (((tickAnim - 37D) / 3D) * (1.47D-(4.63788D)));
            yy = 16.57347D + (((tickAnim - 37D) / 3D) * (5.49D-(16.57347D)));
            zz = 2.07666D + (((tickAnim - 37D) / 3D) * (1.14D-(2.07666D)));
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*45/0.25-115))*2), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*45/0.25-115))*2), body4.rotateAngleY + (float) Math.toRadians(0), body4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*45/0.25-115))*2), body5.rotateAngleY + (float) Math.toRadians(0), body5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*45/0.25-115))*2), body6.rotateAngleY + (float) Math.toRadians(0), body6.rotateAngleZ + (float) Math.toRadians(0));
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

    }
}
