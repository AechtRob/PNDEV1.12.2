package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraTerataspis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelTerataspis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer legL9;
    private final AdvancedModelRenderer legL10;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer legR9;
    private final AdvancedModelRenderer legR10;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer horn2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer horn;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;

    public ModelTerataspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.base.cubeList.add(new ModelBox(base, 15, 9, -3.0F, -1.0F, -8.0F, 6, 1, 3, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 22, 8, -3.5F, -2.6F, -1.0F, 7, 1, 0, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 0, -4.0F, -1.0F, -5.0F, 8, 1, 4, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 1, 4.0F, -0.5F, -2.0F, 1, 0, 1, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 0, -5.0F, -0.5F, -2.0F, 1, 0, 1, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 23, 27, -1.5F, -2.1F, -8.7F, 3, 2, 3, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 27, 15, 0.75F, -2.1F, -5.25F, 3, 2, 3, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 11, 27, -3.75F, -2.1F, -5.25F, 3, 2, 3, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 9, -2.5F, -1.5F, -7.15F, 5, 1, 5, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 19, 5, -3.5F, -1.6F, -3.01F, 7, 1, 2, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 36, 14, -3.75F, -3.1F, -4.5F, 3, 1, 0, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 26, 0.75F, -3.1F, -4.5F, 3, 1, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(1.5F, 0.0F, -2.0F);
        this.base.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, 0.1745F);
        this.legR2.cubeList.add(new ModelBox(legR2, 12, 25, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(-1.5F, 0.0F, -2.0F);
        this.base.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, -0.1745F);
        this.legL2.cubeList.add(new ModelBox(legL2, 28, 20, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(1.5F, 0.0F, -4.0F);
        this.base.addChild(legR);
        this.setRotateAngle(legR, 0.0F, 0.0F, 0.1745F);
        this.legR.cubeList.add(new ModelBox(legR, 12, 25, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(-1.5F, 0.0F, -4.0F);
        this.base.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.0F, -0.1745F);
        this.legL.cubeList.add(new ModelBox(legL, 28, 20, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-2.0F, 0.0F, -7.5F);
        this.base.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.3491F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 56, -9.5F, 0.01F, -8.0F, 10, 0, 8, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(2.0F, 0.0F, -7.5F);
        this.base.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.3491F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 0, 48, -0.5F, 0.01F, -8.0F, 10, 0, 8, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.75F, -1.0F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 19, 27, 3.75F, 0.25F, 0.5F, 3, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 15, -4.5F, -0.26F, 0.0F, 9, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 30, -2.0F, -0.76F, -0.01F, 4, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 14, 13, -6.75F, 0.25F, 0.5F, 3, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 34, 4, -2.5F, -1.5F, 1.0F, 5, 1, 0, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 2, 2, 3.0F, -1.0F, 1.0F, 1, 1, 0, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 2, -4.0F, -1.0F, 1.0F, 1, 1, 0, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(1.5F, 0.75F, 1.0F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.0F, 0.1745F);
        this.legR3.cubeList.add(new ModelBox(legR3, 12, 25, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(-1.5F, 0.75F, 1.0F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0F, -0.1745F);
        this.legL3.cubeList.add(new ModelBox(legL3, 28, 20, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 19, 27, 3.75F, 0.25F, 0.5F, 3, 0, 1, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 15, -4.49F, -0.25F, 0.0F, 9, 1, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 30, -1.99F, -0.75F, -0.01F, 4, 1, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 14, 13, -6.75F, 0.25F, 0.5F, 3, 0, 1, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 34, 4, -2.5F, -1.5F, 1.0F, 5, 1, 0, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 2, 2, 3.0F, -1.0F, 1.0F, 1, 1, 0, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 2, -4.0F, -1.0F, 1.0F, 1, 1, 0, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(1.5F, 0.75F, 1.0F);
        this.body2.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0F, 0.1745F);
        this.legR4.cubeList.add(new ModelBox(legR4, 12, 25, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(-1.5F, 0.75F, 1.0F);
        this.body2.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0F, -0.1745F);
        this.legL4.cubeList.add(new ModelBox(legL4, 28, 20, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 19, 27, 3.75F, 0.25F, 0.5F, 3, 0, 1, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 15, -4.5F, -0.26F, 0.0F, 9, 1, 2, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 30, -2.0F, -0.76F, -0.01F, 4, 1, 2, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 14, 13, -6.75F, 0.25F, 0.5F, 3, 0, 1, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 34, 4, -2.5F, -1.5F, 1.0F, 5, 1, 0, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 2, 2, 3.0F, -1.0F, 1.0F, 1, 1, 0, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 2, -4.0F, -1.0F, 1.0F, 1, 1, 0, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(1.5F, 0.75F, 1.0F);
        this.body3.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.0F, 0.1745F);
        this.legR5.cubeList.add(new ModelBox(legR5, 12, 25, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(-1.5F, 0.75F, 1.0F);
        this.body3.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0F, -0.1745F);
        this.legL5.cubeList.add(new ModelBox(legL5, 28, 20, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 19, 27, 3.75F, 0.25F, 0.5F, 3, 0, 1, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 15, -4.49F, -0.25F, 0.0F, 9, 1, 2, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 30, -1.99F, -0.75F, -0.01F, 4, 1, 2, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 14, 13, -6.75F, 0.25F, 0.5F, 3, 0, 1, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 34, 4, -2.5F, -1.5F, 1.0F, 5, 1, 0, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 2, 2, 3.0F, -1.0F, 1.0F, 1, 1, 0, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 2, -4.0F, -1.0F, 1.0F, 1, 1, 0, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 19, 27, 3.75F, 0.25F, 0.5F, 3, 0, 1, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 15, -4.5F, -0.26F, 0.0F, 9, 1, 2, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 30, -2.0F, -0.76F, -0.01F, 4, 1, 2, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 14, 13, -6.75F, 0.25F, 0.5F, 3, 0, 1, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 34, 4, -2.5F, -1.5F, 1.0F, 5, 1, 0, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 2, 2, 3.0F, -1.0F, 1.0F, 1, 1, 0, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 2, -4.0F, -1.0F, 1.0F, 1, 1, 0, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(1.5F, 0.75F, 1.0F);
        this.body5.addChild(legR7);
        this.setRotateAngle(legR7, 0.0F, 0.0F, 0.1745F);
        this.legR7.cubeList.add(new ModelBox(legR7, 12, 25, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(-1.5F, 0.75F, 1.0F);
        this.body5.addChild(legL7);
        this.setRotateAngle(legL7, 0.0F, 0.0F, -0.1745F);
        this.legL7.cubeList.add(new ModelBox(legL7, 28, 20, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.75F, -4.0F);
        this.body5.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 2, 2, -0.5F, -2.25F, 10.25F, 1, 1, 0, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 2, 2, -1.5F, -2.25F, 9.5F, 1, 1, 0, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 2, 2, 0.5F, -2.25F, 9.5F, 1, 1, 0, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 2, 2, 3.0F, -1.75F, 6.5F, 1, 1, 0, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 2, 2, 3.0F, -1.75F, 8.75F, 1, 1, 0, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 2, 2, 2.25F, -1.75F, 10.5F, 1, 1, 0, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 2, 2, 1.25F, -1.75F, 11.75F, 1, 1, 0, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 2, 2, -2.25F, -1.75F, 11.75F, 1, 1, 0, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 2, 2, -3.25F, -1.75F, 10.5F, 1, 1, 0, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 2, 2, -4.0F, -1.75F, 6.5F, 1, 1, 0, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 2, 2, -4.0F, -1.75F, 8.75F, 1, 1, 0, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 34, 4, -2.5F, -2.25F, 7.0F, 5, 1, 0, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 34, 4, -2.5F, -2.25F, 8.5F, 5, 1, 0, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 5, -4.0F, -1.0F, 6.0F, 8, 1, 3, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 11, 18, -3.5F, -1.0F, 9.0F, 7, 1, 2, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 34, 2, -2.0F, -1.0F, 12.0F, 4, 1, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 25, 24, -3.0F, -1.0F, 11.0F, 6, 1, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 20, 0, -2.0F, -1.5F, 5.99F, 4, 1, 3, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 22, 34, -1.5F, -1.5F, 8.99F, 3, 1, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 20, 28, -1.0F, -1.5F, 9.99F, 2, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.tail.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1745F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 13, -0.5F, -0.49F, 16.25F, 3, 0, 5, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 16, 1.0F, -1.49F, 15.25F, 0, 1, 5, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 6, 21, 0.5F, -0.99F, 15.25F, 1, 1, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.tail.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.1745F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 18, -2.5F, -0.49F, 16.25F, 3, 0, 5, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 17, -1.0F, -1.49F, 15.25F, 0, 1, 5, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 21, -1.5F, -0.99F, 15.25F, 1, 1, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.6981F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 23, -12.95F, -0.49F, 5.35F, 4, 0, 2, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 35, 5, -13.2F, -1.49F, 6.35F, 4, 1, 0, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 32, -13.2F, -0.99F, 5.85F, 4, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.6981F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 9, 8.95F, -0.49F, 5.35F, 4, 0, 2, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 35, 31, 9.2F, -1.49F, 6.35F, 4, 1, 0, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 32, 9.2F, -0.99F, 5.85F, 4, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.2618F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 23, -9.45F, -0.49F, 6.6F, 4, 0, 2, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 35, 6, -9.7F, -1.49F, 7.6F, 4, 1, 0, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 32, -9.7F, -0.99F, 7.1F, 4, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.2618F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 29, 0, 5.45F, -0.49F, 6.6F, 4, 0, 2, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 8, 5.7F, -1.49F, 7.6F, 4, 1, 0, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 33, 5.7F, -0.99F, 7.1F, 4, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0436F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 13, -7.75F, -0.49F, 5.35F, 4, 0, 2, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 35, 30, -8.0F, -1.49F, 6.35F, 4, 1, 0, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 28, -8.0F, -0.99F, 5.85F, 4, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.0436F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 30, 26, 3.75F, -0.49F, 5.35F, 4, 0, 2, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 13, 4.0F, -1.49F, 6.35F, 4, 1, 0, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 33, 11, 4.0F, -0.99F, 5.85F, 4, 1, 1, 0.0F, false));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(-1.5F, 0.0F, 7.0F);
        this.tail.addChild(legL8);
        this.setRotateAngle(legL8, 0.0F, 0.0F, -0.1745F);
        this.legL8.cubeList.add(new ModelBox(legL8, 28, 20, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(-1.5F, 0.0F, 9.0F);
        this.tail.addChild(legL9);
        this.setRotateAngle(legL9, 0.0F, 0.0F, -0.1745F);
        this.legL9.cubeList.add(new ModelBox(legL9, 28, 20, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL10 = new AdvancedModelRenderer(this);
        this.legL10.setRotationPoint(-1.5F, 0.0F, 11.0F);
        this.tail.addChild(legL10);
        this.setRotateAngle(legL10, 0.0F, 0.0F, -0.1745F);
        this.legL10.cubeList.add(new ModelBox(legL10, 28, 20, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(1.5F, 0.0F, 7.0F);
        this.tail.addChild(legR8);
        this.setRotateAngle(legR8, 0.0F, 0.0F, 0.1745F);
        this.legR8.cubeList.add(new ModelBox(legR8, 12, 25, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(1.5F, 0.0F, 9.0F);
        this.tail.addChild(legR9);
        this.setRotateAngle(legR9, 0.0F, 0.0F, 0.1745F);
        this.legR9.cubeList.add(new ModelBox(legR9, 12, 25, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legR10 = new AdvancedModelRenderer(this);
        this.legR10.setRotationPoint(1.5F, 0.0F, 11.0F);
        this.tail.addChild(legR10);
        this.setRotateAngle(legR10, 0.0F, 0.0F, 0.1745F);
        this.legR10.cubeList.add(new ModelBox(legR10, 12, 25, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(-1.5F, 0.75F, 1.0F);
        this.body4.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, 0.0F, -0.1745F);
        this.legL6.cubeList.add(new ModelBox(legL6, 28, 20, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(1.5F, 0.75F, 1.0F);
        this.body4.addChild(legR6);
        this.setRotateAngle(legR6, 0.0F, 0.0F, 0.1745F);
        this.legR6.cubeList.add(new ModelBox(legR6, 12, 25, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.horn2 = new AdvancedModelRenderer(this);
        this.horn2.setRotationPoint(3.0F, -1.75F, -3.0F);
        this.base.addChild(horn2);
        this.setRotateAngle(horn2, 0.0F, 0.0F, 0.1745F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-3.0F, 1.0F, 3.0F);
        this.horn2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.7854F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 34, 3.5F, -1.11F, -8.0F, 3, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-3.0F, 1.0F, 3.0F);
        this.horn2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.6109F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 8, 34, 3.6F, -1.01F, -0.75F, 2, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-3.0F, 1.0F, 3.0F);
        this.horn2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.3491F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 23, 4, 1.5F, -0.59F, -4.1F, 5, 0, 1, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 25, 21, 1.5F, -1.09F, -6.1F, 5, 1, 2, 0.0F, false));

        this.horn = new AdvancedModelRenderer(this);
        this.horn.setRotationPoint(-3.0F, -1.75F, -3.0F);
        this.base.addChild(horn);
        this.setRotateAngle(horn, 0.0F, 0.0F, -0.1745F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(3.0F, 1.0F, 3.0F);
        this.horn.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.7854F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 35, -6.5F, -1.11F, -8.0F, 3, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(3.0F, 1.0F, 3.0F);
        this.horn.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.6109F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 16, 34, -5.6F, -1.01F, -0.75F, 2, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(3.0F, 1.0F, 3.0F);
        this.horn.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.3491F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 25, -6.5F, -0.59F, -4.1F, 5, 0, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 27, -6.5F, -1.09F, -6.1F, 5, 1, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.base.render(f5 * 0.35F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.base.offsetZ = -0.04F;
        this.base.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -0.4F;
        this.base.offsetX = -0.05F;
        this.base.offsetZ = 2.0F;
        this.base.rotateAngleY = (float)Math.toRadians(120);
        this.base.rotateAngleX = (float)Math.toRadians(0);
        this.base.rotateAngleZ = (float)Math.toRadians(0);
        this.base.scaleChildren = true;
        float scaler = 0.55F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(base, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
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
        this.base.offsetY = 0.94F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.legL, this.legL2, this.legL3, this.legL4, this.legL5, this.legL6, this.legL7, this.legL8, this.legL9, this.legL10};
        AdvancedModelRenderer[] legsR = {this.legR, this.legR2, this.legR3, this.legR4, this.legR5, this.legR6, this.legR7, this.legR8, this.legR9, this.legR10};

        if (((EntityPrehistoricFloraTerataspis) e).getIsMoving()) {
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
            this.flap(legL7, 0.5F, -0.5F, false, 6.0F, -0.5F, f2, 0.3F);
            this.flap(legR7, 0.5F, 0.5F, false, 6.0F, 0.5F, f2, 0.3F);
            this.flap(legL8, 0.5F, -0.5F, false, 7.0F, -0.5F, f2, 0.3F);
            this.flap(legR8, 0.5F, 0.5F, false, 7.0F, 0.5F, f2, 0.3F);
            this.flap(legL9, 0.5F, -0.5F, false, 8.0F, -0.5F, f2, 0.3F);
            this.flap(legR9, 0.5F, 0.5F, false, 8.0F, 0.5F, f2, 0.3F);
            this.flap(legL10, 0.5F, -0.5F, false, 9.0F, -0.5F, f2, 0.3F);
            this.flap(legR10, 0.5F, 0.5F, false, 9.0F, 0.5F, f2, 0.3F);
        }
        this.bob(base, 0.0F, 0.02F, false, f2, 1);

        this.swing(antennaL, 0.4F, -0.3F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaR, 0.4F, 0.3F, false, 0, 0.1F, f2, 0.8F);

    }
}
