package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelAntarcticarcinus extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer body2_shell;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer body3_shell;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body4_shell;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer body5_shell;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer body6_shell;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer legR9;
    private final AdvancedModelRenderer legL9;
    private final AdvancedModelRenderer body7_shell;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer body11;
    private final AdvancedModelRenderer body12;
    private final AdvancedModelRenderer body13;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer legR6;

    public ModelAntarcticarcinus() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.5F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 18, 4, -1.0F, -0.35F, -8.0F, 2, 0, 2, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.5F, -0.3F, -8.0F);
        this.body.addChild(antennaL);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 16, 10, 0.0F, 0.0F, -2.0F, 2, 0, 2, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-0.5F, -0.3F, -8.0F);
        this.body.addChild(antennaR);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 10, -2.0F, 0.0F, -2.0F, 2, 0, 2, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.5F, -7.5F);
        this.body.addChild(body2);


        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(0.75F, 0.05F, 0.5F);
        this.body2.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.3927F, 0.3054F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 21, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-0.75F, 0.05F, 0.5F);
        this.body2.addChild(legR);
        this.setRotateAngle(legR, 0.0F, -0.3927F, -0.3054F);
        this.legR.cubeList.add(new ModelBox(legR, 6, 21, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.body2_shell = new AdvancedModelRenderer(this);
        this.body2_shell.setRotationPoint(0.0F, 0.075F, 0.0F);
        this.body2.addChild(body2_shell);
        this.setRotateAngle(body2_shell, 0.0873F, 0.0F, 0.0F);
        this.body2_shell.cubeList.add(new ModelBox(body2_shell, 0, 18, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.5F, 0.0F, 3.0F);
        this.body2_shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.5236F, -0.1309F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.15F, 0.05F, -3.0F, 1, 0, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.5F, 0.0F, 3.0F);
        this.body2_shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.5236F, 0.1309F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 2, 0.15F, 0.05F, -3.0F, 1, 0, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.1F, 2.0F);
        this.body2.addChild(body3);


        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.25F, 0.15F, -0.15F);
        this.body3.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.2618F, 0.3229F);
        this.legL2.cubeList.add(new ModelBox(legL2, 18, 20, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.25F, 0.15F, -0.15F);
        this.body3.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, -0.2618F, -0.3229F);
        this.legR2.cubeList.add(new ModelBox(legR2, 20, 18, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.body3_shell = new AdvancedModelRenderer(this);
        this.body3_shell.setRotationPoint(0.0F, 0.25F, -0.25F);
        this.body3.addChild(body3_shell);
        this.body3_shell.cubeList.add(new ModelBox(body3_shell, 16, 2, -1.5F, -0.1F, 0.0F, 3, 0, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, 0.0F, 1.0F);
        this.body3_shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0873F, -0.1309F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -5.9F, -0.1F, -1.0F, 6, 0, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, 0.0F, 1.0F);
        this.body3_shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.0873F, 0.1309F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 6, -0.1F, -0.1F, -1.0F, 6, 0, 6, 0.0F, false));

        this.body4_shell = new AdvancedModelRenderer(this);
        this.body4_shell.setRotationPoint(0.0F, -0.075F, 1.0F);
        this.body3_shell.addChild(body4_shell);
        this.setRotateAngle(body4_shell, 0.0873F, 0.0F, 0.0F);
        this.body4_shell.cubeList.add(new ModelBox(body4_shell, 10, 12, -2.0F, 0.0F, 0.0F, 4, 0, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.5F, 0.0F, 1.0F);
        this.body4_shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0436F, -0.1745F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 4, -1.1F, 0.05F, -0.75F, 1, 0, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.5F, 0.0F, 1.0F);
        this.body4_shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.0436F, 0.1745F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 7, 0.1F, 0.05F, -0.75F, 1, 0, 3, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(1.25F, -0.1F, 2.75F);
        this.body3_shell.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0873F, 0.3054F);
        this.legL4.cubeList.add(new ModelBox(legL4, 20, 12, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.5F, -0.1F, 1.5F);
        this.body3_shell.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.1745F, 0.3316F);
        this.legL3.cubeList.add(new ModelBox(legL3, 20, 17, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-1.25F, -0.1F, 2.75F);
        this.body3_shell.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, -0.0873F, -0.3054F);
        this.legR4.cubeList.add(new ModelBox(legR4, 20, 13, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.5F, -0.1F, 1.5F);
        this.body3_shell.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, -0.1745F, -0.3316F);
        this.legR3.cubeList.add(new ModelBox(legR3, 20, 14, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.25F, 3.75F);
        this.body3.addChild(body5);


        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-1.25F, -0.1F, 0.0F);
        this.body5.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.0F, -0.3054F);
        this.legR5.cubeList.add(new ModelBox(legR5, 6, 20, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(1.25F, -0.1F, 0.0F);
        this.body5.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0F, 0.3054F);
        this.legL5.cubeList.add(new ModelBox(legL5, 12, 20, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.body5_shell = new AdvancedModelRenderer(this);
        this.body5_shell.setRotationPoint(0.0F, -0.175F, -1.0F);
        this.body5.addChild(body5_shell);
        this.setRotateAngle(body5_shell, 0.0873F, 0.0F, 0.0F);
        this.body5_shell.cubeList.add(new ModelBox(body5_shell, 0, 15, -2.5F, 0.1F, 1.0F, 5, 0, 2, 0.0F, false));
        this.body5_shell.cubeList.add(new ModelBox(body5_shell, 0, 17, -2.0F, 0.1F, 0.0F, 4, 0, 1, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body5.addChild(body6);


        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-1.25F, -0.1F, 0.75F);
        this.body6.addChild(legR7);
        this.setRotateAngle(legR7, 0.0F, 0.1309F, -0.3054F);
        this.legR7.cubeList.add(new ModelBox(legR7, 19, 7, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(1.25F, -0.1F, 0.75F);
        this.body6.addChild(legL7);
        this.setRotateAngle(legL7, 0.0F, -0.1309F, 0.3054F);
        this.legL7.cubeList.add(new ModelBox(legL7, 11, 19, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.body6_shell = new AdvancedModelRenderer(this);
        this.body6_shell.setRotationPoint(0.0F, -0.15F, -1.0F);
        this.body6.addChild(body6_shell);
        this.setRotateAngle(body6_shell, 0.0436F, 0.0F, 0.0F);
        this.body6_shell.cubeList.add(new ModelBox(body6_shell, 0, 12, -2.5F, 0.0F, 0.0F, 5, 0, 3, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.1F, 1.5F);
        this.body6.addChild(body7);


        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(1.0F, -0.1F, 0.5F);
        this.body7.addChild(legL8);
        this.setRotateAngle(legL8, 0.0F, -0.2182F, 0.3054F);
        this.legL8.cubeList.add(new ModelBox(legL8, 19, 9, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(-0.75F, -0.1F, 1.75F);
        this.body7.addChild(legR9);
        this.setRotateAngle(legR9, 0.0F, 0.3491F, -0.3054F);
        this.legR9.cubeList.add(new ModelBox(legR9, 5, 19, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(0.75F, -0.1F, 1.75F);
        this.body7.addChild(legL9);
        this.setRotateAngle(legL9, 0.0F, -0.3491F, 0.3054F);
        this.legL9.cubeList.add(new ModelBox(legL9, 19, 8, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.body7_shell = new AdvancedModelRenderer(this);
        this.body7_shell.setRotationPoint(0.0F, -0.35F, -1.25F);
        this.body7.addChild(body7_shell);
        this.setRotateAngle(body7_shell, -0.0436F, 0.0F, 0.0F);
        this.body7_shell.cubeList.add(new ModelBox(body7_shell, 16, 0, -1.5F, 0.0F, 1.0F, 3, 0, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.5F, -0.2F, 1.0F);
        this.body7_shell.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.3491F, -0.1745F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 4, -1.0F, 0.2F, 0.0F, 1, 0, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.5F, -0.2F, 1.0F);
        this.body7_shell.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.3491F, 0.1745F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 7, 0.0F, 0.2F, 0.0F, 1, 0, 3, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, -0.2F, 2.25F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 10, 15, -1.5F, 0.0F, -1.75F, 3, 0, 2, 0.0F, false));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 0.25F);
        this.body8.addChild(body9);
        this.setRotateAngle(body9, 0.0436F, 0.0F, 0.0F);
        this.body9.cubeList.add(new ModelBox(body9, 15, 17, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.05F, 1.65F);
        this.body9.addChild(body10);
        this.body10.cubeList.add(new ModelBox(body10, 11, 17, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.body11 = new AdvancedModelRenderer(this);
        this.body11.setRotationPoint(0.0F, 0.05F, 1.65F);
        this.body10.addChild(body11);
        this.body11.cubeList.add(new ModelBox(body11, 7, 17, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.body12 = new AdvancedModelRenderer(this);
        this.body12.setRotationPoint(0.0F, 0.05F, 1.5F);
        this.body11.addChild(body12);
        this.body12.cubeList.add(new ModelBox(body12, 16, 15, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.body13 = new AdvancedModelRenderer(this);
        this.body13.setRotationPoint(0.0F, 0.05F, 1.5F);
        this.body12.addChild(body13);
        this.body13.cubeList.add(new ModelBox(body13, 0, 0, -0.5F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(-1.0F, -0.1F, 0.5F);
        this.body7.addChild(legR8);
        this.setRotateAngle(legR8, 0.0F, 0.2182F, -0.3054F);
        this.legR8.cubeList.add(new ModelBox(legR8, 19, 6, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(1.25F, -0.1F, -0.5F);
        this.body6.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, -0.0436F, 0.3054F);
        this.legL6.cubeList.add(new ModelBox(legL6, 17, 19, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-1.25F, -0.1F, -0.5F);
        this.body6.addChild(legR6);
        this.setRotateAngle(legR6, 0.0F, 0.0436F, -0.3054F);
        this.legR6.cubeList.add(new ModelBox(legR6, 0, 20, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        //this.Bodyfront.render(0.5F);
        //this.leg2R_r1.defaultRotationZ = -0.6109F;
        //this.leg2L_r1.defaultRotationZ = 0.6109F;
        this.body.render(f5 * 0.3F);

    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.body.render(0.01F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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
        this.body.offsetY = 1.0F;

        AdvancedModelRenderer[] fishTail = {this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12, this.body13};
        AdvancedModelRenderer[] legsL = {this.legL, this.legL2, this.legL3, this.legL4, this.legL5, this.legL6, this.legL7, this.legL8, this.legL9};
        AdvancedModelRenderer[] legsR = {this.legR, this.legR2, this.legR3, this.legR4, this.legR5, this.legR6, this.legR7, this.legR8, this.legR9};

        float speed = 0.4F;
        float tailVdegree = 0.7F;
        float tailHdegree = 0.0F;
        float tailSwing = 0.25F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.15F;
            tailVdegree = 0.06F;
            tailHdegree = 0.2F;
            tailSwing = 0.1F;
        }

        //Antennae:
        this.swing(antennaL, 0.5F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaR, 0.5F, 0.2F, false, 0, 0.1F, f2, 0.8F);

        //Legs:
        if (f3 != 0.0F) {
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
            this.flap(legL6, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legR6, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legL7, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legR7, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legL8, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legR8, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legL9, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(legR9, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);

        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, tailVdegree * 0.3f, -3, f2, 1);
            this.chainSwing(fishTail, speed, tailHdegree, -2.5, f2, tailSwing);

            //this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            if (!isAtBottom) {
                this.bob(body, -speed, 1.5F, false, f2, 2);
            }
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 1.0F;
                this.bob(body, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, tailHdegree, -3, f2, 1);
                this.chainSwing(fishTail, speed, tailVdegree, -3, f2, 1);
            }
        }
    }
}
