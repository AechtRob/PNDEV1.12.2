package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraOpabinia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelOpabinia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer nozzle;
    private final AdvancedModelRenderer nozzle2;
    private final AdvancedModelRenderer nozzle3;
    private final AdvancedModelRenderer nozzle4;
    private final AdvancedModelRenderer nozzle5;
    private final AdvancedModelRenderer nozzle6;
    private final AdvancedModelRenderer nozzle7;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer jawL;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer jawR;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer middleeye;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer backeyeL;
    private final AdvancedModelRenderer backeyeR;
    private final AdvancedModelRenderer fronteyeL;
    private final AdvancedModelRenderer fronteyeR;
    private final AdvancedModelRenderer segment1;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer finL1;
    private final AdvancedModelRenderer finR1;
    private final AdvancedModelRenderer segment2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer finL2;
    private final AdvancedModelRenderer finR2;
    private final AdvancedModelRenderer segment3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer finL3;
    private final AdvancedModelRenderer finR3;
    private final AdvancedModelRenderer segment4;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer finL4;
    private final AdvancedModelRenderer finR4;
    private final AdvancedModelRenderer segment5;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer finL5;
    private final AdvancedModelRenderer finR5;
    private final AdvancedModelRenderer segment6;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer finL6;
    private final AdvancedModelRenderer finR6;
    private final AdvancedModelRenderer segment7;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer finL7;
    private final AdvancedModelRenderer finR7;
    private final AdvancedModelRenderer segment8;
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer finL8;
    private final AdvancedModelRenderer finR8;
    private final AdvancedModelRenderer segment9;
    private final AdvancedModelRenderer legL9;
    private final AdvancedModelRenderer legR9;
    private final AdvancedModelRenderer finL9;
    private final AdvancedModelRenderer finR9;
    private final AdvancedModelRenderer segment10;
    private final AdvancedModelRenderer legL10;
    private final AdvancedModelRenderer legR10;
    private final AdvancedModelRenderer finL10;
    private final AdvancedModelRenderer finR10;
    private final AdvancedModelRenderer segment11;
    private final AdvancedModelRenderer legL11;
    private final AdvancedModelRenderer legR11;
    private final AdvancedModelRenderer finL11;
    private final AdvancedModelRenderer finR11;
    private final AdvancedModelRenderer segment12;
    private final AdvancedModelRenderer legL12;
    private final AdvancedModelRenderer legR12;
    private final AdvancedModelRenderer finL12;
    private final AdvancedModelRenderer finR12;
    private final AdvancedModelRenderer segment13;
    private final AdvancedModelRenderer legL13;
    private final AdvancedModelRenderer legR13;
    private final AdvancedModelRenderer finL13;
    private final AdvancedModelRenderer finR13;
    private final AdvancedModelRenderer segment14;
    private final AdvancedModelRenderer legL14;
    private final AdvancedModelRenderer legR14;
    private final AdvancedModelRenderer finL14;
    private final AdvancedModelRenderer finR14;
    private final AdvancedModelRenderer segment15;
    private final AdvancedModelRenderer legL15;
    private final AdvancedModelRenderer legR15;
    private final AdvancedModelRenderer finL15;
    private final AdvancedModelRenderer finR15;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tailfinL1;
    private final AdvancedModelRenderer tailfinR1;
    private final AdvancedModelRenderer tailfinL2;
    private final AdvancedModelRenderer tailfinR2;
    private final AdvancedModelRenderer tailfinL3;
    private final AdvancedModelRenderer tailfinR3;

    private ModelAnimator animator;

    public ModelOpabinia() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 0, -0.99F, -3.26F, -7.0F, 2, 2, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.48F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 15, -0.5F, 0.85F, -6.25F, 1, 1, 2, 0.0F, false));

        this.nozzle = new AdvancedModelRenderer(this);
        this.nozzle.setRotationPoint(0.0F, -1.75F, -6.5F);
        this.head.addChild(nozzle);
        this.setRotateAngle(nozzle, 0.0873F, 0.0F, 0.0F);
        this.nozzle.cubeList.add(new ModelBox(nozzle, 24, 18, -0.5F, -0.501F, -1.0F, 1, 1, 1, 0.0F, false));

        this.nozzle2 = new AdvancedModelRenderer(this);
        this.nozzle2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.nozzle.addChild(nozzle2);
        this.nozzle2.cubeList.add(new ModelBox(nozzle2, 12, 24, -0.49F, -0.501F, -1.0F, 1, 1, 1, 0.0F, false));

        this.nozzle3 = new AdvancedModelRenderer(this);
        this.nozzle3.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.nozzle2.addChild(nozzle3);
        this.nozzle3.cubeList.add(new ModelBox(nozzle3, 8, 24, -0.5F, -0.501F, -1.0F, 1, 1, 1, 0.0F, false));

        this.nozzle4 = new AdvancedModelRenderer(this);
        this.nozzle4.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.nozzle3.addChild(nozzle4);
        this.nozzle4.cubeList.add(new ModelBox(nozzle4, 4, 24, -0.49F, -0.501F, -1.0F, 1, 1, 1, 0.0F, false));

        this.nozzle5 = new AdvancedModelRenderer(this);
        this.nozzle5.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.nozzle4.addChild(nozzle5);
        this.nozzle5.cubeList.add(new ModelBox(nozzle5, 0, 24, -0.5F, -0.501F, -1.0F, 1, 1, 1, 0.0F, false));

        this.nozzle6 = new AdvancedModelRenderer(this);
        this.nozzle6.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.nozzle5.addChild(nozzle6);
        this.nozzle6.cubeList.add(new ModelBox(nozzle6, 22, 23, -0.49F, -0.501F, -1.0F, 1, 1, 1, 0.0F, false));

        this.nozzle7 = new AdvancedModelRenderer(this);
        this.nozzle7.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.nozzle6.addChild(nozzle7);
        this.nozzle7.cubeList.add(new ModelBox(nozzle7, 18, 23, -0.5F, -0.501F, -1.0F, 1, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.nozzle7.addChild(jaw);


        this.jawL = new AdvancedModelRenderer(this);
        this.jawL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addChild(jawL);
        this.jawL.cubeList.add(new ModelBox(jawL, 8, 3, 0.0F, -1.0F, -2.0F, 1, 2, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jawL.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.1745F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 9, 22, 0.35F, 0.4F, -3.0F, 1, 0, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 9, 0.35F, 0.0F, -3.0F, 1, 0, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 22, 0.35F, 0.75F, -2.8F, 1, 0, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 2, 0.35F, -0.75F, -2.8F, 1, 0, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 22, 0.35F, -0.4F, -3.0F, 1, 0, 2, 0.0F, false));

        this.jawR = new AdvancedModelRenderer(this);
        this.jawR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addChild(jawR);
        this.jawR.cubeList.add(new ModelBox(jawR, 6, 7, -1.0F, -1.0F, -2.0F, 1, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jawR.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.1745F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 3, 5, -1.35F, 0.39F, -3.0F, 1, 0, 2, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 9, -1.35F, -0.01F, -3.0F, 1, 0, 2, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 9, -1.35F, 0.74F, -2.8F, 1, 0, 2, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 18, -1.35F, -0.76F, -2.8F, 1, 0, 2, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 20, -1.35F, -0.41F, -3.0F, 1, 0, 2, 0.0F, false));

        this.middleeye = new AdvancedModelRenderer(this);
        this.middleeye.setRotationPoint(0.0F, -3.0F, -5.55F);
        this.head.addChild(middleeye);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.middleeye.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.7854F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 25, 15, -0.5F, -1.1F, -0.5F, 1, 1, 1, 0.0F, false));

        this.backeyeL = new AdvancedModelRenderer(this);
        this.backeyeL.setRotationPoint(0.25F, -2.35F, -5.6F);
        this.head.addChild(backeyeL);
        this.setRotateAngle(backeyeL, -0.1745F, 0.0F, 0.8727F);
        this.backeyeL.cubeList.add(new ModelBox(backeyeL, 28, 29, -0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.backeyeR = new AdvancedModelRenderer(this);
        this.backeyeR.setRotationPoint(-0.25F, -2.35F, -5.6F);
        this.head.addChild(backeyeR);
        this.setRotateAngle(backeyeR, -0.1745F, 0.0F, -0.8727F);
        this.backeyeR.cubeList.add(new ModelBox(backeyeR, 28, 19, -0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.fronteyeL = new AdvancedModelRenderer(this);
        this.fronteyeL.setRotationPoint(0.55F, -2.85F, -6.35F);
        this.head.addChild(fronteyeL);
        this.setRotateAngle(fronteyeL, -0.4363F, -0.6981F, 0.0F);
        this.fronteyeL.cubeList.add(new ModelBox(fronteyeL, 25, 0, -0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F, false));

        this.fronteyeR = new AdvancedModelRenderer(this);
        this.fronteyeR.setRotationPoint(-0.55F, -2.85F, -6.35F);
        this.head.addChild(fronteyeR);
        this.setRotateAngle(fronteyeR, -0.4363F, 0.6981F, 0.0F);
        this.fronteyeR.cubeList.add(new ModelBox(fronteyeR, 15, 25, -0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F, false));

        this.segment1 = new AdvancedModelRenderer(this);
        this.segment1.setRotationPoint(0.0F, -2.5F, -4.0F);
        this.head.addChild(segment1);
        this.segment1.cubeList.add(new ModelBox(segment1, 22, 6, -1.0F, -0.75F, 0.0F, 2, 2, 1, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(0.5F, 0.75F, 0.5F);
        this.segment1.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.0F, -0.3491F);
        this.legL1.cubeList.add(new ModelBox(legL1, 4, 28, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.segment1.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, 0.0F, 0.3491F);
        this.legR1.cubeList.add(new ModelBox(legR1, 28, 2, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finL1 = new AdvancedModelRenderer(this);
        this.finL1.setRotationPoint(1.0F, 0.5F, 0.5F);
        this.segment1.addChild(finL1);
        this.setRotateAngle(finL1, 0.0F, 0.0F, 0.2618F);
        this.finL1.cubeList.add(new ModelBox(finL1, 23, 14, -0.45F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.finR1 = new AdvancedModelRenderer(this);
        this.finR1.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment1.addChild(finR1);
        this.setRotateAngle(finR1, 0.0F, 0.0F, -0.2618F);
        this.finR1.cubeList.add(new ModelBox(finR1, 14, 23, -1.55F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.segment2 = new AdvancedModelRenderer(this);
        this.segment2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment1.addChild(segment2);
        this.segment2.cubeList.add(new ModelBox(segment2, 5, 21, -0.99F, -0.76F, 0.0F, 2, 2, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.5F, 0.75F, 0.5F);
        this.segment2.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, -0.3491F);
        this.legL2.cubeList.add(new ModelBox(legL2, 2, 28, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.segment2.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, 0.3491F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 28, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finL2 = new AdvancedModelRenderer(this);
        this.finL2.setRotationPoint(1.0F, 0.5F, 0.5F);
        this.segment2.addChild(finL2);
        this.setRotateAngle(finL2, 0.0F, 0.0F, 0.2618F);
        this.finL2.cubeList.add(new ModelBox(finL2, 19, 5, -1.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finR2 = new AdvancedModelRenderer(this);
        this.finR2.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment2.addChild(finR2);
        this.setRotateAngle(finR2, 0.0F, 0.0F, -0.2618F);
        this.finR2.cubeList.add(new ModelBox(finR2, 18, 1, -2.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.segment3 = new AdvancedModelRenderer(this);
        this.segment3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment2.addChild(segment3);
        this.segment3.cubeList.add(new ModelBox(segment3, 17, 20, -1.0F, -0.75F, 0.0F, 2, 2, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.5F, 0.75F, 0.5F);
        this.segment3.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0F, -0.3491F);
        this.legL3.cubeList.add(new ModelBox(legL3, 26, 27, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.segment3.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.0F, 0.3491F);
        this.legR3.cubeList.add(new ModelBox(legR3, 27, 25, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finL3 = new AdvancedModelRenderer(this);
        this.finL3.setRotationPoint(1.0F, 0.5F, 0.5F);
        this.segment3.addChild(finL3);
        this.setRotateAngle(finL3, 0.0F, 0.0F, 0.2618F);
        this.finL3.cubeList.add(new ModelBox(finL3, 18, 0, -0.75F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finR3 = new AdvancedModelRenderer(this);
        this.finR3.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment3.addChild(finR3);
        this.setRotateAngle(finR3, 0.0F, 0.0F, -0.2618F);
        this.finR3.cubeList.add(new ModelBox(finR3, 17, 14, -2.25F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.segment4 = new AdvancedModelRenderer(this);
        this.segment4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment3.addChild(segment4);
        this.segment4.cubeList.add(new ModelBox(segment4, 11, 19, -0.99F, -0.76F, 0.0F, 2, 2, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.5F, 0.75F, 0.5F);
        this.segment4.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0F, -0.3491F);
        this.legL4.cubeList.add(new ModelBox(legL4, 24, 27, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.segment4.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0F, 0.3491F);
        this.legR4.cubeList.add(new ModelBox(legR4, 22, 27, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finL4 = new AdvancedModelRenderer(this);
        this.finL4.setRotationPoint(1.0F, 0.5F, 0.5F);
        this.segment4.addChild(finL4);
        this.setRotateAngle(finL4, 0.0F, 0.0F, 0.2618F);
        this.finL4.cubeList.add(new ModelBox(finL4, 17, 13, -0.55F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finR4 = new AdvancedModelRenderer(this);
        this.finR4.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment4.addChild(finR4);
        this.setRotateAngle(finR4, 0.0F, 0.0F, -0.2618F);
        this.finR4.cubeList.add(new ModelBox(finR4, 17, 11, -2.45F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.segment5 = new AdvancedModelRenderer(this);
        this.segment5.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment4.addChild(segment5);
        this.segment5.cubeList.add(new ModelBox(segment5, 0, 19, -1.0F, -0.75F, 0.0F, 2, 2, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.5F, 0.75F, 0.5F);
        this.segment5.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0F, -0.3491F);
        this.legL5.cubeList.add(new ModelBox(legL5, 20, 27, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.segment5.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.0F, 0.3491F);
        this.legR5.cubeList.add(new ModelBox(legR5, 18, 27, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finL5 = new AdvancedModelRenderer(this);
        this.finL5.setRotationPoint(1.0F, 0.5F, 0.5F);
        this.segment5.addChild(finL5);
        this.setRotateAngle(finL5, 0.0F, 0.0F, 0.2618F);
        this.finL5.cubeList.add(new ModelBox(finL5, 17, 10, -0.45F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finR5 = new AdvancedModelRenderer(this);
        this.finR5.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment5.addChild(finR5);
        this.setRotateAngle(finR5, 0.0F, 0.0F, -0.2618F);
        this.finR5.cubeList.add(new ModelBox(finR5, 17, 4, -2.55F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.segment6 = new AdvancedModelRenderer(this);
        this.segment6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment5.addChild(segment6);
        this.segment6.cubeList.add(new ModelBox(segment6, 16, 17, -0.99F, -0.76F, 0.0F, 2, 2, 1, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(0.5F, 0.75F, 0.5F);
        this.segment6.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, 0.0F, -0.3491F);
        this.legL6.cubeList.add(new ModelBox(legL6, 27, 17, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.segment6.addChild(legR6);
        this.setRotateAngle(legR6, 0.0F, 0.0F, 0.3491F);
        this.legR6.cubeList.add(new ModelBox(legR6, 16, 27, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finL6 = new AdvancedModelRenderer(this);
        this.finL6.setRotationPoint(1.0F, 0.5F, 0.5F);
        this.segment6.addChild(finL6);
        this.setRotateAngle(finL6, 0.0F, 0.0F, 0.2618F);
        this.finL6.cubeList.add(new ModelBox(finL6, 17, 3, -0.25F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finR6 = new AdvancedModelRenderer(this);
        this.finR6.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment6.addChild(finR6);
        this.setRotateAngle(finR6, 0.0F, 0.0F, -0.2618F);
        this.finR6.cubeList.add(new ModelBox(finR6, 16, 16, -2.75F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.segment7 = new AdvancedModelRenderer(this);
        this.segment7.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment6.addChild(segment7);
        this.segment7.cubeList.add(new ModelBox(segment7, 6, 17, -1.0F, -0.75F, 0.0F, 2, 2, 1, 0.0F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(0.5F, 0.75F, 0.5F);
        this.segment7.addChild(legL7);
        this.setRotateAngle(legL7, 0.0F, 0.0F, -0.3491F);
        this.legL7.cubeList.add(new ModelBox(legL7, 14, 27, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.segment7.addChild(legR7);
        this.setRotateAngle(legR7, 0.0F, 0.0F, 0.3491F);
        this.legR7.cubeList.add(new ModelBox(legR7, 27, 5, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finL7 = new AdvancedModelRenderer(this);
        this.finL7.setRotationPoint(1.0F, 0.5F, 0.5F);
        this.segment7.addChild(finL7);
        this.setRotateAngle(finL7, 0.0F, 0.0F, 0.2618F);
        this.finL7.cubeList.add(new ModelBox(finL7, 16, 12, -0.1F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finR7 = new AdvancedModelRenderer(this);
        this.finR7.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment7.addChild(finR7);
        this.setRotateAngle(finR7, 0.0F, 0.0F, -0.2618F);
        this.finR7.cubeList.add(new ModelBox(finR7, 16, 9, -2.9F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.segment8 = new AdvancedModelRenderer(this);
        this.segment8.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment7.addChild(segment8);
        this.segment8.cubeList.add(new ModelBox(segment8, 0, 16, -0.99F, -0.76F, 0.0F, 2, 2, 1, 0.0F, false));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(0.5F, 0.75F, 0.5F);
        this.segment8.addChild(legL8);
        this.setRotateAngle(legL8, 0.0F, 0.0F, -0.3491F);
        this.legL8.cubeList.add(new ModelBox(legL8, 26, 23, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.segment8.addChild(legR8);
        this.setRotateAngle(legR8, 0.0F, 0.0F, 0.3491F);
        this.legR8.cubeList.add(new ModelBox(legR8, 12, 26, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finL8 = new AdvancedModelRenderer(this);
        this.finL8.setRotationPoint(1.0F, 0.5F, 0.5F);
        this.segment8.addChild(finL8);
        this.setRotateAngle(finL8, 0.0F, 0.0F, 0.2618F);
        this.finL8.cubeList.add(new ModelBox(finL8, 16, 2, -0.15F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finR8 = new AdvancedModelRenderer(this);
        this.finR8.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment8.addChild(finR8);
        this.setRotateAngle(finR8, 0.0F, 0.0F, -0.2618F);
        this.finR8.cubeList.add(new ModelBox(finR8, 15, 15, -2.85F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.segment9 = new AdvancedModelRenderer(this);
        this.segment9.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment8.addChild(segment9);
        this.segment9.cubeList.add(new ModelBox(segment9, 11, 15, -1.0F, -0.75F, 0.0F, 2, 2, 1, 0.0F, false));

        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(0.5F, 0.75F, 0.5F);
        this.segment9.addChild(legL9);
        this.setRotateAngle(legL9, 0.0F, 0.0F, -0.3491F);
        this.legL9.cubeList.add(new ModelBox(legL9, 10, 26, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.segment9.addChild(legR9);
        this.setRotateAngle(legR9, 0.0F, 0.0F, 0.3491F);
        this.legR9.cubeList.add(new ModelBox(legR9, 26, 9, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finL9 = new AdvancedModelRenderer(this);
        this.finL9.setRotationPoint(1.0F, 0.5F, 0.5F);
        this.segment9.addChild(finL9);
        this.setRotateAngle(finL9, 0.0F, 0.0F, 0.2618F);
        this.finL9.cubeList.add(new ModelBox(finL9, 15, 8, -0.25F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finR9 = new AdvancedModelRenderer(this);
        this.finR9.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment9.addChild(finR9);
        this.setRotateAngle(finR9, 0.0F, 0.0F, -0.2618F);
        this.finR9.cubeList.add(new ModelBox(finR9, 15, 7, -2.75F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.segment10 = new AdvancedModelRenderer(this);
        this.segment10.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment9.addChild(segment10);
        this.segment10.cubeList.add(new ModelBox(segment10, 5, 14, -0.99F, -0.76F, 0.0F, 2, 2, 1, 0.0F, false));

        this.legL10 = new AdvancedModelRenderer(this);
        this.legL10.setRotationPoint(0.5F, 0.75F, 0.5F);
        this.segment10.addChild(legL10);
        this.setRotateAngle(legL10, 0.0F, 0.0F, -0.3491F);
        this.legL10.cubeList.add(new ModelBox(legL10, 8, 26, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR10 = new AdvancedModelRenderer(this);
        this.legR10.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.segment10.addChild(legR10);
        this.setRotateAngle(legR10, 0.0F, 0.0F, 0.3491F);
        this.legR10.cubeList.add(new ModelBox(legR10, 6, 26, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finL10 = new AdvancedModelRenderer(this);
        this.finL10.setRotationPoint(1.0F, 0.5F, 0.5F);
        this.segment10.addChild(finL10);
        this.setRotateAngle(finL10, 0.0F, 0.0F, 0.2618F);
        this.finL10.cubeList.add(new ModelBox(finL10, 13, 6, -0.4F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finR10 = new AdvancedModelRenderer(this);
        this.finR10.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment10.addChild(finR10);
        this.setRotateAngle(finR10, 0.0F, 0.0F, -0.2618F);
        this.finR10.cubeList.add(new ModelBox(finR10, 13, 5, -2.6F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.segment11 = new AdvancedModelRenderer(this);
        this.segment11.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment10.addChild(segment11);
        this.segment11.cubeList.add(new ModelBox(segment11, 12, 12, -1.0F, -0.75F, 0.0F, 2, 2, 1, 0.0F, false));

        this.legL11 = new AdvancedModelRenderer(this);
        this.legL11.setRotationPoint(0.5F, 0.75F, 0.5F);
        this.segment11.addChild(legL11);
        this.setRotateAngle(legL11, 0.0F, 0.0F, -0.3491F);
        this.legL11.cubeList.add(new ModelBox(legL11, 4, 26, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR11 = new AdvancedModelRenderer(this);
        this.legR11.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.segment11.addChild(legR11);
        this.setRotateAngle(legR11, 0.0F, 0.0F, 0.3491F);
        this.legR11.cubeList.add(new ModelBox(legR11, 26, 2, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finL11 = new AdvancedModelRenderer(this);
        this.finL11.setRotationPoint(1.0F, 0.5F, 0.5F);
        this.segment11.addChild(finL11);
        this.setRotateAngle(finL11, 0.0F, 0.0F, 0.2618F);
        this.finL11.cubeList.add(new ModelBox(finL11, 12, 1, -0.65F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finR11 = new AdvancedModelRenderer(this);
        this.finR11.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment11.addChild(finR11);
        this.setRotateAngle(finR11, 0.0F, 0.0F, -0.2618F);
        this.finR11.cubeList.add(new ModelBox(finR11, 12, 0, -2.35F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.segment12 = new AdvancedModelRenderer(this);
        this.segment12.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment11.addChild(segment12);
        this.segment12.cubeList.add(new ModelBox(segment12, 12, 9, -0.99F, -0.76F, 0.0F, 2, 2, 1, 0.0F, false));

        this.legL12 = new AdvancedModelRenderer(this);
        this.legL12.setRotationPoint(0.5F, 0.75F, 0.5F);
        this.segment12.addChild(legL12);
        this.setRotateAngle(legL12, 0.0F, 0.0F, -0.3491F);
        this.legL12.cubeList.add(new ModelBox(legL12, 2, 26, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR12 = new AdvancedModelRenderer(this);
        this.legR12.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.segment12.addChild(legR12);
        this.setRotateAngle(legR12, 0.0F, 0.0F, 0.3491F);
        this.legR12.cubeList.add(new ModelBox(legR12, 0, 26, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finL12 = new AdvancedModelRenderer(this);
        this.finL12.setRotationPoint(1.0F, 0.5F, 0.5F);
        this.segment12.addChild(finL12);
        this.setRotateAngle(finL12, 0.0F, 0.0F, 0.2618F);
        this.finL12.cubeList.add(new ModelBox(finL12, 23, 13, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.finR12 = new AdvancedModelRenderer(this);
        this.finR12.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment12.addChild(finR12);
        this.setRotateAngle(finR12, 0.0F, 0.0F, -0.2618F);
        this.finR12.cubeList.add(new ModelBox(finR12, 23, 11, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.segment13 = new AdvancedModelRenderer(this);
        this.segment13.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment12.addChild(segment13);
        this.segment13.cubeList.add(new ModelBox(segment13, 12, 2, -1.0F, -0.75F, 0.0F, 2, 2, 1, 0.0F, false));

        this.legL13 = new AdvancedModelRenderer(this);
        this.legL13.setRotationPoint(0.5F, 0.75F, 0.5F);
        this.segment13.addChild(legL13);
        this.setRotateAngle(legL13, 0.0F, 0.0F, -0.3491F);
        this.legL13.cubeList.add(new ModelBox(legL13, 25, 25, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR13 = new AdvancedModelRenderer(this);
        this.legR13.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.segment13.addChild(legR13);
        this.setRotateAngle(legR13, 0.0F, 0.0F, 0.3491F);
        this.legR13.cubeList.add(new ModelBox(legR13, 23, 25, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finL13 = new AdvancedModelRenderer(this);
        this.finL13.setRotationPoint(1.0F, 0.5F, 0.5F);
        this.segment13.addChild(finL13);
        this.setRotateAngle(finL13, 0.0F, 0.0F, 0.2618F);
        this.finL13.cubeList.add(new ModelBox(finL13, 23, 4, -0.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.finR13 = new AdvancedModelRenderer(this);
        this.finR13.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment13.addChild(finR13);
        this.setRotateAngle(finR13, 0.0F, 0.0F, -0.2618F);
        this.finR13.cubeList.add(new ModelBox(finR13, 22, 22, -1.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.segment14 = new AdvancedModelRenderer(this);
        this.segment14.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment13.addChild(segment14);
        this.segment14.cubeList.add(new ModelBox(segment14, 0, 12, -0.99F, -0.76F, 0.0F, 2, 2, 1, 0.0F, false));

        this.legL14 = new AdvancedModelRenderer(this);
        this.legL14.setRotationPoint(0.5F, 0.75F, 0.5F);
        this.segment14.addChild(legL14);
        this.setRotateAngle(legL14, 0.0F, 0.0F, -0.3491F);
        this.legL14.cubeList.add(new ModelBox(legL14, 0, 22, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR14 = new AdvancedModelRenderer(this);
        this.legR14.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.segment14.addChild(legR14);
        this.setRotateAngle(legR14, 0.0F, 0.0F, 0.3491F);
        this.legR14.cubeList.add(new ModelBox(legR14, 0, 9, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finL14 = new AdvancedModelRenderer(this);
        this.finL14.setRotationPoint(1.0F, 0.5F, 0.5F);
        this.segment14.addChild(finL14);
        this.setRotateAngle(finL14, 0.0F, 0.0F, 0.2618F);
        this.finL14.cubeList.add(new ModelBox(finL14, 22, 12, -0.5F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.finR14 = new AdvancedModelRenderer(this);
        this.finR14.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment14.addChild(finR14);
        this.setRotateAngle(finR14, 0.0F, 0.0F, -0.2618F);
        this.finR14.cubeList.add(new ModelBox(finR14, 5, 20, -1.5F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.segment15 = new AdvancedModelRenderer(this);
        this.segment15.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment14.addChild(segment15);
        this.segment15.cubeList.add(new ModelBox(segment15, 6, 11, -1.0F, -0.75F, 0.0F, 2, 2, 1, 0.0F, false));

        this.legL15 = new AdvancedModelRenderer(this);
        this.legL15.setRotationPoint(0.5F, 0.75F, 0.5F);
        this.segment15.addChild(legL15);
        this.setRotateAngle(legL15, 0.0F, 0.0F, -0.3491F);
        this.legL15.cubeList.add(new ModelBox(legL15, 0, 5, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR15 = new AdvancedModelRenderer(this);
        this.legR15.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.segment15.addChild(legR15);
        this.setRotateAngle(legR15, 0.0F, 0.0F, 0.3491F);
        this.legR15.cubeList.add(new ModelBox(legR15, 0, 0, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finL15 = new AdvancedModelRenderer(this);
        this.finL15.setRotationPoint(1.0F, 0.5F, 0.5F);
        this.segment15.addChild(finL15);
        this.setRotateAngle(finL15, 0.0F, 0.0F, 0.2618F);
        this.finL15.cubeList.add(new ModelBox(finL15, 11, 18, -0.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.finR15 = new AdvancedModelRenderer(this);
        this.finR15.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment15.addChild(finR15);
        this.setRotateAngle(finR15, 0.0F, 0.0F, -0.2618F);
        this.finR15.cubeList.add(new ModelBox(finR15, 0, 15, -1.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.5F, 0.5F, 2.0F);
        this.segment15.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 5, -1.0F, -1.0F, -1.25F, 1, 1, 3, 0.0F, false));

        this.tailfinL1 = new AdvancedModelRenderer(this);
        this.tailfinL1.setRotationPoint(0.0F, -0.75F, -1.0F);
        this.tail.addChild(tailfinL1);
        this.setRotateAngle(tailfinL1, 0.0F, -0.5236F, -0.0873F);
        this.tailfinL1.cubeList.add(new ModelBox(tailfinL1, 0, 11, -0.5F, 0.0F, -0.25F, 3, 0, 1, 0.0F, false));

        this.tailfinR1 = new AdvancedModelRenderer(this);
        this.tailfinR1.setRotationPoint(-1.0F, -0.75F, -1.0F);
        this.tail.addChild(tailfinR1);
        this.setRotateAngle(tailfinR1, 0.0F, 0.5236F, 0.0873F);
        this.tailfinR1.cubeList.add(new ModelBox(tailfinR1, 6, 1, -2.5F, 0.0F, -0.25F, 3, 0, 1, 0.0F, false));

        this.tailfinL2 = new AdvancedModelRenderer(this);
        this.tailfinL2.setRotationPoint(0.0F, -0.85F, 0.0F);
        this.tail.addChild(tailfinL2);
        this.setRotateAngle(tailfinL2, 0.0F, -0.6109F, -0.1745F);
        this.tailfinL2.cubeList.add(new ModelBox(tailfinL2, 9, 8, -0.5F, 0.0F, -0.25F, 3, 0, 1, 0.0F, false));

        this.tailfinR2 = new AdvancedModelRenderer(this);
        this.tailfinR2.setRotationPoint(-1.0F, -0.85F, 0.0F);
        this.tail.addChild(tailfinR2);
        this.setRotateAngle(tailfinR2, 0.0F, 0.6109F, 0.1745F);
        this.tailfinR2.cubeList.add(new ModelBox(tailfinR2, 6, 0, -2.5F, 0.0F, -0.25F, 3, 0, 1, 0.0F, false));

        this.tailfinL3 = new AdvancedModelRenderer(this);
        this.tailfinL3.setRotationPoint(0.0F, -0.95F, 1.25F);
        this.tail.addChild(tailfinL3);
        this.setRotateAngle(tailfinL3, 0.0F, -1.0472F, -0.3491F);
        this.tailfinL3.cubeList.add(new ModelBox(tailfinL3, 9, 7, -0.5F, 0.0F, -0.25F, 3, 0, 1, 0.0F, false));

        this.tailfinR3 = new AdvancedModelRenderer(this);
        this.tailfinR3.setRotationPoint(-1.0F, -0.95F, 1.25F);
        this.tail.addChild(tailfinR3);
        this.setRotateAngle(tailfinR3, 0.0F, 1.0472F, 0.3491F);
        this.tailfinR3.cubeList.add(new ModelBox(tailfinR3, 6, 2, -2.5F, 0.0F, -0.25F, 3, 0, 1, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.head.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.head.offsetY = -1.4F;
        this.head.offsetX = -0.2F;
        this.head.offsetZ = 2.0F;
        this.head.rotateAngleY = (float)Math.toRadians(120);
        this.head.rotateAngleX = (float)Math.toRadians(1);
        this.head.rotateAngleZ = (float)Math.toRadians(0);
        this.head.scaleChildren = true;
        float scaler = 3.2F;
        this.head.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(head, 0.8F, 3.8F, -0.2F);
        this.setRotateAngle(nozzle, -0.01F, 0.0F, 0.0F);
        this.setRotateAngle(nozzle2, -0.02F, 0.0F, 0.0F);
        this.setRotateAngle(nozzle3, -0.03F, 0.0F, 0.0F);
        this.setRotateAngle(nozzle4, -0.04F, 0.0F, 0.0F);
        this.setRotateAngle(nozzle5, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(nozzle6, -0.06F, 0.0F, 0.0F);
        this.setRotateAngle(nozzle7, -0.07F, 0.0F, 0.0F);
        this.setRotateAngle(jawL, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(jawR, 0.0F, 0.5F, 0.0F);
        this.setRotateAngle(segment1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(segment2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(segment3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(segment4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(segment5, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(segment6, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(segment7, 0.01F, 0.0F, 0.0F);
        this.setRotateAngle(segment8, 0.02F, 0.0F, 0.0F);
        this.setRotateAngle(segment9, 0.03F, 0.0F, 0.0F);
        this.setRotateAngle(segment10, 0.04F, 0.0F, 0.0F);
        this.setRotateAngle(segment11, 0.05F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.head.render(f);
        //Reset rotations, positions and sizing:
        this.head.setScale(1.0F, 1.0F, 1.0F);
        this.head.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticDisplayCase(float f) {
        this.setRotateAngle(head, 0.0F, -0.5F, 0.0F);
        this.head.offsetX = 0.0F;
        this.head.offsetZ = 0.0F;
        this.head.offsetY = 0.0F;
        this.head.render(0.01f);
        resetToDefaultPose();
    }
        public void renderStaticFloor(float f) {
        this.setRotateAngle(head, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(nozzle, -0.01F, 0.0F, 0.0F);
        this.setRotateAngle(nozzle2, -0.02F, 0.0F, 0.0F);
        this.setRotateAngle(nozzle3, -0.03F, 0.0F, 0.0F);
        this.setRotateAngle(nozzle4, -0.04F, 0.0F, 0.0F);
        this.setRotateAngle(nozzle5, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(nozzle6, -0.06F, 0.0F, 0.0F);
        this.setRotateAngle(nozzle7, -0.07F, 0.0F, 0.0F);
        this.setRotateAngle(jawL, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(jawR, 0.0F, 0.5F, 0.0F);
        this.setRotateAngle(segment1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(segment2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(segment3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(segment4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(segment5, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(segment6, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(segment7, 0.01F, 0.0F, 0.0F);
        this.setRotateAngle(segment8, 0.02F, 0.0F, 0.0F);
        this.setRotateAngle(segment9, 0.03F, 0.0F, 0.0F);
        this.setRotateAngle(segment10, 0.04F, 0.0F, 0.0F);
        this.setRotateAngle(segment11, 0.05F, 0.0F, 0.0F);
        this.head.offsetY = -0.5F;
        this.head.render(0.01F);
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
        this.resetToDefaultPose();
        //this.head.offsetY = 1.1F;

        AdvancedModelRenderer[] BodyF = {this.segment1, this.segment2, this.segment3, this.segment4, this.segment5, this.segment6, this.segment7, this.segment8, this.segment9, this.segment10, this.segment11, this.segment12, this.segment13, this.segment14, this.segment15};
        AdvancedModelRenderer[] Trunk = {this.nozzle, this.nozzle2, this.nozzle, this.nozzle4, this.nozzle5, this.nozzle6, this.nozzle7};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {

            EntityPrehistoricFloraOpabinia ee = (EntityPrehistoricFloraOpabinia) e;
            float feedModifier = 1;
            if (f3 == 0.0) {
                feedModifier = 0.15F;
            }

            float tailVdegree = 0.016F;
            float tailHdegree = 0.025F;
            float degreeFin = 0.4F * feedModifier;
            this.chainWave(BodyF, speed * feedModifier, tailVdegree, -3, f2, 0.4F);
            this.chainSwing(BodyF, speed*  feedModifier, tailHdegree, -2.5, f2, 0.5F);

            this.flap(finL15, 0.5F, -degreeFin, false, 0, -0.5F, f2, 0.7F);
            this.flap(finR15, 0.5F, degreeFin, false, 0, 0.5F, f2, 0.7F);
            this.flap(finL14, 0.5F, -degreeFin, false, 0.5F, -0.5F, f2, 0.7F);
            this.flap(finR14, 0.5F, degreeFin, false, 0.5F, 0.5F, f2, 0.7F);
            this.flap(finL13, 0.5F, -degreeFin, false, 1.0F, -0.5F, f2, 0.7F);
            this.flap(finR13, 0.5F, degreeFin, false, 1.0F, 0.5F, f2, 0.7F);
            this.flap(finL12, 0.5F, -degreeFin, false, 1.5F, -0.5F, f2, 0.7F);
            this.flap(finR12, 0.5F, degreeFin, false, 1.5F, 0.5F, f2, 0.7F);
            this.flap(finL11, 0.5F, -degreeFin, false, 2.0F, -0.5F, f2, 0.7F);
            this.flap(finR11, 0.5F, degreeFin, false, 2.0F, 0.5F, f2, 0.7F);
            this.flap(finL10, 0.5F, -degreeFin, false, 2.5F, -0.5F, f2, 0.7F);
            this.flap(finR10, 0.5F, degreeFin, false, 2.5F, 0.5F, f2, 0.7F);
            this.flap(finL9, 0.5F, -degreeFin, false, 3.0F, -0.5F, f2, 0.7F);
            this.flap(finR9, 0.5F, degreeFin, false, 3.0F, 0.5F, f2, 0.7F);
            this.flap(finL8, 0.5F, -degreeFin, false, 3.5F, -0.5F, f2, 0.7F);
            this.flap(finR8, 0.5F, degreeFin, false, 3.5F, 0.5F, f2, 0.7F);
            this.flap(finL7, 0.5F, -degreeFin, false, 4.0F, -0.5F, f2, 0.7F);
            this.flap(finR7, 0.5F, degreeFin, false, 4.0F, 0.5F, f2, 0.7F);
            this.flap(finL6, 0.5F, -degreeFin, false, 4.5F, -0.5F, f2, 0.7F);
            this.flap(finR6, 0.5F, degreeFin, false, 4.5F, 0.5F, f2, 0.7F);
            this.flap(finL5, 0.5F, -degreeFin, false, 5.0F, -0.5F, f2, 0.7F);
            this.flap(finR5, 0.5F, degreeFin, false, 5.0F, 0.5F, f2, 0.7F);
            this.flap(finL4, 0.5F, -degreeFin, false, 5.5F, -0.5F, f2, 0.7F);
            this.flap(finR4, 0.5F, degreeFin, false, 5.5F, 0.5F, f2, 0.7F);
            this.flap(finL3, 0.5F, -degreeFin, false, 6.0F, -0.5F, f2, 0.7F);
            this.flap(finR3, 0.5F, degreeFin, false, 6.0F, 0.5F, f2, 0.7F);
            this.flap(finL2, 0.5F, -degreeFin, false, 6.5F, -0.5F, f2, 0.7F);
            this.flap(finR2, 0.5F, degreeFin, false, 6.5F, 0.5F, f2, 0.7F);
            this.flap(finL1, 0.5F, -degreeFin, false, 7.0F, -0.5F, f2, 0.7F);
            this.flap(finR1, 0.5F, degreeFin, false, 7.0F, 0.5F, f2, 0.7F);

            float speedLeg = 2.1F * feedModifier;
            float degreeLeg = 0.2F;
            this.flap(legL1, speedLeg, -degreeLeg, false, 0, -0.5F, f2, 0.7F);
            this.flap(legR1, speedLeg, degreeLeg, false, 0, 0.5F, f2, 0.7F);
            this.flap(legL2, speedLeg, -degreeLeg, false, 0.5F, -0.5F, f2, 0.7F);
            this.flap(legR2, speedLeg, degreeLeg, false, 0.5F, 0.5F, f2, 0.7F);
            this.flap(legL3, speedLeg, -degreeLeg, false, 1.0F, -0.5F, f2, 0.7F);
            this.flap(legR3, speedLeg, degreeLeg, false, 1.0F, 0.5F, f2, 0.7F);
            this.flap(legL4, speedLeg, -degreeLeg, false, 1.5F, -0.5F, f2, 0.7F);
            this.flap(legR4, speedLeg, degreeLeg, false, 1.5F, 0.5F, f2, 0.7F);
            this.flap(legL5, speedLeg, -degreeLeg, false, 2.0F, -0.5F, f2, 0.7F);
            this.flap(legR5, speedLeg, degreeLeg, false, 2.0F, 0.5F, f2, 0.7F);
            this.flap(legL6, speedLeg, -degreeLeg, false, 2.5F, -0.5F, f2, 0.7F);
            this.flap(legR6, speedLeg, degreeLeg, false, 2.5F, 0.5F, f2, 0.7F);
            this.flap(legL7, speedLeg, -degreeLeg, false, 3.0F, -0.5F, f2, 0.7F);
            this.flap(legR7, speedLeg, degreeLeg, false, 3.0F, 0.5F, f2, 0.7F);
            this.flap(legL8, speedLeg, -degreeLeg, false, 3.5F, -0.5F, f2, 0.7F);
            this.flap(legR8, speedLeg, degreeLeg, false, 3.5F, 0.5F, f2, 0.7F);
            this.flap(legL9, speedLeg, -degreeLeg, false, 4.0F, -0.5F, f2, 0.7F);
            this.flap(legR9, speedLeg, degreeLeg, false, 4.0F, 0.5F, f2, 0.7F);
            this.flap(legL10, speedLeg, -degreeLeg, false, 4.5F, -0.5F, f2, 0.7F);
            this.flap(legR10, speedLeg, degreeLeg, false, 4.5F, 0.5F, f2, 0.7F);
            this.flap(legL11, speedLeg, -degreeLeg, false, 5.0F, -0.5F, f2, 0.7F);
            this.flap(legR11, speedLeg, degreeLeg, false, 5.0F, 0.5F, f2, 0.7F);
            this.flap(legL12, speedLeg, -degreeLeg, false, 5.5F, -0.5F, f2, 0.7F);
            this.flap(legR12, speedLeg, degreeLeg, false, 5.5F, 0.5F, f2, 0.7F);
            this.flap(legL13, speedLeg, -degreeLeg, false, 6.0F, -0.5F, f2, 0.7F);
            this.flap(legR13, speedLeg, degreeLeg, false, 6.0F, 0.5F, f2, 0.7F);
            this.flap(legL14, speedLeg, -degreeLeg, false, 6.5F, -0.5F, f2, 0.7F);
            this.flap(legR14, speedLeg, degreeLeg, false, 6.5F, 0.5F, f2, 0.7F);
            this.flap(legL15, speedLeg, -degreeLeg, false, 7.0F, -0.5F, f2, 0.7F);
            this.flap(legR15, speedLeg, degreeLeg, false, 7.0F, 0.5F, f2, 0.7F);

            if (f3 != 0) {
                this.chainWave(Trunk, speed * 0.2F, 0.06F, -2, f2, 0.6F);
                this.chainSwing(Trunk, speed * 0.2F, 0.06F, -2, f2, 0.8F);

                this.jawL.swing(speed * 0.5F, -0.2F, false, 0F, -0.2F, f2, 1F);
                this.jawR.swing(speed * 0.5F, 0.2F, false, 0F, 0.2F, f2, 1F);
            }

            if (!e.isInWater()) {
                this.bob(head, -speed * 1.5F, 2F, false, f2, 1);
            } else {
                if (f3 == 0.0F) {
                    this.bob(head, -speed, 0.01F, false, f2, 2);
                } else {
                    this.bob(head, -speed, 0.12F, false, f2, 2);
                }
            }
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraOpabinia e = (EntityPrehistoricFloraOpabinia) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.FEED_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.nozzle, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle2, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle4, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle5, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle6, (float) Math.toRadians(27.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle7, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.startKeyframe(5);
        animator.rotate(this.nozzle, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle2, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle4, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle5, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle6, (float) Math.toRadians(40.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle7, (float) Math.toRadians(62.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.rotate(this.nozzle, (float) Math.toRadians(-20), (float) Math.toRadians(25), (float) Math.toRadians(0));
        animator.rotate(this.nozzle2, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle4, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle5, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle6, (float) Math.toRadians(27.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle7, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.rotate(this.nozzle, (float) Math.toRadians(-20), (float) Math.toRadians(25), (float) Math.toRadians(0));
        animator.rotate(this.nozzle2, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle4, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle5, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle6, (float) Math.toRadians(40.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle7, (float) Math.toRadians(62.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.rotate(this.nozzle, (float) Math.toRadians(-20), (float) Math.toRadians(-25), (float) Math.toRadians(0));
        animator.rotate(this.nozzle2, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle4, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle5, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle6, (float) Math.toRadians(27.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle7, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.rotate(this.nozzle, (float) Math.toRadians(-20), (float) Math.toRadians(-25), (float) Math.toRadians(0));
        animator.rotate(this.nozzle2, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle4, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle5, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle6, (float) Math.toRadians(40.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.nozzle7, (float) Math.toRadians(62.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);

    }
}