package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelWingertshellicus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer AntennaR;
    private final AdvancedModelRenderer AntennaL;
    private final AdvancedModelRenderer HeadlegR;
    private final AdvancedModelRenderer HeadlegL;
    private final AdvancedModelRenderer HeadlegR2;
    private final AdvancedModelRenderer HeadlegL2;
    private final AdvancedModelRenderer HeadlegR3;
    private final AdvancedModelRenderer HeadlegL3;
    private final AdvancedModelRenderer HeadlegR4;
    private final AdvancedModelRenderer HeadlegL4;
    private final AdvancedModelRenderer HeadlegR5;
    private final AdvancedModelRenderer HeadlegL5;
    private final AdvancedModelRenderer HeadlegR6;
    private final AdvancedModelRenderer HeadlegL6;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer Body6;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer Body7;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer Body8;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer Body9;
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer Body11;
    private final AdvancedModelRenderer legL9;
    private final AdvancedModelRenderer legR9;

    public ModelWingertshellicus() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 6, 10, -1.0F, -1.0F, -7.0F, 2, 1, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 8, 0, -0.5F, -1.0F, -8.0F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 0.0F, -8.0F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0436F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 5, -0.5F, -1.0F, 0.075F, 2, 1, 1, -0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.0F, -8.0F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0436F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 5, -1.5F, -1.0F, 0.075F, 2, 1, 1, -0.01F, false));

        this.AntennaR = new AdvancedModelRenderer(this);
        this.AntennaR.setRotationPoint(-0.25F, -0.5F, -8.0F);
        this.Body.addChild(AntennaR);
        this.setRotateAngle(AntennaR, -0.2182F, 0.3491F, 0.0F);
        this.AntennaR.cubeList.add(new ModelBox(AntennaR, 0, 0, 0.0F, -2.5F, -7.0F, 0, 3, 7, 0.0F, false));

        this.AntennaL = new AdvancedModelRenderer(this);
        this.AntennaL.setRotationPoint(0.25F, -0.5F, -8.0F);
        this.Body.addChild(AntennaL);
        this.setRotateAngle(AntennaL, -0.2182F, -0.3491F, 0.0F);
        this.AntennaL.cubeList.add(new ModelBox(AntennaL, 0, 0, 0.0F, -2.5F, -7.0F, 0, 3, 7, 0.0F, true));

        this.HeadlegR = new AdvancedModelRenderer(this);
        this.HeadlegR.setRotationPoint(-1.0F, -0.25F, -6.825F);
        this.Body.addChild(HeadlegR);
        this.setRotateAngle(HeadlegR, 0.0F, -0.7854F, -0.6545F);
        this.HeadlegR.cubeList.add(new ModelBox(HeadlegR, 0, 1, -1.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.HeadlegL = new AdvancedModelRenderer(this);
        this.HeadlegL.setRotationPoint(1.0F, -0.25F, -6.825F);
        this.Body.addChild(HeadlegL);
        this.setRotateAngle(HeadlegL, 0.0F, 0.7854F, 0.6545F);
        this.HeadlegL.cubeList.add(new ModelBox(HeadlegL, 0, 1, 0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.HeadlegR2 = new AdvancedModelRenderer(this);
        this.HeadlegR2.setRotationPoint(-1.0F, -0.25F, -6.725F);
        this.Body.addChild(HeadlegR2);
        this.setRotateAngle(HeadlegR2, 0.0F, -0.6109F, -0.6545F);
        this.HeadlegR2.cubeList.add(new ModelBox(HeadlegR2, 0, 1, -1.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.HeadlegL2 = new AdvancedModelRenderer(this);
        this.HeadlegL2.setRotationPoint(1.0F, -0.25F, -6.725F);
        this.Body.addChild(HeadlegL2);
        this.setRotateAngle(HeadlegL2, 0.0F, 0.6109F, 0.6545F);
        this.HeadlegL2.cubeList.add(new ModelBox(HeadlegL2, 0, 1, 0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.HeadlegR3 = new AdvancedModelRenderer(this);
        this.HeadlegR3.setRotationPoint(-1.0F, -0.25F, -6.625F);
        this.Body.addChild(HeadlegR3);
        this.setRotateAngle(HeadlegR3, 0.0F, -0.4363F, -0.6545F);
        this.HeadlegR3.cubeList.add(new ModelBox(HeadlegR3, 6, 6, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.HeadlegL3 = new AdvancedModelRenderer(this);
        this.HeadlegL3.setRotationPoint(1.0F, -0.25F, -6.625F);
        this.Body.addChild(HeadlegL3);
        this.setRotateAngle(HeadlegL3, 0.0F, 0.4363F, 0.6545F);
        this.HeadlegL3.cubeList.add(new ModelBox(HeadlegL3, 6, 6, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.HeadlegR4 = new AdvancedModelRenderer(this);
        this.HeadlegR4.setRotationPoint(-1.0F, -0.25F, -6.525F);
        this.Body.addChild(HeadlegR4);
        this.setRotateAngle(HeadlegR4, 0.0F, -0.3491F, -0.1309F);
        this.HeadlegR4.cubeList.add(new ModelBox(HeadlegR4, 8, 3, -4.0F, -0.25F, 0.0F, 4, 3, 0, 0.0F, false));

        this.HeadlegL4 = new AdvancedModelRenderer(this);
        this.HeadlegL4.setRotationPoint(1.0F, -0.25F, -6.525F);
        this.Body.addChild(HeadlegL4);
        this.setRotateAngle(HeadlegL4, 0.0F, 0.3491F, 0.1309F);
        this.HeadlegL4.cubeList.add(new ModelBox(HeadlegL4, 8, 3, 0.0F, -0.25F, 0.0F, 4, 3, 0, 0.0F, true));

        this.HeadlegR5 = new AdvancedModelRenderer(this);
        this.HeadlegR5.setRotationPoint(-1.0F, -0.25F, -6.325F);
        this.Body.addChild(HeadlegR5);
        this.setRotateAngle(HeadlegR5, 0.0F, -0.2618F, -0.1309F);
        this.HeadlegR5.cubeList.add(new ModelBox(HeadlegR5, 8, 3, -4.0F, -0.25F, 0.0F, 4, 3, 0, 0.0F, false));

        this.HeadlegL5 = new AdvancedModelRenderer(this);
        this.HeadlegL5.setRotationPoint(1.0F, -0.25F, -6.325F);
        this.Body.addChild(HeadlegL5);
        this.setRotateAngle(HeadlegL5, 0.0F, 0.2618F, 0.1309F);
        this.HeadlegL5.cubeList.add(new ModelBox(HeadlegL5, 8, 3, 0.0F, -0.25F, 0.0F, 4, 3, 0, 0.0F, true));

        this.HeadlegR6 = new AdvancedModelRenderer(this);
        this.HeadlegR6.setRotationPoint(-1.0F, -0.25F, -6.125F);
        this.Body.addChild(HeadlegR6);
        this.setRotateAngle(HeadlegR6, 0.0F, -0.1309F, -0.1309F);
        this.HeadlegR6.cubeList.add(new ModelBox(HeadlegR6, 8, 3, -4.0F, -0.25F, 0.0F, 4, 3, 0, 0.0F, false));

        this.HeadlegL6 = new AdvancedModelRenderer(this);
        this.HeadlegL6.setRotationPoint(1.0F, -0.25F, -6.125F);
        this.Body.addChild(HeadlegL6);
        this.setRotateAngle(HeadlegL6, 0.0F, 0.1309F, 0.1309F);
        this.HeadlegL6.cubeList.add(new ModelBox(HeadlegL6, 8, 3, 0.0F, -0.25F, 0.0F, 4, 3, 0, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -0.5F, -6.0F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 13, -0.5F, -0.55F, 0.0F, 1, 1, 2, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 10, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.01F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.Body2.addChild(legL);
        this.legL.cubeList.add(new ModelBox(legL, 0, 0, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.Body2.addChild(legR);
        this.legR.cubeList.add(new ModelBox(legR, 0, 0, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 13, -0.5F, -0.55F, 0.0F, 1, 1, 2, -0.01F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 10, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.Body3.addChild(legL2);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 0, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.Body3.addChild(legR2);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 0, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 13, -0.5F, -0.55F, 0.0F, 1, 1, 2, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 10, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.01F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.Body4.addChild(legL3);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 0, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.Body4.addChild(legR3);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 0, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 13, -0.5F, -0.55F, 0.0F, 1, 1, 2, -0.01F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 10, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.Body5.addChild(legL4);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 0, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.Body5.addChild(legR4);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 0, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Body6 = new AdvancedModelRenderer(this);
        this.Body6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body5.addChild(Body6);
        this.Body6.cubeList.add(new ModelBox(Body6, 0, 13, -0.5F, -0.55F, 0.0F, 1, 1, 2, 0.0F, false));
        this.Body6.cubeList.add(new ModelBox(Body6, 0, 10, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.01F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.Body6.addChild(legL5);
        this.legL5.cubeList.add(new ModelBox(legL5, 0, 0, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.Body6.addChild(legR5);
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 0, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Body7 = new AdvancedModelRenderer(this);
        this.Body7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body6.addChild(Body7);
        this.Body7.cubeList.add(new ModelBox(Body7, 0, 13, -0.5F, -0.55F, 0.0F, 1, 1, 2, -0.01F, false));
        this.Body7.cubeList.add(new ModelBox(Body7, 0, 10, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.Body7.addChild(legL6);
        this.legL6.cubeList.add(new ModelBox(legL6, 0, 0, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.Body7.addChild(legR6);
        this.legR6.cubeList.add(new ModelBox(legR6, 0, 0, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Body8 = new AdvancedModelRenderer(this);
        this.Body8.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body7.addChild(Body8);
        this.Body8.cubeList.add(new ModelBox(Body8, 0, 13, -0.5F, -0.55F, 0.0F, 1, 1, 2, 0.0F, false));
        this.Body8.cubeList.add(new ModelBox(Body8, 0, 10, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.01F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.Body8.addChild(legL7);
        this.legL7.cubeList.add(new ModelBox(legL7, 0, 0, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.Body8.addChild(legR7);
        this.legR7.cubeList.add(new ModelBox(legR7, 0, 0, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Body9 = new AdvancedModelRenderer(this);
        this.Body9.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body8.addChild(Body9);
        this.Body9.cubeList.add(new ModelBox(Body9, 0, 13, -0.5F, -0.55F, 0.0F, 1, 1, 2, -0.01F, false));
        this.Body9.cubeList.add(new ModelBox(Body9, 0, 10, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.Body9.addChild(legL8);
        this.legL8.cubeList.add(new ModelBox(legL8, 0, 0, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.Body9.addChild(legR8);
        this.legR8.cubeList.add(new ModelBox(legR8, 0, 0, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Body11 = new AdvancedModelRenderer(this);
        this.Body11.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body9.addChild(Body11);
        this.Body11.cubeList.add(new ModelBox(Body11, 8, 12, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));
        this.Body11.cubeList.add(new ModelBox(Body11, 0, 3, -3.25F, 0.0F, 2.5F, 3, 0, 2, 0.0F, false));
        this.Body11.cubeList.add(new ModelBox(Body11, 0, 3, 0.25F, 0.0F, 2.5F, 3, 0, 2, 0.0F, true));

        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(0.5F, 0.0F, 1.0F);
        this.Body11.addChild(legL9);
        this.legL9.cubeList.add(new ModelBox(legL9, 0, 0, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(-0.5F, 0.0F, 1.0F);
        this.Body11.addChild(legR9);
        this.legR9.cubeList.add(new ModelBox(legR9, 0, 0, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.head.render(f5 * 0.25F);
        this.Body.render(f5 * 0.2F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Body.rotateAngleY = (float) Math.toRadians(90);
        this.Body.offsetX = -0.F;
        this.Body.offsetY = -0F;
        this.Body.offsetZ = 0.0F;
        this.Body.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        this.Body.offsetY = 1.17F;
        //this.gill.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.gill.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.Body5, this.Body6, this.Body7, this.Body8, this.Body9, this.Body11};
        AdvancedModelRenderer[] legsL = {this.legL, this.legL2, this.legL3, this.legL4, this.legL5, this.legL6, this.legL7, this.legL8, this.legL9};
        AdvancedModelRenderer[] legsR = {this.legR, this.legR2, this.legR3, this.legR4, this.legR5, this.legR6, this.legR7, this.legR8, this.legR9};
        AdvancedModelRenderer[] handL = {this.HeadlegL, this.HeadlegL2, this.HeadlegL3, this.HeadlegL4, this.HeadlegL5, this.HeadlegL6};
        AdvancedModelRenderer[] handR = {this.HeadlegR, this.HeadlegR2, this.HeadlegR3, this.HeadlegR4, this.HeadlegR5, this.HeadlegR6};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.3F, -3, f2, 0.7F);
            this.chainWave(handL, speed, 0.2F, -3, f2, 1);
            this.chainSwing(handL, speed, 0.05F, -3, f2, 0.7F);
            this.chainWave(handR, speed, 0.2F, -3, f2, 1);
            this.chainSwing(handR, speed, 0.05F, -3, f2, 0.7F);
            this.chainSwing(legsL, speed, 0.1F, -3, f2, 0.7F);
            this.chainSwing(legsR, speed, 0.1F, -3, f2, 0.7F);
            this.walk(AntennaL, speed, 0.5F, false, 0, -0.5F, f2, 0.3F);
            this.walk(AntennaR, speed, 0.5F, false, 0, -0.5F, f2, 0.3F);
            this.swing(Body, speed, 0.4F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.Body.rotateAngleZ = (float) Math.toRadians(90);
                this.Body.offsetY = 1.07F;
                this.bob(Body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
