package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraDuslia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelDuslia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer AntennaR;
    private final AdvancedModelRenderer AntennaL;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR2;

    public ModelDuslia() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 23.5F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 6, 15, -1.0F, -1.5F, -4.0F, 2, 1, 2, 0.01F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 7, -1.0F, -1.1F, -6.5F, 2, 1, 3, 0.015F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 1, 0.0F, -1.1F, -7.5F, 0, 1, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 1, 0.5F, -1.1F, -7.5F, 0, 1, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 1, -0.5F, -1.1F, -7.5F, 0, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -0.1F, -2.0F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.3491F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -3.25F, -1.0F, -0.5F, 0, 1, 1, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.75F, -1.0F, -0.5F, 0, 1, 1, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.25F, -1.0F, -0.5F, 0, 1, 1, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.75F, -1.0F, -0.5F, 0, 1, 1, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 13, -4.5F, -1.0F, -0.25F, 1, 1, 0, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 13, -4.5F, -1.0F, -0.75F, 1, 1, 0, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 13, -4.5F, -1.0F, -1.25F, 1, 1, 0, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 13, -4.5F, -1.0F, -1.75F, 1, 1, 0, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 4, -3.5F, -1.0F, -2.0F, 4, 1, 2, -0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, -0.1F, -4.0F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -1.0908F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 9, -3.2F, -1.0F, 1.8F, 1, 1, 0, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 9, -3.2F, -1.0F, 1.3F, 1, 1, 0, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 9, -3.2F, -1.0F, 0.8F, 1, 1, 0, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 9, -3.2F, -1.0F, 0.3F, 1, 1, 0, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 9, -3.2F, -1.0F, -0.2F, 1, 1, 0, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 9, -3.2F, -1.0F, -0.7F, 1, 1, 0, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 9, -3.2F, -1.0F, -1.2F, 1, 1, 0, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -2.2F, -1.0F, -1.2F, 3, 1, 3, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, -0.1F, -2.0F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.3491F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 3.25F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 1.75F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 2.25F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 2.75F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 13, 3.5F, -1.0F, -0.25F, 1, 1, 0, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 13, 3.5F, -1.0F, -0.75F, 1, 1, 0, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 13, 3.5F, -1.0F, -1.25F, 1, 1, 0, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 13, 3.5F, -1.0F, -1.75F, 1, 1, 0, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 4, -0.5F, -1.0F, -2.0F, 4, 1, 2, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, -0.1F, -4.0F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 1.0908F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 9, 2.2F, -1.0F, 1.8F, 1, 1, 0, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 9, 2.2F, -1.0F, 1.3F, 1, 1, 0, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 9, 2.2F, -1.0F, 0.8F, 1, 1, 0, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 9, 2.2F, -1.0F, 0.3F, 1, 1, 0, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 9, 2.2F, -1.0F, -0.2F, 1, 1, 0, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 9, 2.2F, -1.0F, -0.7F, 1, 1, 0, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 9, 2.2F, -1.0F, -1.2F, 1, 1, 0, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.8F, -1.0F, -1.2F, 3, 1, 3, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 14, 13, -1.0F, -1.5F, 0.0F, 2, 1, 2, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 9, 10, 0.75F, -1.08F, 0.7F, 4, 1, 1, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 13, 4.75F, -1.08F, 0.7F, 1, 1, 0, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 13, 4.75F, -1.08F, 1.2F, 1, 1, 0, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 13, 4.75F, -1.08F, 1.7F, 1, 1, 0, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 9, 10, -4.75F, -1.08F, 0.7F, 4, 1, 1, 0.0F, true));
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 13, -5.75F, -1.08F, 0.7F, 1, 1, 0, 0.0F, true));
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 13, -5.75F, -1.08F, 1.2F, 1, 1, 0, 0.0F, true));
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 13, -5.75F, -1.08F, 1.7F, 1, 1, 0, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, 0.0F, 1.25F);
        this.Body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.2182F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 9, -4.75F, -1.07F, 0.95F, 1, 1, 0, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 9, -4.75F, -1.07F, 0.45F, 1, 1, 0, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 9, -4.75F, -1.07F, -0.05F, 1, 1, 0, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 4, -3.75F, -1.07F, -0.05F, 4, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, 0.0F, 0.5F);
        this.Body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.1745F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 6, 13, -4.75F, -1.09F, 0.5F, 1, 1, 0, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 6, 13, -4.75F, -1.09F, 0.0F, 1, 1, 0, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 6, 13, -4.75F, -1.09F, -0.5F, 1, 1, 0, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 11, -3.75F, -1.09F, -0.5F, 4, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, 0.0F, 1.25F);
        this.Body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.2182F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 9, 3.75F, -1.07F, 0.95F, 1, 1, 0, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 9, 3.75F, -1.07F, 0.45F, 1, 1, 0, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 9, 3.75F, -1.07F, -0.05F, 1, 1, 0, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 4, -0.25F, -1.07F, -0.05F, 4, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, 0.0F, 0.5F);
        this.Body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.1745F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 6, 13, 3.75F, -1.09F, 0.5F, 1, 1, 0, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 6, 13, 3.75F, -1.09F, 0.0F, 1, 1, 0, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 6, 13, 3.75F, -1.09F, -0.5F, 1, 1, 0, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 11, -0.25F, -1.09F, -0.5F, 4, 1, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.5F, -0.1F, 0.5F);
        this.Body2.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0F, 0.1745F);
        this.legL3.cubeList.add(new ModelBox(legL3, 6, 9, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.5F, -0.1F, 0.5F);
        this.Body2.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.0F, -0.1745F);
        this.legR3.cubeList.add(new ModelBox(legR3, 6, 9, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.5F, -0.1F, 2.0F);
        this.Body2.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0F, -0.1745F);
        this.legR4.cubeList.add(new ModelBox(legR4, 6, 9, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.5F, -0.1F, 2.0F);
        this.Body2.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0F, 0.1745F);
        this.legL4.cubeList.add(new ModelBox(legL4, 6, 9, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 13, -1.0F, -1.5F, -0.025F, 2, 1, 2, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 0.0F, 1.5F);
        this.Body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.4363F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 7, -4.15F, -1.05F, 0.55F, 1, 1, 0, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 7, -4.15F, -1.05F, 0.05F, 1, 1, 0, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 7, -4.15F, -1.05F, -0.45F, 1, 1, 0, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 7, 7, -3.15F, -1.05F, -0.45F, 4, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, 0.0F, 0.5F);
        this.Body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.3491F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 8, -4.5F, -1.06F, 0.05F, 1, 1, 0, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 8, -4.5F, -1.06F, 0.55F, 1, 1, 0, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 8, -4.5F, -1.06F, -0.45F, 1, 1, 0, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 9, 0, -3.5F, -1.06F, -0.45F, 4, 1, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, 0.0F, 1.5F);
        this.Body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.4363F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 7, 3.15F, -1.05F, 0.55F, 1, 1, 0, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 7, 3.15F, -1.05F, 0.05F, 1, 1, 0, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 7, 3.15F, -1.05F, -0.45F, 1, 1, 0, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 7, 7, -0.85F, -1.05F, -0.45F, 4, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, 0.0F, 0.5F);
        this.Body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.3491F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 8, 3.5F, -1.06F, 0.05F, 1, 1, 0, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 8, 3.5F, -1.06F, 0.55F, 1, 1, 0, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 8, 3.5F, -1.06F, -0.45F, 1, 1, 0, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 9, 0, -0.5F, -1.06F, -0.45F, 4, 1, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.5F, -0.1F, 1.5F);
        this.Body3.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0F, 0.1745F);
        this.legL5.cubeList.add(new ModelBox(legL5, 6, 9, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.5F, -0.1F, 1.5F);
        this.Body3.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.0F, -0.1745F);
        this.legR5.cubeList.add(new ModelBox(legR5, 6, 9, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 8, 12, -1.0F, -1.5F, -0.05F, 2, 1, 2, -0.015F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 16, 8, -0.5F, -1.5F, 1.9F, 1, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, 0.0F, 1.5F);
        this.Body4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 1.3526F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 6, -2.5F, -0.75F, 0.3F, 2, 0, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, 0.0F, 1.5F);
        this.Body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 1.0472F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -3.1F, -1.02F, 1.2F, 1, 1, 0, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -3.1F, -1.02F, 0.7F, 1, 1, 0, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -3.1F, -1.02F, 0.2F, 1, 1, 0, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 16, -2.1F, -1.02F, 0.2F, 2, 1, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, 0.0F, 1.5F);
        this.Body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.7418F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 4, -3.1F, -1.03F, 0.55F, 1, 1, 0, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 4, -3.1F, -1.03F, 0.05F, 1, 1, 0, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 4, -3.1F, -1.03F, -0.45F, 1, 1, 0, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 12, 2, -2.1F, -1.03F, -0.45F, 3, 1, 1, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, 0.0F, 0.5F);
        this.Body4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.5672F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 5, -3.8F, -1.04F, 0.55F, 1, 1, 0, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 5, -3.8F, -1.04F, 0.05F, 1, 1, 0, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 5, -3.8F, -1.04F, -0.45F, 1, 1, 0, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 16, 6, -2.8F, -1.04F, -0.45F, 3, 1, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, 0.0F, 1.5F);
        this.Body4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -1.3526F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 11, 6, 0.5F, -0.75F, 0.3F, 2, 0, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.0F, 0.0F, 1.5F);
        this.Body4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -1.0472F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, 2.1F, -1.02F, 1.2F, 1, 1, 0, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, 2.1F, -1.02F, 0.7F, 1, 1, 0, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, 2.1F, -1.02F, 0.2F, 1, 1, 0, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 16, 0.1F, -1.02F, 0.2F, 2, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.0F, 0.0F, 1.5F);
        this.Body4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.7418F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 4, 2.1F, -1.03F, 0.55F, 1, 1, 0, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 4, 2.1F, -1.03F, 0.05F, 1, 1, 0, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 4, 2.1F, -1.03F, -0.45F, 1, 1, 0, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 12, 2, -0.9F, -1.03F, -0.45F, 3, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.0F, 0.0F, 0.5F);
        this.Body4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.5672F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 5, 2.8F, -1.04F, 0.55F, 1, 1, 0, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 5, 2.8F, -1.04F, 0.05F, 1, 1, 0, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 5, 2.8F, -1.04F, -0.45F, 1, 1, 0, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 16, 6, -0.2F, -1.04F, -0.45F, 3, 1, 1, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(0.5F, -0.1F, 1.0F);
        this.Body4.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, 0.0F, 0.2967F);
        this.legL6.cubeList.add(new ModelBox(legL6, 8, 2, 0.1F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-0.5F, -0.1F, 1.0F);
        this.Body4.addChild(legR6);
        this.setRotateAngle(legR6, 0.0F, 0.0F, -0.2967F);
        this.legR6.cubeList.add(new ModelBox(legR6, 8, 2, -2.1F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(0.5F, -0.1F, -4.5F);
        this.Body.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.0F, 0.1745F);
        this.legL.cubeList.add(new ModelBox(legL, 6, 9, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-0.5F, -0.1F, -4.5F);
        this.Body.addChild(legR);
        this.setRotateAngle(legR, 0.0F, 0.0F, -0.1745F);
        this.legR.cubeList.add(new ModelBox(legR, 6, 9, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.AntennaR = new AdvancedModelRenderer(this);
        this.AntennaR.setRotationPoint(-0.5F, -0.1F, -5.5F);
        this.Body.addChild(AntennaR);
        this.setRotateAngle(AntennaR, 0.0436F, 0.3491F, 0.0F);
        this.AntennaR.cubeList.add(new ModelBox(AntennaR, 0, 26, -4.0F, 0.0F, -5.0F, 4, 0, 5, 0.0F, true));

        this.AntennaL = new AdvancedModelRenderer(this);
        this.AntennaL.setRotationPoint(0.5F, -0.1F, -5.5F);
        this.Body.addChild(AntennaL);
        this.setRotateAngle(AntennaL, 0.0436F, -0.3491F, 0.0F);
        this.AntennaL.cubeList.add(new ModelBox(AntennaL, 0, 26, 0.0F, 0.0F, -5.0F, 4, 0, 5, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.5F, -0.1F, -3.0F);
        this.Body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, 0.1745F);
        this.legL2.cubeList.add(new ModelBox(legL2, 6, 9, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.5F, -0.1F, -3.0F);
        this.Body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, -0.1745F);
        this.legR2.cubeList.add(new ModelBox(legR2, 6, 9, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void renderStaticDisplayCase(float f) {

        this.Body.render(0.014F);

    }

    public void renderStaticFloor(float f) {
        this.Body.offsetY = 0.062F;
        this.Body.render(0.01F);
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
        //this.body.offsetY = 1.122F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.legL, this.legL2, this.legL3, this.legL4, this.legL5, this.legL6};
        AdvancedModelRenderer[] legsR = {this.legR, this.legR2, this.legR3, this.legR4, this.legR5, this.legR6};

        if (isAtBottom) {
            if (((EntityPrehistoricFloraDuslia) e).getIsMoving()) {
                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
                this.flap(legL, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
                this.flap(legR, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
                this.flap(legL2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(legR2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(legL3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(legR3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(legL4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(legR4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
                this.flap(legL5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
                this.flap(legR5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
                this.flap(legL6, 0.5F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
                this.flap(legR6, 0.5F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);
            }
        }
        else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(legL, 0.2F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(legR, 0.2F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(legL2, 0.2F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legR2, 0.2F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legL3, 0.2F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legR3, 0.2F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legL4, 0.2F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legR4, 0.2F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legL5, 0.2F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(legR5, 0.2F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.flap(legL6, 0.2F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
            this.flap(legR6, 0.2F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);
           }

        this.swing(AntennaL, 0.36F, -0.21F, false, 0, -0.11F, f2, 0.8F);
        this.swing(AntennaR, 0.36F, 0.21F, false, 0, 0.11F, f2, 0.8F);

    }
}