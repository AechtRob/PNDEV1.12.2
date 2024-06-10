package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;

public class ModelPlectodiscus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer tentacle;
    private final AdvancedModelRenderer tentacles;
    private final AdvancedModelRenderer tentacle5;
    private final AdvancedModelRenderer tentacles5;
    private final AdvancedModelRenderer tentacle6;
    private final AdvancedModelRenderer tentacles6;
    private final AdvancedModelRenderer tentacle4;
    private final AdvancedModelRenderer tentacles4;
    private final AdvancedModelRenderer tentacle9;
    private final AdvancedModelRenderer tentacles9;
    private final AdvancedModelRenderer tentacle10;
    private final AdvancedModelRenderer tentacles10;
    private final AdvancedModelRenderer tentacle15;
    private final AdvancedModelRenderer tentacles15;
    private final AdvancedModelRenderer tentacle16;
    private final AdvancedModelRenderer tentacles16;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer tentacles2;
    private final AdvancedModelRenderer tentacle11;
    private final AdvancedModelRenderer tentacles11;
    private final AdvancedModelRenderer tentacle12;
    private final AdvancedModelRenderer tentacles12;
    private final AdvancedModelRenderer tentacle3;
    private final AdvancedModelRenderer tentacles3;
    private final AdvancedModelRenderer tentacle7;
    private final AdvancedModelRenderer tentacles7;
    private final AdvancedModelRenderer tentacle8;
    private final AdvancedModelRenderer tentacles8;
    private final AdvancedModelRenderer tentacle13;
    private final AdvancedModelRenderer tentacles13;
    private final AdvancedModelRenderer tentacle14;
    private final AdvancedModelRenderer tentacles14;

    public ModelPlectodiscus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 16, 21, -2.0F, -1.0F, 4.0F, 4, 1, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 12, -4.0F, -1.0F, -4.0F, 8, 1, 8, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -5.0F, -1.0F, -2.0F, 1, 1, 4, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -6.0F, -0.075F, -6.0F, 12, 0, 12, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 16, 23, -2.0F, -1.0F, -5.0F, 4, 1, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 7, 4.0F, -1.0F, -2.0F, 1, 1, 4, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -0.5F, -2.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 13, 0.0F, -6.0F, -4.0F, 0, 5, 8, 0.0F, false));

        this.tentacle = new AdvancedModelRenderer(this);
        this.tentacle.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Body.addChild(tentacle);
        this.tentacle.cubeList.add(new ModelBox(tentacle, 24, 13, -2.5F, 0.0F, 0.0F, 5, 1, 0, 0.0F, false));

        this.tentacles = new AdvancedModelRenderer(this);
        this.tentacles.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacle.addChild(tentacles);
        this.tentacles.cubeList.add(new ModelBox(tentacles, 24, 12, -2.5F, 0.0F, 0.0F, 5, 1, 0, 0.0F, false));

        this.tentacle5 = new AdvancedModelRenderer(this);
        this.tentacle5.setRotationPoint(-1.0F, 0.0F, -3.0F);
        this.Body.addChild(tentacle5);
        this.tentacle5.cubeList.add(new ModelBox(tentacle5, 24, 13, -2.5F, 0.0F, 0.0F, 5, 1, 0, 0.0F, false));

        this.tentacles5 = new AdvancedModelRenderer(this);
        this.tentacles5.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacle5.addChild(tentacles5);
        this.tentacles5.cubeList.add(new ModelBox(tentacles5, 24, 12, -2.5F, 0.0F, 0.0F, 5, 1, 0, 0.0F, false));

        this.tentacle6 = new AdvancedModelRenderer(this);
        this.tentacle6.setRotationPoint(1.0F, 0.0F, -2.0F);
        this.Body.addChild(tentacle6);
        this.tentacle6.cubeList.add(new ModelBox(tentacle6, 24, 13, -2.5F, 0.0F, 0.0F, 5, 1, 0, 0.0F, false));

        this.tentacles6 = new AdvancedModelRenderer(this);
        this.tentacles6.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacle6.addChild(tentacles6);
        this.tentacles6.cubeList.add(new ModelBox(tentacles6, 24, 12, -2.5F, 0.0F, 0.0F, 5, 1, 0, 0.0F, false));

        this.tentacle4 = new AdvancedModelRenderer(this);
        this.tentacle4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body.addChild(tentacle4);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 24, 13, -2.5F, 0.0F, 0.0F, 5, 1, 0, 0.0F, true));

        this.tentacles4 = new AdvancedModelRenderer(this);
        this.tentacles4.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacle4.addChild(tentacles4);
        this.tentacles4.cubeList.add(new ModelBox(tentacles4, 24, 12, -2.5F, 0.0F, 0.0F, 5, 1, 0, 0.0F, true));

        this.tentacle9 = new AdvancedModelRenderer(this);
        this.tentacle9.setRotationPoint(1.0F, 0.0F, 3.0F);
        this.Body.addChild(tentacle9);
        this.tentacle9.cubeList.add(new ModelBox(tentacle9, 24, 13, -2.5F, 0.0F, 0.0F, 5, 1, 0, 0.0F, true));

        this.tentacles9 = new AdvancedModelRenderer(this);
        this.tentacles9.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacle9.addChild(tentacles9);
        this.tentacles9.cubeList.add(new ModelBox(tentacles9, 24, 12, -2.5F, 0.0F, 0.0F, 5, 1, 0, 0.0F, true));

        this.tentacle10 = new AdvancedModelRenderer(this);
        this.tentacle10.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body.addChild(tentacle10);
        this.tentacle10.cubeList.add(new ModelBox(tentacle10, 24, 13, -2.5F, 0.0F, 0.0F, 5, 1, 0, 0.0F, true));

        this.tentacles10 = new AdvancedModelRenderer(this);
        this.tentacles10.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacle10.addChild(tentacles10);
        this.tentacles10.cubeList.add(new ModelBox(tentacles10, 24, 12, -2.5F, 0.0F, 0.0F, 5, 1, 0, 0.0F, true));

        this.tentacle15 = new AdvancedModelRenderer(this);
        this.tentacle15.setRotationPoint(-0.25F, 0.0F, -1.0F);
        this.Body.addChild(tentacle15);
        this.tentacle15.cubeList.add(new ModelBox(tentacle15, 6, 31, -1.5F, 0.0F, 0.0F, 3, 1, 0, 0.0F, true));

        this.tentacles15 = new AdvancedModelRenderer(this);
        this.tentacles15.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacle15.addChild(tentacles15);
        this.tentacles15.cubeList.add(new ModelBox(tentacles15, 6, 30, -1.5F, 0.0F, 0.0F, 3, 1, 0, 0.0F, true));

        this.tentacle16 = new AdvancedModelRenderer(this);
        this.tentacle16.setRotationPoint(0.25F, 0.0F, 1.0F);
        this.Body.addChild(tentacle16);
        this.tentacle16.cubeList.add(new ModelBox(tentacle16, 6, 31, -1.5F, 0.0F, 0.0F, 3, 1, 0, 0.0F, true));

        this.tentacles16 = new AdvancedModelRenderer(this);
        this.tentacles16.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacle16.addChild(tentacles16);
        this.tentacles16.cubeList.add(new ModelBox(tentacles16, 6, 30, -1.5F, 0.0F, 0.0F, 3, 1, 0, 0.0F, true));

        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.Body.addChild(tentacle2);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 0, 1, 0.0F, 0.0F, -2.5F, 0, 1, 5, 0.0F, false));

        this.tentacles2 = new AdvancedModelRenderer(this);
        this.tentacles2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacle2.addChild(tentacles2);
        this.tentacles2.cubeList.add(new ModelBox(tentacles2, 0, 0, 0.0F, 0.0F, -2.5F, 0, 1, 5, 0.0F, false));

        this.tentacle11 = new AdvancedModelRenderer(this);
        this.tentacle11.setRotationPoint(-3.0F, 0.0F, 1.0F);
        this.Body.addChild(tentacle11);
        this.tentacle11.cubeList.add(new ModelBox(tentacle11, 0, 1, 0.0F, 0.0F, -2.5F, 0, 1, 5, 0.0F, false));

        this.tentacles11 = new AdvancedModelRenderer(this);
        this.tentacles11.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacle11.addChild(tentacles11);
        this.tentacles11.cubeList.add(new ModelBox(tentacles11, 0, 0, 0.0F, 0.0F, -2.5F, 0, 1, 5, 0.0F, false));

        this.tentacle12 = new AdvancedModelRenderer(this);
        this.tentacle12.setRotationPoint(-2.0F, 0.0F, -1.0F);
        this.Body.addChild(tentacle12);
        this.tentacle12.cubeList.add(new ModelBox(tentacle12, 0, 1, 0.0F, 0.0F, -2.5F, 0, 1, 5, 0.0F, false));

        this.tentacles12 = new AdvancedModelRenderer(this);
        this.tentacles12.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacle12.addChild(tentacles12);
        this.tentacles12.cubeList.add(new ModelBox(tentacles12, 0, 0, 0.0F, 0.0F, -2.5F, 0, 1, 5, 0.0F, false));

        this.tentacle3 = new AdvancedModelRenderer(this);
        this.tentacle3.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.Body.addChild(tentacle3);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 0, 1, 0.0F, 0.0F, -2.5F, 0, 1, 5, 0.0F, true));

        this.tentacles3 = new AdvancedModelRenderer(this);
        this.tentacles3.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacle3.addChild(tentacles3);
        this.tentacles3.cubeList.add(new ModelBox(tentacles3, 0, 0, 0.0F, 0.0F, -2.5F, 0, 1, 5, 0.0F, true));

        this.tentacle7 = new AdvancedModelRenderer(this);
        this.tentacle7.setRotationPoint(3.0F, 0.0F, -1.0F);
        this.Body.addChild(tentacle7);
        this.tentacle7.cubeList.add(new ModelBox(tentacle7, 0, 1, 0.0F, 0.0F, -2.5F, 0, 1, 5, 0.0F, true));

        this.tentacles7 = new AdvancedModelRenderer(this);
        this.tentacles7.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacle7.addChild(tentacles7);
        this.tentacles7.cubeList.add(new ModelBox(tentacles7, 0, 0, 0.0F, 0.0F, -2.5F, 0, 1, 5, 0.0F, true));

        this.tentacle8 = new AdvancedModelRenderer(this);
        this.tentacle8.setRotationPoint(2.0F, 0.0F, 1.0F);
        this.Body.addChild(tentacle8);
        this.tentacle8.cubeList.add(new ModelBox(tentacle8, 0, 1, 0.0F, 0.0F, -2.5F, 0, 1, 5, 0.0F, true));

        this.tentacles8 = new AdvancedModelRenderer(this);
        this.tentacles8.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacle8.addChild(tentacles8);
        this.tentacles8.cubeList.add(new ModelBox(tentacles8, 0, 0, 0.0F, 0.0F, -2.5F, 0, 1, 5, 0.0F, true));

        this.tentacle13 = new AdvancedModelRenderer(this);
        this.tentacle13.setRotationPoint(0.75F, 0.0F, -0.5F);
        this.Body.addChild(tentacle13);
        this.tentacle13.cubeList.add(new ModelBox(tentacle13, 0, 28, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, true));

        this.tentacles13 = new AdvancedModelRenderer(this);
        this.tentacles13.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacle13.addChild(tentacles13);
        this.tentacles13.cubeList.add(new ModelBox(tentacles13, 0, 27, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, true));

        this.tentacle14 = new AdvancedModelRenderer(this);
        this.tentacle14.setRotationPoint(-1.0F, 0.0F, 0.5F);
        this.Body.addChild(tentacle14);
        this.tentacle14.cubeList.add(new ModelBox(tentacle14, 0, 28, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, false));

        this.tentacles14 = new AdvancedModelRenderer(this);
        this.tentacles14.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacle14.addChild(tentacles14);
        this.tentacles14.cubeList.add(new ModelBox(tentacles14, 0, 27, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.94F);

        this.Body.render(f5);
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
        this.Body.setScaleX(1.0F);
        this.Body.setScaleZ(1.0F);
        this.Body.scaleChildren = false;
        this.Body.offsetY = 0.30F;

        AdvancedModelRenderer[] tentacleF1 = {this.tentacle, this.tentacles};
        AdvancedModelRenderer[] tentacleF2 = {this.tentacle2, this.tentacles2};
        AdvancedModelRenderer[] tentacleF3 = {this.tentacle3, this.tentacles3};
        AdvancedModelRenderer[] tentacleF4 = {this.tentacle4, this.tentacles4};
        AdvancedModelRenderer[] tentacleF5 = {this.tentacle5, this.tentacles5};
        AdvancedModelRenderer[] tentacleF6 = {this.tentacle6, this.tentacles6};
        AdvancedModelRenderer[] tentacleF7 = {this.tentacle7, this.tentacles7};
        AdvancedModelRenderer[] tentacleF8 = {this.tentacle8, this.tentacles8};
        AdvancedModelRenderer[] tentacleF9 = {this.tentacle9, this.tentacles9};
        AdvancedModelRenderer[] tentacleF10 = {this.tentacle10, this.tentacles10};
        AdvancedModelRenderer[] tentacleF11 = {this.tentacle11, this.tentacles11};
        AdvancedModelRenderer[] tentacleF12 = {this.tentacle12, this.tentacles12};
        AdvancedModelRenderer[] tentacleF13 = {this.tentacle13, this.tentacles13};
        AdvancedModelRenderer[] tentacleF14 = {this.tentacle14, this.tentacles14};
        AdvancedModelRenderer[] tentacleF15 = {this.tentacles15, this.tentacles15};
        AdvancedModelRenderer[] tentacleF16 = {this.tentacles16, this.tentacles16};

        float speed = 0.088F;
        if (!e.isInWater()) {
            speed = 0.0F;
        }
        else {
            //pulsations:
            this.Body.scaleChildren = false;
            float floatPulsate = this.moveBox(0.10F, 0.08F, false, f2, 1);
            //System.err.println("pulsate: " + floatPulsate);
            this.Body.setScale(1-floatPulsate, 1, 1-floatPulsate);
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.swing(Body, speed * 0.22F, 0.20F, true, 0, 0, f2, 1);
            //this.walk(Body, speed * 0.3F, 0.025F, true, 0, 0, f2, 1);
            //this.flap(Body, speed * 0.2F, 0.025F, true, 0, 0, f2, 1);

            this.chainFlap(tentacleF2, speed, 0.75F, -3, f2, 1);
            this.chainFlap(tentacleF3, speed, -0.75F, -3, f2, 1);

            this.chainFlap(tentacleF11, speed, 0.75F, -4, f2, 1);
            this.chainFlap(tentacleF7, speed, -0.75F, -4, f2, 1);

            this.chainFlap(tentacleF12, speed, 0.75F, -5, f2, 1);
            this.chainFlap(tentacleF8, speed, -0.75F, -5, f2, 1);

            this.chainFlap(tentacleF14, speed, 0.75F, -6, f2, 1);
            this.chainFlap(tentacleF13, speed, -0.75F, -6, f2, 1);


            this.chainWave(tentacleF4, speed, 0.75F, -3, f2, 1);
            this.chainWave(tentacleF1, speed, -0.75F, -3, f2, 1);

            this.chainWave(tentacleF9, speed, 0.75F, -4, f2, 1);
            this.chainWave(tentacleF5, speed, -0.75F, -4, f2, 1);

            this.chainWave(tentacleF10, speed, 0.75F, -5, f2, 1);
            this.chainWave(tentacleF6, speed, -0.75F, -5, f2, 1);

            this.chainWave(tentacleF16, speed, 0.75F, -6, f2, 1);
            this.chainWave(tentacleF15, speed, -0.75F, -6, f2, 1);


            this.bob(Body, -speed * 0.5F, 0.1F, false, f2, 1);

            if (!e.isInWater()) {
                this.resetToDefaultPose();
                this.Body.rotateAngleZ = (float) Math.toRadians(90);
                //this.Body.offsetY = 1.08F;
                this.Body.scaleChildren = true;
                this.Body.setScaleX(0.2F);
                this.Body.setScaleZ(1.2F);
            }
        }
    }
}
