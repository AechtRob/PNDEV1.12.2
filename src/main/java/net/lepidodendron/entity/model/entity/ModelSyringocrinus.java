package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelSyringocrinus extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer arm;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;

    public ModelSyringocrinus() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.5F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -1.0F, -4.5F, 2, 1, 3, 0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 9, 3, -1.0152F, -1.0F, -5.3084F, 1, 1, 1, 0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.2744F, -1.0F, -2.7601F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.528F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 0, -0.0043F, 0.0F, -0.0153F, 1, 1, 2, -0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.2744F, -1.0F, -2.7601F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.528F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 7, 0, -0.9957F, 0.0F, -0.0153F, 1, 1, 2, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5984F, -1.0F, -4.6542F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.8814F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 3, 10, 0.0082F, 0.0F, -1.0042F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5984F, -1.0F, -4.6542F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.8814F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 6, -1.0082F, 0.0F, -1.0042F, 1, 1, 1, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.5F, -1.0F, -3.0F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.3491F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 6, 7, -0.65F, 0.0F, -1.525F, 1, 1, 2, -0.001F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -1.0F, -3.0F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.3491F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 6, 7, -0.35F, 0.0F, -1.525F, 1, 1, 2, 0.0F, false));

        this.arm = new AdvancedModelRenderer(this);
        this.arm.setRotationPoint(-1.1984F, -1.0F, -4.9792F);
        this.main.addChild(arm);
        this.setRotateAngle(arm, 0.0F, -0.5672F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.4F, 0.0F, 0.325F);
        this.arm.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.8814F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 9, -2.9918F, 0.0F, -0.5042F, 3, 1, 0, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -0.5F, -1.5F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 4, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.001F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 5, 4, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 5, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 8, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.disableCull();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.main.offsetZ = -0.08F;
        this.main.render(0.021F);
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
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        float speed = 0.2F;
        if (!e.isInWater()) {
            speed = 0.3F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (!e.isInWater()) {
                this.main.offsetY = -0;
                return;
                //this.body.rotateAngleZ = (float) Math.toRadians(90);
                //this.body.offsetY = 1.2F;
//                this.bob(main, -speed, 5F, false, f2, 1);
            }
            this.main.offsetY = -0.15F;
            this.chainWave(fishTail, speed * 5, 0.1F, -3, f2, 1);
            this.chainSwing(fishTail, speed*5, 0.26F, -3, f2, 1);

            //this.finR2.flap(speed * 6, (float)Math.toRadians(25), false, 0, (float)Math.toRadians(25), f2, 1F);

            this.arm.swing(speed/5, 0.1F, false, 0, 0, f2, 1F);


            this.swing(main, speed, 0.06F, true, 0, 0, f2, 1);

        }
    }
}
