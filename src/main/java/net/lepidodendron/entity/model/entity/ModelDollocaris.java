package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelDollocaris extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer gillbase;
    private final AdvancedModelRenderer gillL1;
    private final AdvancedModelRenderer gillR1;
    private final AdvancedModelRenderer gillL2;
    private final AdvancedModelRenderer gillR2;
    private final AdvancedModelRenderer gillR3;
    private final AdvancedModelRenderer gillR4;
    private final AdvancedModelRenderer gillR5;
    private final AdvancedModelRenderer gillR6;
    private final AdvancedModelRenderer gillR7;
    private final AdvancedModelRenderer gillR8;
    private final AdvancedModelRenderer gillR9;
    private final AdvancedModelRenderer gillL3;
    private final AdvancedModelRenderer gillL4;
    private final AdvancedModelRenderer gillL5;
    private final AdvancedModelRenderer gillL6;
    private final AdvancedModelRenderer gillL7;
    private final AdvancedModelRenderer gillL8;
    private final AdvancedModelRenderer gillL9;
    private final AdvancedModelRenderer gillL10;
    private final AdvancedModelRenderer gillR10;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legLs3;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legRs3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legLs4;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legRs4;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legLs5;
    private final AdvancedModelRenderer legLss5;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legRs5;
    private final AdvancedModelRenderer legRss5;

    public ModelDollocaris() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(1.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -11.5F, -5.25F, 3, 4, 8, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 12, -3.5F, -12.4F, -3.95F, 5, 6, 5, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 26, -3.5F, -13.025F, -2.475F, 5, 5, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.6545F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 39, -1.5F, -13.1F, 1.15F, 3, 1, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 15, -0.5F, -13.1F, 0.15F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 23, -0.5F, -11.65F, 3.85F, 1, 1, 2, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 0, -1.0F, -11.65F, -0.15F, 2, 2, 4, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, 0.0F, 0.25F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 5, -1.5F, -8.7F, -5.55F, 3, 2, 7, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, -9.95F, -8.25F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3927F, -0.1745F, -0.0698F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 6, 0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -9.95F, -8.25F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3927F, 0.1745F, 0.0698F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 14, -2.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 18, -3.0F, -12.4F, -1.1F, 4, 6, 5, 0.0F, false));

        this.gillbase = new AdvancedModelRenderer(this);
        this.gillbase.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.body.addChild(gillbase);
        this.setRotateAngle(gillbase, -0.9163F, 0.0F, 0.0F);
        this.gillbase.cubeList.add(new ModelBox(gillbase, 14, 0, -1.0F, -9.75F, -5.75F, 2, 4, 2, 0.0F, false));

        this.gillL1 = new AdvancedModelRenderer(this);
        this.gillL1.setRotationPoint(0.0F, -5.5F, -4.05F);
        this.gillbase.addChild(gillL1);
        this.setRotateAngle(gillL1, 1.3963F, 0.0873F, -0.3927F);
        this.gillL1.cubeList.add(new ModelBox(gillL1, 4, 0, 0.0F, -0.75F, 0.0F, 1, 2, 0, 0.0F, false));

        this.gillR1 = new AdvancedModelRenderer(this);
        this.gillR1.setRotationPoint(0.0F, -5.5F, -4.05F);
        this.gillbase.addChild(gillR1);
        this.setRotateAngle(gillR1, 1.3963F, -0.0873F, 0.3927F);
        this.gillR1.cubeList.add(new ModelBox(gillR1, 4, 0, -1.0F, -0.75F, 0.0F, 1, 2, 0, 0.0F, true));

        this.gillL2 = new AdvancedModelRenderer(this);
        this.gillL2.setRotationPoint(0.0F, -6.0F, -3.8F);
        this.gillbase.addChild(gillL2);
        this.setRotateAngle(gillL2, 1.3963F, 0.0873F, -0.3927F);
        this.gillL2.cubeList.add(new ModelBox(gillL2, 19, 6, 0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.gillR2 = new AdvancedModelRenderer(this);
        this.gillR2.setRotationPoint(0.0F, -6.0F, -3.8F);
        this.gillbase.addChild(gillR2);
        this.setRotateAngle(gillR2, 1.3963F, -0.0873F, 0.3927F);
        this.gillR2.cubeList.add(new ModelBox(gillR2, 19, 6, -1.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.gillR3 = new AdvancedModelRenderer(this);
        this.gillR3.setRotationPoint(0.0F, -6.5F, -3.8F);
        this.gillbase.addChild(gillR3);
        this.setRotateAngle(gillR3, 1.3963F, -0.0873F, 0.3927F);
        this.gillR3.cubeList.add(new ModelBox(gillR3, 19, 6, -1.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.gillR4 = new AdvancedModelRenderer(this);
        this.gillR4.setRotationPoint(0.0F, -7.0F, -3.8F);
        this.gillbase.addChild(gillR4);
        this.setRotateAngle(gillR4, 1.3963F, -0.0873F, 0.3927F);
        this.gillR4.cubeList.add(new ModelBox(gillR4, 19, 6, -1.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.gillR5 = new AdvancedModelRenderer(this);
        this.gillR5.setRotationPoint(0.0F, -7.5F, -3.8F);
        this.gillbase.addChild(gillR5);
        this.setRotateAngle(gillR5, 1.3963F, -0.0873F, 0.3927F);
        this.gillR5.cubeList.add(new ModelBox(gillR5, 19, 6, -1.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.gillR6 = new AdvancedModelRenderer(this);
        this.gillR6.setRotationPoint(0.0F, -8.0F, -3.8F);
        this.gillbase.addChild(gillR6);
        this.setRotateAngle(gillR6, 1.3963F, -0.0873F, 0.3927F);
        this.gillR6.cubeList.add(new ModelBox(gillR6, 19, 6, -1.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.gillR7 = new AdvancedModelRenderer(this);
        this.gillR7.setRotationPoint(0.0F, -8.5F, -3.8F);
        this.gillbase.addChild(gillR7);
        this.setRotateAngle(gillR7, 1.3963F, -0.0873F, 0.3927F);
        this.gillR7.cubeList.add(new ModelBox(gillR7, 19, 6, -1.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.gillR8 = new AdvancedModelRenderer(this);
        this.gillR8.setRotationPoint(0.0F, -9.0F, -3.8F);
        this.gillbase.addChild(gillR8);
        this.setRotateAngle(gillR8, 1.3963F, -0.0873F, 0.3927F);
        this.gillR8.cubeList.add(new ModelBox(gillR8, 19, 6, -1.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.gillR9 = new AdvancedModelRenderer(this);
        this.gillR9.setRotationPoint(0.0F, -9.5F, -3.8F);
        this.gillbase.addChild(gillR9);
        this.setRotateAngle(gillR9, 1.3963F, -0.0873F, 0.3927F);
        this.gillR9.cubeList.add(new ModelBox(gillR9, 19, 6, -1.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.gillL3 = new AdvancedModelRenderer(this);
        this.gillL3.setRotationPoint(0.0F, -6.5F, -3.8F);
        this.gillbase.addChild(gillL3);
        this.setRotateAngle(gillL3, 1.3963F, 0.0873F, -0.3927F);
        this.gillL3.cubeList.add(new ModelBox(gillL3, 14, 1, 0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.gillL4 = new AdvancedModelRenderer(this);
        this.gillL4.setRotationPoint(0.0F, -7.0F, -3.8F);
        this.gillbase.addChild(gillL4);
        this.setRotateAngle(gillL4, 1.3963F, 0.0873F, -0.3927F);
        this.gillL4.cubeList.add(new ModelBox(gillL4, 14, 0, 0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.gillL5 = new AdvancedModelRenderer(this);
        this.gillL5.setRotationPoint(0.0F, -7.5F, -3.8F);
        this.gillbase.addChild(gillL5);
        this.setRotateAngle(gillL5, 1.3963F, 0.0873F, -0.3927F);
        this.gillL5.cubeList.add(new ModelBox(gillL5, 3, 12, 0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.gillL6 = new AdvancedModelRenderer(this);
        this.gillL6.setRotationPoint(0.0F, -8.0F, -3.8F);
        this.gillbase.addChild(gillL6);
        this.setRotateAngle(gillL6, 1.3963F, 0.0873F, -0.3927F);
        this.gillL6.cubeList.add(new ModelBox(gillL6, 6, 7, 0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.gillL7 = new AdvancedModelRenderer(this);
        this.gillL7.setRotationPoint(0.0F, -8.5F, -3.8F);
        this.gillbase.addChild(gillL7);
        this.setRotateAngle(gillL7, 1.3963F, 0.0873F, -0.3927F);
        this.gillL7.cubeList.add(new ModelBox(gillL7, 6, 6, 0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.gillL8 = new AdvancedModelRenderer(this);
        this.gillL8.setRotationPoint(0.0F, -9.0F, -3.8F);
        this.gillbase.addChild(gillL8);
        this.setRotateAngle(gillL8, 1.3963F, 0.0873F, -0.3927F);
        this.gillL8.cubeList.add(new ModelBox(gillL8, 6, 5, 0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.gillL9 = new AdvancedModelRenderer(this);
        this.gillL9.setRotationPoint(0.0F, -9.5F, -3.8F);
        this.gillbase.addChild(gillL9);
        this.setRotateAngle(gillL9, 1.3963F, 0.0873F, -0.3927F);
        this.gillL9.cubeList.add(new ModelBox(gillL9, 6, 4, 0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.gillL10 = new AdvancedModelRenderer(this);
        this.gillL10.setRotationPoint(0.0F, -10.0F, -4.05F);
        this.gillbase.addChild(gillL10);
        this.setRotateAngle(gillL10, 1.3963F, 0.0873F, -0.3927F);
        this.gillL10.cubeList.add(new ModelBox(gillL10, 0, 0, 0.0F, -0.75F, 0.0F, 1, 2, 0, 0.0F, false));

        this.gillR10 = new AdvancedModelRenderer(this);
        this.gillR10.setRotationPoint(0.0F, -10.0F, -4.05F);
        this.gillbase.addChild(gillR10);
        this.setRotateAngle(gillR10, 1.3963F, -0.0873F, 0.3927F);
        this.gillR10.cubeList.add(new ModelBox(gillR10, 0, 0, -1.0F, -0.75F, 0.0F, 1, 2, 0, 0.0F, true));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(-0.25F, -7.5F, -5.0F);
        this.body.addChild(legL1);
        this.setRotateAngle(legL1, -0.6981F, -0.2618F, 0.0F);
        this.legL1.cubeList.add(new ModelBox(legL1, 6, 2, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-1.75F, -7.5F, -5.0F);
        this.body.addChild(legR1);
        this.setRotateAngle(legR1, -0.6981F, 0.2618F, 0.0F);
        this.legR1.cubeList.add(new ModelBox(legR1, 6, 2, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(-0.25F, -7.5F, -4.15F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, -0.9163F, -0.3054F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 6, 0, -0.5F, 0.25F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.75F, -7.5F, -4.15F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, -0.9163F, 0.3054F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 6, 0, -0.5F, 0.25F, 0.0F, 1, 2, 0, 0.0F, true));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.5F, -7.5F, -3.15F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.8727F, 0.0436F, -0.3491F);
        this.legL3.cubeList.add(new ModelBox(legL3, 6, 23, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.legLs3 = new AdvancedModelRenderer(this);
        this.legLs3.setRotationPoint(0.1F, 2.0F, 0.05F);
        this.legL3.addChild(legLs3);
        this.setRotateAngle(legLs3, -2.138F, 0.0F, 0.0F);
        this.legLs3.cubeList.add(new ModelBox(legLs3, 15, 12, 0.0F, 0.0F, -1.5F, 0, 3, 2, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-2.5F, -7.5F, -3.15F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.8727F, -0.0436F, 0.3491F);
        this.legR3.cubeList.add(new ModelBox(legR3, 6, 23, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, true));

        this.legRs3 = new AdvancedModelRenderer(this);
        this.legRs3.setRotationPoint(-0.1F, 2.0F, 0.05F);
        this.legR3.addChild(legRs3);
        this.setRotateAngle(legRs3, -2.138F, 0.0F, 0.0F);
        this.legRs3.cubeList.add(new ModelBox(legRs3, 15, 12, 0.0F, 0.0F, -1.5F, 0, 3, 2, 0.0F, true));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(-0.1F, -7.5F, -2.15F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, 0.6109F, 0.0873F, -0.2618F);
        this.legL4.cubeList.add(new ModelBox(legL4, 22, 0, -0.5F, -0.5F, -0.5F, 1, 4, 1, 0.0F, false));

        this.legLs4 = new AdvancedModelRenderer(this);
        this.legLs4.setRotationPoint(0.0F, 3.5F, 0.05F);
        this.legL4.addChild(legLs4);
        this.setRotateAngle(legLs4, -2.138F, 0.0F, 0.0F);
        this.legLs4.cubeList.add(new ModelBox(legLs4, 20, 27, 0.0F, 0.0F, -1.5F, 0, 6, 2, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-1.9F, -7.5F, -2.15F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, 0.6109F, -0.0873F, 0.2618F);
        this.legR4.cubeList.add(new ModelBox(legR4, 22, 0, -0.5F, -0.5F, -0.5F, 1, 4, 1, 0.0F, true));

        this.legRs4 = new AdvancedModelRenderer(this);
        this.legRs4.setRotationPoint(0.0F, 3.5F, 0.05F);
        this.legR4.addChild(legRs4);
        this.setRotateAngle(legRs4, -2.138F, 0.0F, 0.0F);
        this.legRs4.cubeList.add(new ModelBox(legRs4, 20, 27, 0.0F, 0.0F, -1.5F, 0, 6, 2, 0.0F, true));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(-0.5F, -7.5F, -1.15F);
        this.body.addChild(legL5);
        this.setRotateAngle(legL5, 0.7854F, 0.0873F, -0.0873F);
        this.legL5.cubeList.add(new ModelBox(legL5, 0, 0, -0.5F, -1.0F, -1.25F, 1, 6, 2, 0.0F, false));

        this.legLs5 = new AdvancedModelRenderer(this);
        this.legLs5.setRotationPoint(0.5F, 5.0F, 0.05F);
        this.legL5.addChild(legLs5);
        this.setRotateAngle(legLs5, -1.8762F, 0.0F, 0.0F);
        this.legLs5.cubeList.add(new ModelBox(legLs5, 0, 12, -1.0F, 0.0F, -0.5F, 1, 4, 1, -0.01F, false));

        this.legLss5 = new AdvancedModelRenderer(this);
        this.legLss5.setRotationPoint(-0.5F, 4.0F, 0.0F);
        this.legLs5.addChild(legLss5);
        this.setRotateAngle(legLss5, -0.5236F, 0.0F, 0.0F);
        this.legLss5.cubeList.add(new ModelBox(legLss5, 16, 27, 0.0F, -0.25F, -1.5F, 0, 6, 2, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-1.5F, -7.5F, -1.15F);
        this.body.addChild(legR5);
        this.setRotateAngle(legR5, 0.7854F, -0.0873F, 0.0873F);
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 0, -0.5F, -1.0F, -1.25F, 1, 6, 2, 0.0F, true));

        this.legRs5 = new AdvancedModelRenderer(this);
        this.legRs5.setRotationPoint(-0.5F, 5.0F, 0.05F);
        this.legR5.addChild(legRs5);
        this.setRotateAngle(legRs5, -1.8762F, 0.0F, 0.0F);
        this.legRs5.cubeList.add(new ModelBox(legRs5, 0, 12, 0.0F, 0.0F, -0.5F, 1, 4, 1, -0.01F, true));

        this.legRss5 = new AdvancedModelRenderer(this);
        this.legRss5.setRotationPoint(0.5F, 4.0F, 0.0F);
        this.legRs5.addChild(legRss5);
        this.setRotateAngle(legRss5, -0.5236F, 0.0F, 0.0F);
        this.legRss5.cubeList.add(new ModelBox(legRss5, 16, 27, 0.0F, -0.25F, -1.5F, 0, 6, 2, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 );
    }
    public void renderStaticDisplayCase(float f) {
        this.body.offsetZ = -0.02F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(0);
        this.body.offsetZ = 0.03F;
        this.body.offsetY = -0.2F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }


    @Override
    public void renderStaticBook(float f) {

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
        //this.body.offsetY = 1.1F;


        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {


            float speedLeg = 0.5F;
            float degreeLeg = 0.2F;
            if(f3 == 0.0F) {//not moving
                this.swing(legL4, speedLeg, -degreeLeg, false, 1.5F, -0.5F, f2, 0.7F);
                this.swing(legR4, speedLeg, degreeLeg, false, 1.5F, 0.5F, f2, 0.7F);
                this.swing(legL5, speedLeg, -degreeLeg, false, 2.0F, -0.5F, f2, 0.7F);
                this.swing(legR5, speedLeg, degreeLeg, false, 2.0F, 0.5F, f2, 0.7F);

            } else {


                this.legL4.rotateAngleX = -(float)Math.toRadians(-52.5);
                this.legLs4.rotateAngleX = -(float)Math.toRadians(132.5);
                this.legR4.rotateAngleX = -(float)Math.toRadians(-52.5);
                this.legRs4.rotateAngleX = -(float)Math.toRadians(132.5);
                this.legR5.rotateAngleX = -(float)Math.toRadians(-70);
                this.legRs5.rotateAngleX = -(float)Math.toRadians(132.5);
                this.legRss5.rotateAngleX = -(float)Math.toRadians(40);
                this.legL5.rotateAngleX = -(float)Math.toRadians(-70);
                this.legLs5.rotateAngleX = -(float)Math.toRadians(132.5);
                this.legLss5.rotateAngleX = -(float)Math.toRadians(40);

                this.swing(legL4, speedLeg, degreeLeg*0.5F, false, 1.5F, -0.5F, f2, 0.7F);
                this.swing(legR4, speedLeg, degreeLeg*0.5F, false, 1.5F, 0.5F, f2, 0.7F);
                this.swing(legL5, speedLeg, degreeLeg*0.5F, false, 2.0F, -0.5F, f2, 0.7F);
                this.swing(legR5, speedLeg, degreeLeg*0.5F, false, 2.0F, 0.5F, f2, 0.7F);
            }

            this.flap(legL1, speedLeg, -degreeLeg, false, 0, -0.5F, f2, 0.7F);
            this.flap(legR1, speedLeg, degreeLeg, false, 0, 0.5F, f2, 0.7F);
            this.flap(legL2, speedLeg, -degreeLeg, false, 0.5F, -0.5F, f2, 0.7F);
            this.flap(legR2, speedLeg, degreeLeg, false, 0.5F, 0.5F, f2, 0.7F);
            this.flap(legL3, speedLeg, -degreeLeg, false, 1.0F, -0.5F, f2, 0.7F);
            this.flap(legR3, speedLeg, degreeLeg, false, 1.0F, 0.5F, f2, 0.7F);


            this.bob(body, -speed, 0.3F, false, f2, 2);

            if(!e.isInWater()){
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetX = -0.5F;
            }


        }
    }
}
