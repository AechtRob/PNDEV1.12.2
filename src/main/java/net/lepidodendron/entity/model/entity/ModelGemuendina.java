package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraGemuendina;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelGemuendina extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer finL2;
    private final AdvancedModelRenderer finR2;
    private final AdvancedModelRenderer jawlower;
    private final AdvancedModelRenderer jawupper;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer finL;
    private final AdvancedModelRenderer finR;


    public ModelGemuendina() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, -2.0F);
        this.body.cubeList.add(new ModelBox(body, 32, 20, -4.5F, -2.1F, -3.75F, 9, 2, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 44, 35, -3.5F, -2.1F, -4.75F, 7, 2, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 35, 42, -3.5F, -2.1F, 0.25F, 7, 2, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.25F, 1.25F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 24, -3.49F, -0.86F, 0.0F, 7, 2, 8, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 22, 26, -2.5F, -1.35F, -0.25F, 5, 1, 8, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 40, 26, -2.49F, -0.85F, 0.0F, 5, 2, 4, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 10, 45, -1.5F, -1.25F, -0.25F, 3, 1, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 34, -1.49F, -0.86F, -0.25F, 3, 2, 6, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 0, 0.0F, -1.5F, 1.75F, 0, 1, 2, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 5.6F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 36, 11, -0.99F, -0.85F, 0.0F, 2, 2, 6, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 5.7F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 1, 55, -0.49F, -0.35F, 0.0F, 1, 1, 8, 0.0F, false));

        this.finL2 = new AdvancedModelRenderer(this);
        this.finL2.setRotationPoint(2.5F, 0.75F, 0.0F);
        this.body3.addChild(finL2);
        this.setRotateAngle(finL2, 0.0F, -0.4363F, 0.0873F);
        this.finL2.cubeList.add(new ModelBox(finL2, 0, 5, 0.0F, 0.0F, 0.0F, 3, 0, 5, 0.0F, false));

        this.finR2 = new AdvancedModelRenderer(this);
        this.finR2.setRotationPoint(-2.5F, 0.75F, 0.0F);
        this.body3.addChild(finR2);
        this.setRotateAngle(finR2, 0.0F, 0.4363F, -0.0873F);
        this.finR2.cubeList.add(new ModelBox(finR2, 0, 0, -3.0F, 0.0F, 0.0F, 3, 0, 5, 0.0F, false));

        this.jawlower = new AdvancedModelRenderer(this);
        this.jawlower.setRotationPoint(0.0F, -1.0F, -4.5F);
        this.body.addChild(jawlower);
        this.jawlower.cubeList.add(new ModelBox(jawlower, 15, 41, -2.5F, 0.0F, -3.0F, 5, 1, 3, 0.0F, false));

        this.jawupper = new AdvancedModelRenderer(this);
        this.jawupper.setRotationPoint(0.0F, -2.25F, -1.4F);
        this.body.addChild(jawupper);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.75F, 1.25F, -4.0F);
        this.jawupper.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2182F, 0.829F, 0.3054F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 42, -0.6F, -1.15F, -0.5F, 2, 1, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, 0.25F, -2.6F);
        this.jawupper.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2618F, 1.2654F, 0.1745F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 35, -5.15F, -0.45F, -3.55F, 5, 1, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, 0.25F, -2.6F);
        this.jawupper.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2618F, -1.2654F, -0.1745F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 0, 0.15F, -0.45F, -3.55F, 5, 1, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.0F, 0.25F, -5.6F);
        this.jawupper.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, -0.6109F, -0.1309F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 16, 0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(3.0F, 0.25F, -5.6F);
        this.jawupper.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.6109F, 0.1309F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 45, -2.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.25F, -1.6F);
        this.jawupper.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 35, -1.5F, -1.65F, -0.5F, 3, 1, 6, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.25F, -5.6F);
        this.jawupper.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -1.5F, -1.01F, 1.25F, 1, 0, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 1, 0.5F, -1.01F, 1.25F, 1, 0, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 6, -3.0F, -1.0F, 0.0F, 6, 1, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.75F, 1.25F, -4.0F);
        this.jawupper.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2182F, -0.829F, -0.3054F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 42, -1.4F, -1.15F, -0.5F, 2, 1, 5, 0.0F, false));

        this.finL = new AdvancedModelRenderer(this);
        this.finL.setRotationPoint(3.5F, -1.0F, -5.0F);
        this.body.addChild(finL);
        this.setRotateAngle(finL, 0.0F, -0.5672F, 0.0873F);
        this.finL.cubeList.add(new ModelBox(finL, 0, 12, 1.0F, 0.0F, 0.0F, 12, 0, 12, 0.0F, false));

        this.finR = new AdvancedModelRenderer(this);
        this.finR.setRotationPoint(-3.5F, -1.0F, -5.0F);
        this.body.addChild(finR);
        this.setRotateAngle(finR, 0.0F, 0.5672F, -0.0873F);
        this.finR.cubeList.add(new ModelBox(finR, 0, 0, -13.0F, 0.0F, 0.0F, 12, 0, 12, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.29F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.rotateAngleY = (float) Math.toRadians(90);
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
        this.body.offsetY = 1.05F;

        EntityPrehistoricFloraGemuendina ee = (EntityPrehistoricFloraGemuendina) e;

        //System.err.println("swimmingTicks = " + ee.swimmingTicks);
        //System.err.println("buriedTicks = " + buriedTicks);

        float speedmodifier = 1;
        float swaymodifier = 1;

        if (ee.getBuriedTick() > 0 || ee.getBuried() || ee.getSwimCount() <= 0) {
            if (ee.getBuriedTick() > 0) {
                speedmodifier = 6F;
            }
            if (ee.getBuried() && (ee.getBuriedTick() <= 0)) {
                this.body.offsetY = 1.13F;
                this.body.rotateAngleX = -(float) Math.toRadians(30);
                swaymodifier = 0;
            }
            else {
                this.body.offsetY = 1.05F + (0.08F * (float)((double)ee.getBuriedTick()/60D));
                this.body.rotateAngleX = -(float) Math.toRadians(30 * ((double)ee.getBuriedTick()/60D));
            }
        }
        else {
            this.body.offsetY = 1.05F;
        }

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body4, this.body5, this.body6};

        float speed = 0.4F;
        float taildegree = 0.35F;

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
            speed = 0.15F * speedmodifier;
            taildegree = 0.15F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3, f2, 1);
            this.swing(body, speed, 0.3F * swaymodifier, true, 0, 0, f2, 1);
            //this.walk(jaw, (float) (speed * 0.75), -0.5F, true, 0, 0, f2, 1);
            this.flap(finL, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(finL, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.flap(finR, (float) (speed * 0.75), -0.12F, true, 0, 0, f2, 1);
            this.swing(finR, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 1.0F;
                this.bob(body, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
