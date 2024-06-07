package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;

public class ModelSemaeostomites extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer tentA;
    private final AdvancedModelRenderer tentA2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer tentA3;
    private final AdvancedModelRenderer tentA4;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tentA5;
    private final AdvancedModelRenderer tentA6;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tentA7;
    private final AdvancedModelRenderer tentA8;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tentacle;
    private final AdvancedModelRenderer tentacle4;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer tentacle3;

    public ModelSemaeostomites() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 25.5F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 10, -2.5F, -8.0F, -2.5F, 5, 1, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -7.5F, -3.0F, 6, 3, 6, 0.0F, false));

        this.tentA = new AdvancedModelRenderer(this);
        this.tentA.setRotationPoint(-0.35F, -7.25F, 0.35F);
        this.main.addChild(tentA);
        this.setRotateAngle(tentA, 0.2618F, -0.7854F, 0.0F);
        this.tentA.cubeList.add(new ModelBox(tentA, 0, 0, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.tentA2 = new AdvancedModelRenderer(this);
        this.tentA2.setRotationPoint(0.0F, 3.0F, 0.3F);
        this.tentA.addChild(tentA2);
        this.setRotateAngle(tentA2, -0.1309F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.0653F, -0.4957F);
        this.tentA2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 10, -0.5F, -1.25F, -0.5F, 1, 2, 1, 0.001F, false));

        this.tentA3 = new AdvancedModelRenderer(this);
        this.tentA3.setRotationPoint(0.35F, -7.25F, 0.35F);
        this.main.addChild(tentA3);
        this.setRotateAngle(tentA3, 0.2618F, 0.7854F, 0.0F);
        this.tentA3.cubeList.add(new ModelBox(tentA3, 0, 0, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, true));

        this.tentA4 = new AdvancedModelRenderer(this);
        this.tentA4.setRotationPoint(0.0F, 3.0F, 0.3F);
        this.tentA3.addChild(tentA4);
        this.setRotateAngle(tentA4, -0.1309F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.0653F, -0.4957F);
        this.tentA4.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 10, -0.5F, -1.25F, -0.5F, 1, 2, 1, 0.001F, true));

        this.tentA5 = new AdvancedModelRenderer(this);
        this.tentA5.setRotationPoint(0.35F, -7.25F, -0.35F);
        this.main.addChild(tentA5);
        this.setRotateAngle(tentA5, -0.2618F, -0.7854F, 0.0F);
        this.tentA5.cubeList.add(new ModelBox(tentA5, 0, 0, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, true));

        this.tentA6 = new AdvancedModelRenderer(this);
        this.tentA6.setRotationPoint(0.0F, 3.0F, -0.3F);
        this.tentA5.addChild(tentA6);
        this.setRotateAngle(tentA6, 0.1309F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.0653F, 0.4957F);
        this.tentA6.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 10, -0.5F, -1.25F, -0.5F, 1, 2, 1, 0.001F, true));

        this.tentA7 = new AdvancedModelRenderer(this);
        this.tentA7.setRotationPoint(-0.35F, -7.25F, -0.35F);
        this.main.addChild(tentA7);
        this.setRotateAngle(tentA7, -0.2618F, 0.7854F, 0.0F);
        this.tentA7.cubeList.add(new ModelBox(tentA7, 0, 0, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.tentA8 = new AdvancedModelRenderer(this);
        this.tentA8.setRotationPoint(0.0F, 3.0F, -0.3F);
        this.tentA7.addChild(tentA8);
        this.setRotateAngle(tentA8, 0.1309F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.0653F, 0.4957F);
        this.tentA8.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 10, -0.5F, -1.25F, -0.5F, 1, 2, 1, 0.001F, false));

        this.tentacle = new AdvancedModelRenderer(this);
        this.tentacle.setRotationPoint(-3.0F, -5.5F, 0.0F);
        this.main.addChild(tentacle);
        this.setRotateAngle(tentacle, 0.0F, 0.0F, 0.3927F);
        this.tentacle.cubeList.add(new ModelBox(tentacle, 17, 18, 0.0F, 0.0F, 1.75F, 0, 1, 1, 0.0F, false));
        this.tentacle.cubeList.add(new ModelBox(tentacle, 17, 17, 0.0F, 0.0F, 0.25F, 0, 1, 1, 0.0F, false));
        this.tentacle.cubeList.add(new ModelBox(tentacle, 20, 16, 0.0F, 0.0F, -1.25F, 0, 1, 1, 0.0F, false));
        this.tentacle.cubeList.add(new ModelBox(tentacle, 17, 18, 0.0F, 0.0F, -2.75F, 0, 1, 1, 0.0F, false));

        this.tentacle4 = new AdvancedModelRenderer(this);
        this.tentacle4.setRotationPoint(3.0F, -5.5F, 0.0F);
        this.main.addChild(tentacle4);
        this.setRotateAngle(tentacle4, 0.0F, 0.0F, -0.3927F);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 17, 18, 0.0F, 0.0F, 1.75F, 0, 1, 1, 0.0F, true));
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 17, 17, 0.0F, 0.0F, 0.25F, 0, 1, 1, 0.0F, true));
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 20, 16, 0.0F, 0.0F, -1.25F, 0, 1, 1, 0.0F, true));
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 17, 18, 0.0F, 0.0F, -2.75F, 0, 1, 1, 0.0F, true));

        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(0.0F, -5.5F, -3.0F);
        this.main.addChild(tentacle2);
        this.setRotateAngle(tentacle2, -2.138F, 0.0F, 0.0F);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 16, 19, 1.75F, 0.0F, 0.0F, 1, 0, 1, 0.0F, true));
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 16, 18, 0.25F, 0.0F, 0.0F, 1, 0, 1, 0.0F, true));
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 19, 17, -1.25F, 0.0F, 0.0F, 1, 0, 1, 0.0F, true));
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 16, 19, -2.75F, 0.0F, 0.0F, 1, 0, 1, 0.0F, true));

        this.tentacle3 = new AdvancedModelRenderer(this);
        this.tentacle3.setRotationPoint(0.0F, -5.5F, 3.0F);
        this.main.addChild(tentacle3);
        this.setRotateAngle(tentacle3, 2.138F, 0.0F, 0.0F);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 16, 19, 1.75F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 16, 18, 0.25F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 19, 17, -1.25F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 16, 19, -2.75F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.96F);

        this.main.render(f5);
        GlStateManager.disableBlend();

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

        //this.main.offsetY = 0.8F;
        this.main.setScaleX(1.0F);
        this.main.setScaleZ(1.0F);
        this.main.scaleChildren = false;
        AdvancedModelRenderer[] tentacle1 = {this.tentacle};
        AdvancedModelRenderer[] tentacle2 = {this.tentacle2};
        AdvancedModelRenderer[] tentacle3 = {this.tentacle3};
        AdvancedModelRenderer[] tentacle4 = {this.tentacle4};
        AdvancedModelRenderer[] arm1 = {this.tentA, this.tentA2};
        AdvancedModelRenderer[] arm2 = {this.tentA3, this.tentA4};
        AdvancedModelRenderer[] arm3 = {this.tentA5, this.tentA6};
        AdvancedModelRenderer[] arm4 = {this.tentA7, this.tentA8};
        float speed = 0.2F;
        if (!e.isInWater()) {
            speed = 0.0F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.swing(main, speed * 0.4F, 0.2F, true, 0, 0, f2, 1);
            this.walk(main, speed * 0.3F, 0.3F, true, 0, 0, f2, 1);
            this.flap(main, speed * 0.2F, 0.3F, true, 0, 0, f2, 1);
            this.chainFlap(tentacle1, speed, 0.4F, -3, f2, 1);
            this.chainWave(tentacle2, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle3, speed, 0.4F, -3, f2, 1);
            this.chainFlap(tentacle4, speed, -0.4F, -3, f2, 1);
            this.chainWave(arm1, speed, 0.25F, -3, f2, 1);
            this.chainWave(arm2, speed, 0.25F, -3, f2, 1);
            this.chainWave(arm3, speed, -0.25F, -3, f2, 1);
            this.chainWave(arm4, speed, -0.25F, -3, f2, 1);
            this.bob(main, -speed * 0.5F, 1F, false, f2, 1);

            if (!e.isInWater()) {
                this.resetToDefaultPose();
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.1F;
                this.main.scaleChildren = true;
                this.main.setScaleX(0.2F);
                this.main.setScaleZ(1.2F);
            }
        }
    }
}
