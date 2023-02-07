package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelConcavicaris extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer gillbase;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer gillR1;
    private final AdvancedModelRenderer gillL1;
    private final AdvancedModelRenderer gillL2;
    private final AdvancedModelRenderer gillL3;
    private final AdvancedModelRenderer gillL4;
    private final AdvancedModelRenderer gillL5;
    private final AdvancedModelRenderer gillL6;
    private final AdvancedModelRenderer gillR2;
    private final AdvancedModelRenderer gillR3;
    private final AdvancedModelRenderer gillR4;
    private final AdvancedModelRenderer gillR5;
    private final AdvancedModelRenderer gillR6;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legL5;

    public ModelConcavicaris() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 17.0964F, -3.0625F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -1.8464F, -3.1875F, 3, 4, 9, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, 9.9036F, 3.0625F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 13, -3.5F, -12.4F, -3.95F, 5, 6, 5, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, 9.9036F, 3.0625F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 0, -3.5F, -12.975F, -4.175F, 5, 5, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 9.9036F, 3.0625F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.6545F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 17, -1.5F, -13.475F, 1.25F, 3, 1, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 13, -0.5F, -13.475F, 0.25F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 9.9036F, 3.0625F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 25, 8, -1.0F, -11.65F, -0.15F, 2, 2, 4, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.0464F, -5.1875F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3927F, -0.1745F, -0.0698F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.0464F, -5.1875F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3927F, 0.1745F, 0.0698F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -2.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, 9.9036F, 3.0625F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 19, -3.0F, -12.4F, -1.1F, 4, 6, 5, 0.0F, false));

        this.gillbase = new AdvancedModelRenderer(this);
        this.gillbase.setRotationPoint(0.0F, 9.9036F, 3.0625F);
        this.body.addChild(gillbase);
        this.setRotateAngle(gillbase, -0.9163F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.gillbase.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.576F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 28, -1.0F, -6.4F, -9.4F, 2, 4, 2, 0.0F, false));

        this.gillR1 = new AdvancedModelRenderer(this);
        this.gillR1.setRotationPoint(0.0F, -6.25F, -4.55F);
        this.gillbase.addChild(gillR1);
        this.setRotateAngle(gillR1, 1.3963F, -0.0873F, 0.3927F);
        this.gillR1.cubeList.add(new ModelBox(gillR1, 0, 0, -1.0F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.gillL1 = new AdvancedModelRenderer(this);
        this.gillL1.setRotationPoint(0.0F, -6.25F, -4.55F);
        this.gillbase.addChild(gillL1);
        this.setRotateAngle(gillL1, 1.3963F, 0.0873F, -0.3927F);
        this.gillL1.cubeList.add(new ModelBox(gillL1, 0, 0, 0.0F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.gillL2 = new AdvancedModelRenderer(this);
        this.gillL2.setRotationPoint(0.0F, -6.75F, -4.3F);
        this.gillbase.addChild(gillL2);
        this.setRotateAngle(gillL2, 1.3963F, 0.0873F, -0.3927F);
        this.gillL2.cubeList.add(new ModelBox(gillL2, 0, 0, 0.0F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.gillL3 = new AdvancedModelRenderer(this);
        this.gillL3.setRotationPoint(0.0F, -7.25F, -4.05F);
        this.gillbase.addChild(gillL3);
        this.setRotateAngle(gillL3, 1.3963F, 0.0873F, -0.3927F);
        this.gillL3.cubeList.add(new ModelBox(gillL3, 0, 0, 0.0F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.gillL4 = new AdvancedModelRenderer(this);
        this.gillL4.setRotationPoint(0.0F, -7.75F, -3.8F);
        this.gillbase.addChild(gillL4);
        this.setRotateAngle(gillL4, 1.3963F, 0.0873F, -0.3927F);
        this.gillL4.cubeList.add(new ModelBox(gillL4, 0, 0, 0.0F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.gillL5 = new AdvancedModelRenderer(this);
        this.gillL5.setRotationPoint(0.0F, -8.25F, -3.8F);
        this.gillbase.addChild(gillL5);
        this.setRotateAngle(gillL5, 1.3963F, 0.0873F, -0.3927F);
        this.gillL5.cubeList.add(new ModelBox(gillL5, 0, 0, 0.0F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.gillL6 = new AdvancedModelRenderer(this);
        this.gillL6.setRotationPoint(0.0F, -8.75F, -3.8F);
        this.gillbase.addChild(gillL6);
        this.setRotateAngle(gillL6, 1.3963F, 0.0873F, -0.3927F);
        this.gillL6.cubeList.add(new ModelBox(gillL6, 0, 0, 0.0F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.gillR2 = new AdvancedModelRenderer(this);
        this.gillR2.setRotationPoint(0.0F, -6.75F, -4.3F);
        this.gillbase.addChild(gillR2);
        this.setRotateAngle(gillR2, 1.3963F, -0.0873F, 0.3927F);
        this.gillR2.cubeList.add(new ModelBox(gillR2, 0, 0, -1.0F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.gillR3 = new AdvancedModelRenderer(this);
        this.gillR3.setRotationPoint(0.0F, -7.25F, -4.05F);
        this.gillbase.addChild(gillR3);
        this.setRotateAngle(gillR3, 1.3963F, -0.0873F, 0.3927F);
        this.gillR3.cubeList.add(new ModelBox(gillR3, 0, 0, -1.0F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.gillR4 = new AdvancedModelRenderer(this);
        this.gillR4.setRotationPoint(0.0F, -7.75F, -3.8F);
        this.gillbase.addChild(gillR4);
        this.setRotateAngle(gillR4, 1.3963F, -0.0873F, 0.3927F);
        this.gillR4.cubeList.add(new ModelBox(gillR4, 0, 0, -1.0F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.gillR5 = new AdvancedModelRenderer(this);
        this.gillR5.setRotationPoint(0.0F, -8.25F, -3.8F);
        this.gillbase.addChild(gillR5);
        this.setRotateAngle(gillR5, 1.3963F, -0.0873F, 0.3927F);
        this.gillR5.cubeList.add(new ModelBox(gillR5, 0, 0, -1.0F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.gillR6 = new AdvancedModelRenderer(this);
        this.gillR6.setRotationPoint(0.0F, -8.75F, -3.8F);
        this.gillbase.addChild(gillR6);
        this.setRotateAngle(gillR6, 1.3963F, -0.0873F, 0.3927F);
        this.gillR6.cubeList.add(new ModelBox(gillR6, 0, 0, -1.0F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-0.75F, 2.4036F, -1.9375F);
        this.body.addChild(legR1);
        this.setRotateAngle(legR1, -0.6981F, 0.2618F, 0.0F);
        this.legR1.cubeList.add(new ModelBox(legR1, 0, 15, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(0.75F, 2.4036F, -1.9375F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, -0.6981F, -0.2618F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 15, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.75F, 2.4036F, -1.0875F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, -0.9163F, 0.3054F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 6, 0, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.75F, 2.4036F, -1.0875F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, -0.9163F, -0.3054F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 6, 0, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.5F, 2.4036F, -0.0875F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, -0.1309F, -0.0436F, 0.3491F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 0, 0.0F, -1.0F, -3.5F, 0, 4, 4, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.5F, 2.4036F, -0.0875F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, -0.1309F, 0.0436F, -0.3491F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 0, 0.0F, -1.0F, -3.5F, 0, 4, 4, 0.0F, true));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.9F, 2.4036F, 0.9125F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, 0.2182F, -0.0873F, 0.2618F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 19, 0.0F, -0.5F, -4.5F, 0, 4, 5, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.9F, 2.4036F, 0.9125F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, 0.2182F, 0.0873F, -0.2618F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 19, 0.0F, -0.5F, -4.5F, 0, 4, 5, 0.0F, true));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.5F, 2.4036F, 1.9125F);
        this.body.addChild(legR5);
        this.setRotateAngle(legR5, 0.4363F, -0.0873F, 0.0873F);
        this.legR5.cubeList.add(new ModelBox(legR5, 15, 8, 0.0F, -1.0F, -4.25F, 0, 5, 5, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.5F, 2.4036F, 1.9125F);
        this.body.addChild(legL5);
        this.setRotateAngle(legL5, 0.4363F, 0.0873F, -0.0873F);
        this.legL5.cubeList.add(new ModelBox(legL5, 15, 8, 0.0F, -1.0F, -4.25F, 0, 5, 5, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 );
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.offsetZ = -0.04F;
        this.body.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
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
        //this.body.offsetY = 1.1F;


        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {

            float tailVdegree = 0.1F;
            float tailHdegree = 0.3F;

            float speedLeg = 2.5F;
            float degreeLeg = 0.2F;
            this.flap(legL, speedLeg, -degreeLeg, false, 0, -0.5F, f2, 0.7F);
            this.flap(legR1, speedLeg, degreeLeg, false, 0, 0.5F, f2, 0.7F);
            this.flap(legL2, speedLeg, -degreeLeg, false, 0.5F, -0.5F, f2, 0.7F);
            this.flap(legR2, speedLeg, degreeLeg, false, 0.5F, 0.5F, f2, 0.7F);
            this.flap(legL3, speedLeg, -degreeLeg, false, 1.0F, -0.5F, f2, 0.7F);
            this.flap(legR3, speedLeg, degreeLeg, false, 1.0F, 0.5F, f2, 0.7F);
            this.flap(legL4, speedLeg, -degreeLeg, false, 1.5F, -0.5F, f2, 0.7F);
            this.flap(legR4, speedLeg, degreeLeg, false, 1.5F, 0.5F, f2, 0.7F);
            this.flap(legL5, speedLeg, -degreeLeg, false, 2.0F, -0.5F, f2, 0.7F);
            this.flap(legR5, speedLeg, degreeLeg, false, 2.0F, 0.5F, f2, 0.7F);

            this.bob(body, -speed, 0.3F, false, f2, 2);


        }
    }
}
