package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMixosaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
//import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelMixosaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer Mixosaurus;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer ForelimbsL;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer ForelimbsR;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer HindlimbsL;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer HindlimbsR;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r20;

    private ModelAnimator animator;

    public ModelMixosaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Mixosaurus = new AdvancedModelRenderer(this);
        this.Mixosaurus.setRotationPoint(0.0F, 21.0F, 0.0F);


        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, -0.6F, -1.0F);
        this.Mixosaurus.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 15, 39, -2.0F, -2.8F, 0.1F, 4, 6, 2, -0.001F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 20, 48, 0.0F, -8.0F, 3.0F, 0, 4, 4, 0.0F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 15, 32, -2.0F, -4.2314F, 2.6588F, 4, 2, 4, 0.0F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 18, -3.0F, -2.8F, 2.0F, 6, 6, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.8F, 0.1F);
        this.Body1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.4887F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 46, -1.5F, 0.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.ForelimbsL = new AdvancedModelRenderer(this);
        this.ForelimbsL.setRotationPoint(2.8F, 1.9F, 2.7F);
        this.Body1.addChild(ForelimbsL);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ForelimbsL.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3079F, 0.3142F, -0.7711F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.5F, -0.1F, -0.7F, 0, 7, 3, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 52, -0.9F, -0.1F, -0.7F, 1, 2, 2, 0.0F, false));

        this.ForelimbsR = new AdvancedModelRenderer(this);
        this.ForelimbsR.setRotationPoint(-2.8F, 1.9F, 2.7F);
        this.Body1.addChild(ForelimbsR);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ForelimbsR.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3079F, -0.3142F, 0.7711F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.5F, -0.1F, -0.7F, 0, 7, 3, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 52, -0.1F, -0.1F, -0.7F, 1, 2, 2, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 13, 0, -2.5F, -2.8F, -1.0F, 5, 6, 5, -0.002F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -4.2F, 0.0F);
        this.Body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1396F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 8, -2.0F, -0.05F, 0.2F, 4, 2, 4, -0.001F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 21, 22, -2.0F, -2.0F, -1.0F, 4, 4, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.7F, 0.1F);
        this.Body3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2269F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 35, 18, -1.5F, 0.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 3.2F, 0.0F);
        this.Body3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 38, -1.5F, -2.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 34, 0, -1.5F, -1.9F, -1.0F, 3, 3, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 2.1F, -0.1F);
        this.Body4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3142F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 39, 42, -1.0F, -2.0F, -0.1F, 2, 2, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -2.8F, -0.1F);
        this.Body4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1571F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 50, 17, -1.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.HindlimbsL = new AdvancedModelRenderer(this);
        this.HindlimbsL.setRotationPoint(1.05F, 0.5F, 2.65F);
        this.Body4.addChild(HindlimbsL);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.45F, 0.4F, -0.05F);
        this.HindlimbsL.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.219F, -0.3286F, 0.6037F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 29, 0.0F, 0.1F, -0.5F, 3, 0, 2, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 4, 0, -1.0F, -0.4F, -0.5F, 2, 1, 1, 0.0F, false));

        this.HindlimbsR = new AdvancedModelRenderer(this);
        this.HindlimbsR.setRotationPoint(-1.05F, 0.5F, 2.65F);
        this.Body4.addChild(HindlimbsR);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.45F, 0.4F, -0.05F);
        this.HindlimbsR.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.219F, 0.3286F, -0.6037F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 9, 29, -3.0F, 0.1F, -0.5F, 3, 0, 2, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 4, 0, -1.0F, -0.4F, -0.5F, 2, 1, 1, 0.0F, true));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, -1.0F, 3.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 18, 12, -1.0F, -0.6F, -1.0F, 2, 2, 7, 0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Body5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 29, -0.5F, -2.0F, 0.0F, 1, 2, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.3F, -0.2F);
        this.Body5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1047F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 32, 32, -0.5F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.4F, 6.0F);
        this.Body5.addChild(Tail1);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 2.9F, 6.8F);
        this.Tail1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0175F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 50, 0, -0.5F, -0.9623F, -0.0664F, 1, 1, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 2.1F, 2.9F);
        this.Tail1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.192F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 9, 48, -0.5F, -1.9212F, -0.0854F, 1, 2, 4, -0.001F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Tail1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3491F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, 0.0F, -4.0F, -0.3F, 0, 5, 12, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 48, 45, -0.5F, 0.0F, -0.3F, 1, 2, 4, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.6F, -0.9F);
        this.Mixosaurus.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 40, 25, -1.5F, -0.9F, -3.0F, 3, 2, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 52, -1.0F, 0.1F, -6.0F, 2, 1, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 29, 52, 0.9F, 0.3F, -6.0F, 0, 1, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 42, 35, -0.5F, 0.1F, -11.0F, 1, 1, 5, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 44, 3, 0.4F, 0.3F, -11.0F, 0, 1, 5, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 29, 52, -0.9F, 0.3F, -6.0F, 0, 1, 3, 0.0F, true));
        this.Head.cubeList.add(new ModelBox(Head, 44, 3, -0.4F, 0.3F, -11.0F, 0, 1, 5, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.1F, -6.1F);
        this.Head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2618F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 7, 3, -0.5F, 0.05F, 0.0446F, 1, 1, 1, 0.001F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -1.4F, -2.6F);
        this.Head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.4712F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 45, -1.0F, -0.0002F, -0.971F, 2, 2, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -0.1F, -5.1F);
        this.Head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.4712F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 30, 15, -0.5F, 0.1772F, -0.0494F, 1, 1, 2, -0.001F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 28, 32, -0.5F, -0.0228F, -0.0494F, 1, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.4F, 7.0F);
        this.Head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1833F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 29, 0, -1.5F, 1.6616F, -9.3996F, 3, 1, 1, 0.03F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.1F, -0.1F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 28, 40, -1.5F, 0.0F, -2.9F, 3, 1, 4, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 51, 23, -1.0F, 0.0F, -5.9F, 2, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 52, 39, 0.8F, -0.2F, -5.9F, 0, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 42, 10, -0.5F, 0.0F, -10.9F, 1, 1, 5, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 33, 47, 0.3F, -0.2F, -10.9F, 0, 1, 5, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 33, 47, -0.3F, -0.2F, -10.9F, 0, 1, 5, 0.0F, true));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 52, 39, -0.8F, -0.2F, -5.9F, 0, 1, 3, 0.0F, true));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 50, 32, -1.5F, -2.0F, -2.0F, 3, 2, 2, -0.002F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.0F, -2.9F);
        this.Jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.2772F, -0.0069F, 0.013F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 50, 10, -1.0F, -1.1F, 0.4F, 2, 1, 3, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Mixosaurus.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Jaw.rotateAngleX = (float) Math.toRadians(10);
        this.Mixosaurus.rotateAngleY = (float) Math.toRadians(10);
        this.Mixosaurus.offsetZ = -0.151F;
        this.Mixosaurus.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        //this.Mixosaurus.offsetY = 1F;
        //this.Mixosaurus.offsetZ = 1.0F;

        AdvancedModelRenderer[] fishTail = {this.Body5, this.Tail1};
        AdvancedModelRenderer[] neckHead = {this.Head};

        float speed = 0.24F;
        EntityPrehistoricFloraMixosaurus ee = (EntityPrehistoricFloraMixosaurus) e;
        if (ee.getIsFast()) {
            speed = speed * 1.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.5F;
        }
        if (!e.isInWater()) {
            speed = 0.8F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        //if (e.isInWater()) {

         if(!e.isInWater()) {

             this.bob(Mixosaurus, -speed, 1.5F, false, f2, 1);

         }

         /*   if (!ee.getIsFast()) {
                this.chainSwing(fishTail, speed * still, 0.585F * still, -1.85, f2, 0.6F * still);
            } else {
                this.chainSwing(fishTail, speed * still, 0.855F * still, -1.55, f2, 0.6F * still);
            }
            */
        //Animation values need tweaking
        if(ee.getIsMoving()) {
            this.chainSwing(fishTail, speed, 0.3F, 0, f2, 1);
        }else{
            this.chainSwing(fishTail, speed, 0.1F, 0, f2, 1);
        }
        this.swing(Mixosaurus, speed, 0.1F, false, 0, 0, f2, 1);
        //this.walk(Jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.walk(ForelimbsL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.swing(ForelimbsL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.walk(ForelimbsR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.swing(ForelimbsR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.walk(HindlimbsL, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
        this.swing(HindlimbsL, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
        this.walk(HindlimbsR, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
        this.swing(HindlimbsR, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
        //}


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.Head, 0,0,-0.2F);
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.Head, 0,0,-0.2F);
        animator.rotate(this.Head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

