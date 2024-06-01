package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;

public class ModelOctomedusa extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer octomedusa;
    private final AdvancedModelRenderer OctotBase;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Octot;
    private final AdvancedModelRenderer Octotb;
    private final AdvancedModelRenderer OctotBase8;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Octot8;
    private final AdvancedModelRenderer Octotb8;
    private final AdvancedModelRenderer OctotBase2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Octot2;
    private final AdvancedModelRenderer Octotb2;
    private final AdvancedModelRenderer OctotBase7;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Octot7;
    private final AdvancedModelRenderer Octotb7;
    private final AdvancedModelRenderer OctotBase3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Octot3;
    private final AdvancedModelRenderer Octotb3;
    private final AdvancedModelRenderer OctotBase6;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Octot6;
    private final AdvancedModelRenderer Octotb6;
    private final AdvancedModelRenderer OctotBase4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Octot4;
    private final AdvancedModelRenderer Octotb4;
    private final AdvancedModelRenderer OctotBase5;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Octot5;
    private final AdvancedModelRenderer Octotb5;

    public ModelOctomedusa() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -4.0F, -4.0F, -4.0F, 8, 1, 8, 0.0F, false));

        this.octomedusa = new AdvancedModelRenderer(this);
        this.octomedusa.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.main.addChild(octomedusa);
        this.octomedusa.cubeList.add(new ModelBox(octomedusa, 0, 10, -3.0F, -5.5F, -3.0F, 6, 1, 6, 0.0F, false));

        this.OctotBase = new AdvancedModelRenderer(this);
        this.OctotBase.setRotationPoint(4.0F, -5.0F, -2.0F);
        this.octomedusa.addChild(OctotBase);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.OctotBase.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.6109F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Octot = new AdvancedModelRenderer(this);
        this.Octot.setRotationPoint(0.425F, 1.0F, 0.0F);
        this.OctotBase.addChild(Octot);
        this.setRotateAngle(Octot, 0.0F, 0.0F, -0.5672F);
        this.Octot.cubeList.add(new ModelBox(Octot, 3, 3, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.Octotb = new AdvancedModelRenderer(this);
        this.Octotb.setRotationPoint(0.0F, 1.975F, -0.025F);
        this.Octot.addChild(Octotb);
        this.setRotateAngle(Octotb, 0.0F, 0.0F, 0.5672F);
        this.Octotb.cubeList.add(new ModelBox(Octotb, 0, 3, 0.0F, 0.0F, -0.475F, 0, 2, 1, 0.0F, false));

        this.OctotBase8 = new AdvancedModelRenderer(this);
        this.OctotBase8.setRotationPoint(-4.0F, -5.0F, -2.0F);
        this.octomedusa.addChild(OctotBase8);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.OctotBase8.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.6109F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, true));

        this.Octot8 = new AdvancedModelRenderer(this);
        this.Octot8.setRotationPoint(-0.425F, 1.0F, 0.0F);
        this.OctotBase8.addChild(Octot8);
        this.setRotateAngle(Octot8, 0.0F, 0.0F, 0.5672F);
        this.Octot8.cubeList.add(new ModelBox(Octot8, 3, 3, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.Octotb8 = new AdvancedModelRenderer(this);
        this.Octotb8.setRotationPoint(0.0F, 1.975F, -0.025F);
        this.Octot8.addChild(Octotb8);
        this.setRotateAngle(Octotb8, 0.0F, 0.0F, -0.5672F);
        this.Octotb8.cubeList.add(new ModelBox(Octotb8, 0, 3, 0.0F, 0.0F, -0.475F, 0, 2, 1, 0.0F, true));

        this.OctotBase2 = new AdvancedModelRenderer(this);
        this.OctotBase2.setRotationPoint(4.0F, -5.0F, 2.0F);
        this.octomedusa.addChild(OctotBase2);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.OctotBase2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.6109F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Octot2 = new AdvancedModelRenderer(this);
        this.Octot2.setRotationPoint(0.425F, 1.0F, 0.0F);
        this.OctotBase2.addChild(Octot2);
        this.setRotateAngle(Octot2, 0.0F, 0.0F, -0.5672F);
        this.Octot2.cubeList.add(new ModelBox(Octot2, 3, 3, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.Octotb2 = new AdvancedModelRenderer(this);
        this.Octotb2.setRotationPoint(0.0F, 1.975F, -0.025F);
        this.Octot2.addChild(Octotb2);
        this.setRotateAngle(Octotb2, 0.0F, 0.0F, 0.5672F);
        this.Octotb2.cubeList.add(new ModelBox(Octotb2, 0, 3, 0.0F, 0.0F, -0.475F, 0, 2, 1, 0.0F, false));

        this.OctotBase7 = new AdvancedModelRenderer(this);
        this.OctotBase7.setRotationPoint(-4.0F, -5.0F, 2.0F);
        this.octomedusa.addChild(OctotBase7);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.OctotBase7.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.6109F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, true));

        this.Octot7 = new AdvancedModelRenderer(this);
        this.Octot7.setRotationPoint(-0.425F, 1.0F, 0.0F);
        this.OctotBase7.addChild(Octot7);
        this.setRotateAngle(Octot7, 0.0F, 0.0F, 0.5672F);
        this.Octot7.cubeList.add(new ModelBox(Octot7, 3, 3, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.Octotb7 = new AdvancedModelRenderer(this);
        this.Octotb7.setRotationPoint(0.0F, 1.975F, -0.025F);
        this.Octot7.addChild(Octotb7);
        this.setRotateAngle(Octotb7, 0.0F, 0.0F, -0.5672F);
        this.Octotb7.cubeList.add(new ModelBox(Octotb7, 0, 3, 0.0F, 0.0F, -0.475F, 0, 2, 1, 0.0F, true));

        this.OctotBase3 = new AdvancedModelRenderer(this);
        this.OctotBase3.setRotationPoint(2.0F, -5.0F, 4.0F);
        this.octomedusa.addChild(OctotBase3);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.OctotBase3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.5708F, -0.9599F, 1.5708F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Octot3 = new AdvancedModelRenderer(this);
        this.Octot3.setRotationPoint(0.0F, 1.0F, 0.5F);
        this.OctotBase3.addChild(Octot3);
        this.setRotateAngle(Octot3, 0.5672F, 0.0F, 0.0F);
        this.Octot3.cubeList.add(new ModelBox(Octot3, 3, 4, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.Octotb3 = new AdvancedModelRenderer(this);
        this.Octotb3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Octot3.addChild(Octotb3);
        this.setRotateAngle(Octotb3, -0.5672F, 0.0F, 0.0F);
        this.Octotb3.cubeList.add(new ModelBox(Octotb3, 0, 4, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.OctotBase6 = new AdvancedModelRenderer(this);
        this.OctotBase6.setRotationPoint(2.0F, -5.0F, -4.0F);
        this.octomedusa.addChild(OctotBase6);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.OctotBase6.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.5708F, 0.9599F, 1.5708F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Octot6 = new AdvancedModelRenderer(this);
        this.Octot6.setRotationPoint(0.0F, 1.0F, -0.5F);
        this.OctotBase6.addChild(Octot6);
        this.setRotateAngle(Octot6, -0.5672F, 0.0F, 0.0F);
        this.Octot6.cubeList.add(new ModelBox(Octot6, 3, 4, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.Octotb6 = new AdvancedModelRenderer(this);
        this.Octotb6.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Octot6.addChild(Octotb6);
        this.setRotateAngle(Octotb6, 0.5672F, 0.0F, 0.0F);
        this.Octotb6.cubeList.add(new ModelBox(Octotb6, 0, 4, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.OctotBase4 = new AdvancedModelRenderer(this);
        this.OctotBase4.setRotationPoint(-2.0F, -5.0F, 4.0F);
        this.octomedusa.addChild(OctotBase4);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.OctotBase4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.5708F, -0.9599F, 1.5708F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Octot4 = new AdvancedModelRenderer(this);
        this.Octot4.setRotationPoint(0.0F, 1.0F, 0.5F);
        this.OctotBase4.addChild(Octot4);
        this.setRotateAngle(Octot4, 0.5672F, 0.0F, 0.0F);
        this.Octot4.cubeList.add(new ModelBox(Octot4, 3, 4, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.Octotb4 = new AdvancedModelRenderer(this);
        this.Octotb4.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Octot4.addChild(Octotb4);
        this.setRotateAngle(Octotb4, -0.5672F, 0.0F, 0.0F);
        this.Octotb4.cubeList.add(new ModelBox(Octotb4, 0, 4, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.OctotBase5 = new AdvancedModelRenderer(this);
        this.OctotBase5.setRotationPoint(-2.0F, -5.0F, -4.0F);
        this.octomedusa.addChild(OctotBase5);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.OctotBase5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.5708F, 0.9599F, 1.5708F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Octot5 = new AdvancedModelRenderer(this);
        this.Octot5.setRotationPoint(0.0F, 1.0F, -0.5F);
        this.OctotBase5.addChild(Octot5);
        this.setRotateAngle(Octot5, -0.5672F, 0.0F, 0.0F);
        this.Octot5.cubeList.add(new ModelBox(Octot5, 3, 4, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.Octotb5 = new AdvancedModelRenderer(this);
        this.Octotb5.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Octot5.addChild(Octotb5);
        this.setRotateAngle(Octotb5, 0.5672F, 0.0F, 0.0F);
        this.Octotb5.cubeList.add(new ModelBox(Octotb5, 0, 4, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

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
        AdvancedModelRenderer[] tentacle1 = {this.OctotBase, this.Octot, this.Octotb};
        AdvancedModelRenderer[] tentacle2 = {this.OctotBase2, this.Octot2, this.Octotb2};
        AdvancedModelRenderer[] tentacle3 = {this.OctotBase3, this.Octot3, this.Octotb3};
        AdvancedModelRenderer[] tentacle4 = {this.OctotBase4, this.Octot4, this.Octotb4};
        AdvancedModelRenderer[] tentacle5 = {this.OctotBase5, this.Octot5, this.Octotb5};
        AdvancedModelRenderer[] tentacle6 = {this.OctotBase6, this.Octot6, this.Octotb6};
        AdvancedModelRenderer[] tentacle7 = {this.OctotBase7, this.Octot7, this.Octotb7};
        AdvancedModelRenderer[] tentacle8 = {this.OctotBase8, this.Octot8, this.Octotb8};
        float speed = 0.1F;
        if (!e.isInWater()) {
            speed = 0.0F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            //this.swing(main, speed * 0.4F, 0.3F, true, 0, 0, f2, 1);
            this.walk(main, speed * 0.3F, 0.3F, true, 0, 0, f2, 1);
            this.flap(main, speed * 0.2F, 0.3F, true, 0, 0, f2, 1);
            this.chainFlap(tentacle1, speed, -0.4F, -3, f2, 1);
            this.chainFlap(tentacle2, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle3, speed, 0.4F, -3, f2, 1);
            this.chainWave(tentacle4, speed, 0.4F, -3, f2, 1);
            this.chainWave(tentacle5, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle6, speed, -0.4F, -3, f2, 1);
            this.chainFlap(tentacle7, speed, 0.4F, -3, f2, 1);
            this.chainFlap(tentacle8, speed, 0.4F, -3, f2, 1);
            this.bob(main, -speed * 0.5F, 1F, false, f2, 1);

            if (!e.isInWater()) {
                this.resetToDefaultPose();
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                //this.main.offsetY = 1.2F;
                this.main.scaleChildren = true;
                this.main.setScaleX(0.2F);
                this.main.setScaleZ(1.2F);
            }
        }
    }
}
