package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelKerygmachela extends AdvancedModelBase {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer mouthtentacle;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer finL1;
    private final AdvancedModelRenderer finR1;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer finL2;
    private final AdvancedModelRenderer finR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer finL3;
    private final AdvancedModelRenderer finR3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer finL4;
    private final AdvancedModelRenderer finR4;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer finL5;
    private final AdvancedModelRenderer finR5;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer finL6;
    private final AdvancedModelRenderer finR6;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer finL7;
    private final AdvancedModelRenderer finR7;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer finL8;
    private final AdvancedModelRenderer finR8;
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer finL9;
    private final AdvancedModelRenderer finR9;
    private final AdvancedModelRenderer legL9;
    private final AdvancedModelRenderer legR9;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer finL10;
    private final AdvancedModelRenderer finR10;
    private final AdvancedModelRenderer legL10;
    private final AdvancedModelRenderer legR10;
    private final AdvancedModelRenderer body11;
    private final AdvancedModelRenderer finL11;
    private final AdvancedModelRenderer finR11;
    private final AdvancedModelRenderer legL11;
    private final AdvancedModelRenderer legR11;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer appendageR;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer appendageR1;
    private final AdvancedModelRenderer appendageL;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer appendageL1;

    public ModelKerygmachela() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 22.75F, 1.0F);
        this.head.cubeList.add(new ModelBox(head, 9, 0, -1.0F, -2.0F, -8.0F, 2, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -1.51F, -2.01F, -7.0F, 3, 2, 3, 0.0F, false));

        this.mouthtentacle = new AdvancedModelRenderer(this);
        this.mouthtentacle.setRotationPoint(0.0F, -0.5F, -7.0F);
        this.head.addChild(mouthtentacle);
        this.mouthtentacle.cubeList.add(new ModelBox(mouthtentacle, 0, 18, -0.5F, -0.75F, -1.5F, 1, 1, 2, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.head.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 13, -1.5F, -1.0F, 0.0F, 3, 2, 1, 0.0F, false));

        this.finL1 = new AdvancedModelRenderer(this);
        this.finL1.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.body1.addChild(finL1);
        this.finL1.cubeList.add(new ModelBox(finL1, 0, 12, -1.5F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finR1 = new AdvancedModelRenderer(this);
        this.finR1.setRotationPoint(-1.5F, 0.0F, 0.5F);
        this.body1.addChild(finR1);
        this.finR1.cubeList.add(new ModelBox(finR1, 0, 11, -2.5F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(1.25F, 0.5F, 0.5F);
        this.body1.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.0F, 0.5672F);
        this.legL1.cubeList.add(new ModelBox(legL1, 14, 15, 0.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-1.25F, 0.5F, 0.5F);
        this.body1.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, 0.0F, -0.5672F);
        this.legR1.cubeList.add(new ModelBox(legR1, 10, 15, -2.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 13, -1.49F, -1.01F, 0.0F, 3, 2, 1, 0.0F, false));

        this.finL2 = new AdvancedModelRenderer(this);
        this.finL2.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.body2.addChild(finL2);
        this.finL2.cubeList.add(new ModelBox(finL2, 0, 12, -1.0F, -0.005F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finR2 = new AdvancedModelRenderer(this);
        this.finR2.setRotationPoint(-1.5F, 0.0F, 0.5F);
        this.body2.addChild(finR2);
        this.finR2.cubeList.add(new ModelBox(finR2, 0, 11, -3.0F, -0.005F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.25F, 0.5F, 0.5F);
        this.body2.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, 0.5672F);
        this.legL2.cubeList.add(new ModelBox(legL2, 14, 15, 0.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.25F, 0.5F, 0.5F);
        this.body2.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, -0.5672F);
        this.legR2.cubeList.add(new ModelBox(legR2, 10, 15, -2.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 13, -1.5F, -1.0F, 0.0F, 3, 2, 1, 0.0F, false));

        this.finL3 = new AdvancedModelRenderer(this);
        this.finL3.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.body3.addChild(finL3);
        this.finL3.cubeList.add(new ModelBox(finL3, 0, 12, -0.75F, -0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finR3 = new AdvancedModelRenderer(this);
        this.finR3.setRotationPoint(-1.5F, 0.0F, 0.5F);
        this.body3.addChild(finR3);
        this.finR3.cubeList.add(new ModelBox(finR3, 0, 11, -3.25F, -0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.25F, 0.5F, 0.5F);
        this.body3.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0F, 0.5672F);
        this.legL3.cubeList.add(new ModelBox(legL3, 14, 15, 0.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.25F, 0.5F, 0.5F);
        this.body3.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.0F, -0.5672F);
        this.legR3.cubeList.add(new ModelBox(legR3, 10, 15, -2.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 13, -1.49F, -1.01F, 0.0F, 3, 2, 1, 0.0F, false));

        this.finL4 = new AdvancedModelRenderer(this);
        this.finL4.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.body4.addChild(finL4);
        this.finL4.cubeList.add(new ModelBox(finL4, 0, 12, -0.5F, -0.015F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finR4 = new AdvancedModelRenderer(this);
        this.finR4.setRotationPoint(-1.5F, 0.0F, 0.5F);
        this.body4.addChild(finR4);
        this.finR4.cubeList.add(new ModelBox(finR4, 0, 11, -3.5F, -0.015F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(1.25F, 0.5F, 0.5F);
        this.body4.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0F, 0.5672F);
        this.legL4.cubeList.add(new ModelBox(legL4, 14, 15, 0.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-1.25F, 0.5F, 0.5F);
        this.body4.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0F, -0.5672F);
        this.legR4.cubeList.add(new ModelBox(legR4, 10, 15, -2.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 13, -1.5F, -1.0F, 0.0F, 3, 2, 1, 0.0F, false));

        this.finL5 = new AdvancedModelRenderer(this);
        this.finL5.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.body5.addChild(finL5);
        this.finL5.cubeList.add(new ModelBox(finL5, 0, 12, -0.5F, -0.02F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finR5 = new AdvancedModelRenderer(this);
        this.finR5.setRotationPoint(-1.5F, 0.0F, 0.5F);
        this.body5.addChild(finR5);
        this.finR5.cubeList.add(new ModelBox(finR5, 0, 11, -3.5F, -0.02F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(1.25F, 0.5F, 0.5F);
        this.body5.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0F, 0.5672F);
        this.legL5.cubeList.add(new ModelBox(legL5, 14, 15, 0.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-1.25F, 0.5F, 0.5F);
        this.body5.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.0F, -0.5672F);
        this.legR5.cubeList.add(new ModelBox(legR5, 10, 15, -2.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 0, 13, -1.49F, -1.01F, 0.0F, 3, 2, 1, 0.0F, false));

        this.finL6 = new AdvancedModelRenderer(this);
        this.finL6.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.body6.addChild(finL6);
        this.finL6.cubeList.add(new ModelBox(finL6, 0, 12, -0.75F, -0.025F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finR6 = new AdvancedModelRenderer(this);
        this.finR6.setRotationPoint(-1.5F, 0.0F, 0.5F);
        this.body6.addChild(finR6);
        this.finR6.cubeList.add(new ModelBox(finR6, 0, 11, -3.25F, -0.025F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(1.25F, 0.5F, 0.5F);
        this.body6.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, 0.0F, 0.5672F);
        this.legL6.cubeList.add(new ModelBox(legL6, 14, 15, 0.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-1.25F, 0.5F, 0.5F);
        this.body6.addChild(legR6);
        this.setRotateAngle(legR6, 0.0F, 0.0F, -0.5672F);
        this.legR6.cubeList.add(new ModelBox(legR6, 10, 15, -2.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 0, 13, -1.5F, -1.0F, 0.0F, 3, 2, 1, 0.0F, false));

        this.finL7 = new AdvancedModelRenderer(this);
        this.finL7.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.body7.addChild(finL7);
        this.finL7.cubeList.add(new ModelBox(finL7, 0, 12, -0.75F, -0.03F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finR7 = new AdvancedModelRenderer(this);
        this.finR7.setRotationPoint(-1.5F, 0.0F, 0.5F);
        this.body7.addChild(finR7);
        this.finR7.cubeList.add(new ModelBox(finR7, 0, 11, -3.25F, -0.03F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(1.25F, 0.5F, 0.5F);
        this.body7.addChild(legL7);
        this.setRotateAngle(legL7, 0.0F, 0.0F, 0.5672F);
        this.legL7.cubeList.add(new ModelBox(legL7, 14, 15, 0.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-1.25F, 0.5F, 0.5F);
        this.body7.addChild(legR7);
        this.setRotateAngle(legR7, 0.0F, 0.0F, -0.5672F);
        this.legR7.cubeList.add(new ModelBox(legR7, 10, 15, -2.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 0, 13, -1.49F, -1.01F, 0.0F, 3, 2, 1, 0.0F, false));

        this.finL8 = new AdvancedModelRenderer(this);
        this.finL8.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.body8.addChild(finL8);
        this.finL8.cubeList.add(new ModelBox(finL8, 0, 12, -1.0F, -0.035F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finR8 = new AdvancedModelRenderer(this);
        this.finR8.setRotationPoint(-1.5F, 0.0F, 0.5F);
        this.body8.addChild(finR8);
        this.finR8.cubeList.add(new ModelBox(finR8, 0, 11, -3.0F, -0.035F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(1.25F, 0.5F, 0.5F);
        this.body8.addChild(legL8);
        this.setRotateAngle(legL8, 0.0F, 0.0F, 0.5672F);
        this.legL8.cubeList.add(new ModelBox(legL8, 14, 15, 0.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(-1.25F, 0.5F, 0.5F);
        this.body8.addChild(legR8);
        this.setRotateAngle(legR8, 0.0F, 0.0F, -0.5672F);
        this.legR8.cubeList.add(new ModelBox(legR8, 10, 15, -2.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body8.addChild(body9);
        this.body9.cubeList.add(new ModelBox(body9, 0, 13, -1.5F, -1.0F, 0.0F, 3, 2, 1, 0.0F, false));

        this.finL9 = new AdvancedModelRenderer(this);
        this.finL9.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.body9.addChild(finL9);
        this.finL9.cubeList.add(new ModelBox(finL9, 0, 12, -1.25F, -0.04F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finR9 = new AdvancedModelRenderer(this);
        this.finR9.setRotationPoint(-1.5F, 0.0F, 0.5F);
        this.body9.addChild(finR9);
        this.finR9.cubeList.add(new ModelBox(finR9, 0, 11, -2.75F, -0.04F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(1.25F, 0.5F, 0.5F);
        this.body9.addChild(legL9);
        this.setRotateAngle(legL9, 0.0F, 0.0F, 0.5672F);
        this.legL9.cubeList.add(new ModelBox(legL9, 14, 15, 0.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(-1.25F, 0.5F, 0.5F);
        this.body9.addChild(legR9);
        this.setRotateAngle(legR9, 0.0F, 0.0F, -0.5672F);
        this.legR9.cubeList.add(new ModelBox(legR9, 10, 15, -2.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body9.addChild(body10);
        this.body10.cubeList.add(new ModelBox(body10, 0, 13, -1.49F, -1.01F, 0.0F, 3, 2, 1, 0.0F, false));

        this.finL10 = new AdvancedModelRenderer(this);
        this.finL10.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.body10.addChild(finL10);
        this.finL10.cubeList.add(new ModelBox(finL10, 0, 12, -1.5F, -0.045F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finR10 = new AdvancedModelRenderer(this);
        this.finR10.setRotationPoint(-1.5F, 0.0F, 0.5F);
        this.body10.addChild(finR10);
        this.finR10.cubeList.add(new ModelBox(finR10, 0, 11, -2.5F, -0.045F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL10 = new AdvancedModelRenderer(this);
        this.legL10.setRotationPoint(1.25F, 0.5F, 0.5F);
        this.body10.addChild(legL10);
        this.setRotateAngle(legL10, 0.0F, 0.0F, 0.5672F);
        this.legL10.cubeList.add(new ModelBox(legL10, 14, 15, 0.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legR10 = new AdvancedModelRenderer(this);
        this.legR10.setRotationPoint(-1.25F, 0.5F, 0.5F);
        this.body10.addChild(legR10);
        this.setRotateAngle(legR10, 0.0F, 0.0F, -0.5672F);
        this.legR10.cubeList.add(new ModelBox(legR10, 10, 15, -2.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.body11 = new AdvancedModelRenderer(this);
        this.body11.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body10.addChild(body11);
        this.body11.cubeList.add(new ModelBox(body11, 0, 13, -1.5F, -1.0F, 0.0F, 3, 2, 1, 0.0F, false));

        this.finL11 = new AdvancedModelRenderer(this);
        this.finL11.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.body11.addChild(finL11);
        this.finL11.cubeList.add(new ModelBox(finL11, 0, 12, -1.75F, -0.05F, -0.5F, 4, 0, 1, 0.0F, false));

        this.finR11 = new AdvancedModelRenderer(this);
        this.finR11.setRotationPoint(-1.5F, 0.0F, 0.5F);
        this.body11.addChild(finR11);
        this.finR11.cubeList.add(new ModelBox(finR11, 0, 11, -2.25F, -0.05F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL11 = new AdvancedModelRenderer(this);
        this.legL11.setRotationPoint(1.25F, 0.5F, 0.5F);
        this.body11.addChild(legL11);
        this.setRotateAngle(legL11, 0.0F, 0.0F, 0.5672F);
        this.legL11.cubeList.add(new ModelBox(legL11, 14, 15, 0.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legR11 = new AdvancedModelRenderer(this);
        this.legR11.setRotationPoint(-1.25F, 0.5F, 0.5F);
        this.body11.addChild(legR11);
        this.setRotateAngle(legR11, 0.0F, 0.0F, -0.5672F);
        this.legR11.cubeList.add(new ModelBox(legR11, 10, 15, -2.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body11.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, -0.5F, 0.0F, 0.0F, 1, 0, 15, 0.0F, false));

        this.appendageR = new AdvancedModelRenderer(this);
        this.appendageR.setRotationPoint(-1.5F, -1.25F, -5.75F);
        this.head.addChild(appendageR);
        this.setRotateAngle(appendageR, 0.0F, -0.3491F, 0.0F);
        this.appendageR.cubeList.add(new ModelBox(appendageR, 0, 5, -3.5F, -0.5F, -1.0F, 4, 1, 2, 0.0F, false));
        this.appendageR.cubeList.add(new ModelBox(appendageR, 10, 13, -4.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 0.0F, -1.0F);
        this.appendageR.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.3491F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 0, 0.0F, -0.25F, -2.0F, 0, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, 0.0F, -1.0F);
        this.appendageR.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3491F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 9, 9, 0.0F, -0.25F, -2.0F, 0, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.5F, 0.0F, -1.0F);
        this.appendageR.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.3491F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 3, 0.0F, -0.25F, -2.0F, 0, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.5F, 0.0F, -1.0F);
        this.appendageR.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.3491F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 4, 0.0F, -0.25F, -2.0F, 0, 1, 2, 0.0F, false));

        this.appendageR1 = new AdvancedModelRenderer(this);
        this.appendageR1.setRotationPoint(-4.5F, 0.0F, -0.25F);
        this.appendageR.addChild(appendageR1);
        this.setRotateAngle(appendageR1, 0.0F, -0.2618F, 0.0F);
        this.appendageR1.cubeList.add(new ModelBox(appendageR1, 13, 0, -8.0F, 0.0F, -3.5F, 8, 0, 4, 0.0F, false));

        this.appendageL = new AdvancedModelRenderer(this);
        this.appendageL.setRotationPoint(1.5F, -1.25F, -5.75F);
        this.head.addChild(appendageL);
        this.setRotateAngle(appendageL, 0.0F, 0.3491F, 0.0F);
        this.appendageL.cubeList.add(new ModelBox(appendageL, 0, 8, -0.5F, -0.5F, -1.0F, 4, 1, 2, 0.0F, false));
        this.appendageL.cubeList.add(new ModelBox(appendageL, 7, 15, 3.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.0F, -1.0F);
        this.appendageL.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.3491F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 7, 11, 0.0F, -0.25F, -2.0F, 0, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.5F, 0.0F, -1.0F);
        this.appendageL.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.3491F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 10, 0.0F, -0.25F, -2.0F, 0, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.5F, 0.0F, -1.0F);
        this.appendageL.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.3491F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 7, 0.0F, -0.25F, -2.0F, 0, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(3.5F, 0.0F, -1.0F);
        this.appendageL.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.3491F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 6, 0.0F, -0.25F, -2.0F, 0, 1, 2, 0.0F, false));

        this.appendageL1 = new AdvancedModelRenderer(this);
        this.appendageL1.setRotationPoint(4.5F, 0.0F, -0.25F);
        this.appendageL.addChild(appendageL1);
        this.setRotateAngle(appendageL1, 0.0F, 0.2618F, 0.0F);
        this.appendageL1.cubeList.add(new ModelBox(appendageL1, 13, 4, 0.0F, 0.0F, -3.5F, 8, 0, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5 * 0.213F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.head.render(0.01F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        this.head.offsetY = 1.18F;

        float speed = 0.4F * 0.2F;
        float tailVdegree = 0.25F * 0.2F;
        float tailHdegree = 0.0F * 0.2F;
        float tailSwing = 0.75F * 0.2F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.25F * 0.2F;
            tailVdegree = 0F;
            tailHdegree = 0.3F * 0.2F;
            tailSwing = 0.6F * 0.2F;
        }
        if (!e.isInWater()) {
            speed = 0.7F * 0.2F;
        }

        AdvancedModelRenderer[] legsL = {this.legL1, this.legL2, this.legL3, this.legL4, this.legL5, this.legL6, this.legL7, this.legL8, this.legL9, this.legL10, this.legL11};
        AdvancedModelRenderer[] legsR = {this.legR1, this.legR2, this.legR3, this.legR4, this.legR5, this.legR6, this.legR7, this.legR8, this.legR9, this.legR10, this.legR11};
        AdvancedModelRenderer[] bodyF = {this.body4,this.body5,this.body6,this.body7};
        AdvancedModelRenderer[] fishTail = {this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.tail};
        AdvancedModelRenderer[] pincerL = {this.appendageL, this.appendageL1};
        AdvancedModelRenderer[] pincerR = {this.appendageR, this.appendageR1};

        this.chainWave(fishTail, speed, tailVdegree * 0.3f, -0.5F, f2, 0.5F);
        this.chainSwing(fishTail, speed, tailHdegree, -2.5, f2, tailSwing);

        this.chainSwing(pincerL, speed * 3F, -0.1F, 0.5F, f2, 0.1F);
        this.chainSwing(pincerR, speed *  3F, 0.1F, 0.5F, f2, 0.1F);
        this.swing(appendageL, speed * 3F, -0.7F, false, 0, 1.15F, f2, 0.5F);
        this.swing(appendageR, speed * 3F, 0.7F, false, 0, -1.15F, f2, 0.5F);

        float feedModifier = 1;
        if (f3 == 0.0) {
            feedModifier = 0.15F;
        }
        float degreeFin = 0.285F * feedModifier;
        this.flap(finL11, 0.5F, -degreeFin, false, 2.0F, -0.4F, f2, 0.7F);
        this.flap(finR11, 0.5F, degreeFin, false, 2.0F, 0.4F, f2, 0.7F);
        this.flap(finL10, 0.5F, -degreeFin, false, 2.5F, -0.4F, f2, 0.7F);
        this.flap(finR10, 0.5F, degreeFin, false, 2.5F, 0.4F, f2, 0.7F);
        this.flap(finL9, 0.5F, -degreeFin, false, 3.0F, -0.4F, f2, 0.7F);
        this.flap(finR9, 0.5F, degreeFin, false, 3.0F, 0.4F, f2, 0.7F);
        this.flap(finL8, 0.5F, -degreeFin, false, 3.5F, -0.4F, f2, 0.7F);
        this.flap(finR8, 0.5F, degreeFin, false, 3.5F, 0.4F, f2, 0.7F);
        this.flap(finL7, 0.5F, -degreeFin, false, 4.0F, -0.4F, f2, 0.7F);
        this.flap(finR7, 0.5F, degreeFin, false, 4.0F, 0.4F, f2, 0.7F);
        this.flap(finL6, 0.5F, -degreeFin, false, 4.5F, -0.4F, f2, 0.7F);
        this.flap(finR6, 0.5F, degreeFin, false, 4.5F, 0.4F, f2, 0.7F);
        this.flap(finL5, 0.5F, -degreeFin, false, 5.0F, -0.4F, f2, 0.7F);
        this.flap(finR5, 0.5F, degreeFin, false, 5.0F, 0.4F, f2, 0.7F);
        this.flap(finL4, 0.5F, -degreeFin, false, 5.5F, -0.4F, f2, 0.7F);
        this.flap(finR4, 0.5F, degreeFin, false, 5.5F, 0.4F, f2, 0.7F);
        this.flap(finL3, 0.5F, -degreeFin, false, 6.0F, -0.4F, f2, 0.7F);
        this.flap(finR3, 0.5F, degreeFin, false, 6.0F, 0.4F, f2, 0.7F);
        this.flap(finL2, 0.5F, -degreeFin, false, 6.5F, -0.4F, f2, 0.7F);
        this.flap(finR2, 0.5F, degreeFin, false, 6.5F, 0.4F, f2, 0.7F);
        this.flap(finL1, 0.5F, -degreeFin, false, 7.0F, -0.4F, f2, 0.7F);
        this.flap(finR1, 0.5F, degreeFin, false, 7.0F, 0.4F, f2, 0.7F);

        if (isAtBottom && e.isInWater()) {
            if (f3 != 0.0) {
                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
                this.flap(legL1, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
                this.flap(legR1, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
                this.flap(legL2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(legR2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(legL3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(legR3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(legL4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(legR4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
                this.flap(legL5, 0.5F, -0.5F, false, 42.0F, -0.5F, f2, 0.3F);
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
                this.flap(legL11, 0.5F, -0.5F, false, 10.0F, -0.5F, f2, 0.3F);
                this.flap(legR11, 0.5F, 0.5F, false, 10.0F, 0.5F, f2, 0.3F);

                this.swing(legL1, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
                this.swing(legR1, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
                this.swing(legL2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.swing(legR2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.swing(legL3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.swing(legR3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.swing(legL4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.swing(legR4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
                this.swing(legL5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
                this.swing(legR5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
                this.swing(legL6, 0.5F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
                this.swing(legR6, 0.5F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);
                this.swing(legL7, 0.5F, -0.5F, false, 6.0F, -0.5F, f2, 0.3F);
                this.swing(legR7, 0.5F, 0.5F, false, 6.0F, 0.5F, f2, 0.3F);
                this.swing(legL8, 0.5F, -0.5F, false, 7.0F, -0.5F, f2, 0.3F);
                this.swing(legR8, 0.5F, 0.5F, false, 7.0F, 0.5F, f2, 0.3F);
                this.swing(legL9, 0.5F, -0.5F, false, 8.0F, -0.5F, f2, 0.3F);
                this.swing(legR9, 0.5F, 0.5F, false, 8.0F, 0.5F, f2, 0.3F);
                this.swing(legL10, 0.5F, -0.5F, false, 9.0F, -0.5F, f2, 0.3F);
                this.swing(legR10, 0.5F, 0.5F, false, 9.0F, 0.5F, f2, 0.3F);
                this.swing(legL11, 0.5F, -0.5F, false, 10.0F, -0.5F, f2, 0.3F);
                this.swing(legR11, 0.5F, 0.5F, false, 10.0F, 0.5F, f2, 0.3F);
                
                //this.walk(body6, 0.8F, -0.015f, false, 2, 0.2F, f2, 1F);
                this.chainWave(bodyF, 0.8F, 0.03f, 0.5, f2, 0.3F);
            }
            this.chainSwing(bodyF, 0.1F, 0.1F, -3, f2, 1.0F);
        }
        else if (e.isInWater()) {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(legL1, 0.2F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(legR1, 0.2F, 0.5F, false, 0, 0.5F, f2, 0.3F);
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
            this.flap(legL7, 0.2F, -0.5F, false, 6.0F, -0.5F, f2, 0.3F);
            this.flap(legR7, 0.2F, 0.5F, false, 6.0F, 0.5F, f2, 0.3F);
            this.flap(legL8, 0.2F, -0.5F, false, 7.0F, -0.5F, f2, 0.3F);
            this.flap(legR8, 0.2F, 0.5F, false, 7.0F, 0.5F, f2, 0.3F);
            this.flap(legL9, 0.2F, -0.5F, false, 8.0F, -0.5F, f2, 0.3F);
            this.flap(legR9, 0.2F, 0.5F, false, 8.0F, 0.5F, f2, 0.3F);
            this.flap(legL10, 0.2F, -0.5F, false, 9.0F, -0.5F, f2, 0.3F);
            this.flap(legR10, 0.2F, 0.5F, false, 9.0F, 0.5F, f2, 0.3F);
            this.flap(legL11, 0.2F, -0.5F, false, 10.0F, -0.5F, f2, 0.3F);
            this.flap(legR11, 0.2F, 0.5F, false, 10.0F, 0.5F, f2, 0.3F);

            this.swing(legL1, 0.2F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.swing(legR1, 0.2F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.swing(legL2, 0.2F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.swing(legR2, 0.2F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.swing(legL3, 0.2F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.swing(legR3, 0.2F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.swing(legL4, 0.2F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.swing(legR4, 0.2F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.swing(legL5, 0.2F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.swing(legR5, 0.2F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.swing(legL6, 0.2F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
            this.swing(legR6, 0.2F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);
            this.swing(legL7, 0.2F, -0.5F, false, 6.0F, -0.5F, f2, 0.3F);
            this.swing(legR7, 0.2F, 0.5F, false, 6.0F, 0.5F, f2, 0.3F);
            this.swing(legL8, 0.2F, -0.5F, false, 7.0F, -0.5F, f2, 0.3F);
            this.swing(legR8, 0.2F, 0.5F, false, 7.0F, 0.5F, f2, 0.3F);
            this.swing(legL9, 0.2F, -0.5F, false, 8.0F, -0.5F, f2, 0.3F);
            this.swing(legR9, 0.2F, 0.5F, false, 8.0F, 0.5F, f2, 0.3F);
            this.swing(legL10, 0.2F, -0.5F, false, 9.0F, -0.5F, f2, 0.3F);
            this.swing(legR10, 0.2F, 0.5F, false, 9.0F, 0.5F, f2, 0.3F);
            this.swing(legL11, 0.2F, -0.5F, false, 10.0F, -0.5F, f2, 0.3F);
            this.swing(legR11, 0.2F, 0.5F, false, 10.0F, 0.5F, f2, 0.3F);

            this.chainSwing(bodyF, 0.2F, 0.1F, -1, f2, 0.5F);
            this.chainWave(bodyF, 0.5F, 0.08f, -0.25, f2, 0.65F);
            //this.bob(head, 0.2F, 0.2F, false, f2, 1);
        }

        if (!e.isInWater()) {
            //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
            this.head.offsetY = 1.2F;
            this.bob(head, -speed * 3F, 2F, false, f2, 1);
            this.chainWave(fishTail, speed * 4F, tailHdegree * 3F, -3, f2, 1);
            this.chainSwing(fishTail, speed * 4F, tailVdegree * 3F, -3, f2, 1);
        }

    }
}
