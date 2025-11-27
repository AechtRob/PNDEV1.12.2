package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraWukongopterus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelWukongopterus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended body1;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended upperlegL;
    private final AdvancedModelRendererExtended lowerlegL;
    private final AdvancedModelRendererExtended footL;
    private final AdvancedModelRendererExtended legwing11;
    private final AdvancedModelRendererExtended legwing12;
    private final AdvancedModelRendererExtended upperlegR;
    private final AdvancedModelRendererExtended lowerlegR;
    private final AdvancedModelRendererExtended footR;
    private final AdvancedModelRendererExtended legwing2;
    private final AdvancedModelRendererExtended legwing3;
    private final AdvancedModelRendererExtended wingright1;
    private final AdvancedModelRendererExtended wingright2;
    private final AdvancedModelRendererExtended wingrightmembrane;
    private final AdvancedModelRendererExtended wingright3;
    private final AdvancedModelRendererExtended wingrightmembranemiddle;
    private final AdvancedModelRendererExtended wingright4;
    private final AdvancedModelRendererExtended wingrightmembraneend;
    private final AdvancedModelRendererExtended handL;
    private final AdvancedModelRendererExtended wingleft1;
    private final AdvancedModelRendererExtended wingleft2;
    private final AdvancedModelRendererExtended wingleftmembrane;
    private final AdvancedModelRendererExtended wingleft3;
    private final AdvancedModelRendererExtended wingleftmembranemiddle;
    private final AdvancedModelRendererExtended wingleft4;
    private final AdvancedModelRendererExtended wingleftmembraneend;
    private final AdvancedModelRendererExtended handR;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended wukong;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended wukong2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended head2;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended head3;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended jaw2;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;

    private ModelAnimator animator;

    public ModelWukongopterus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.0F, 12.5F, -5.7F);
        this.root.addChild(chest);
        this.setRotateAngle(chest, -0.0892F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 0, 33, -3.5F, -2.0F, -2.0F, 7, 7, 6, 0.0F, false));

        this.body1 = new AdvancedModelRendererExtended(this);
        this.body1.setRotationPoint(0.0F, 0.3F, 3.2F);
        this.chest.addChild(body1);
        this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 28, 25, -2.5F, -2.0F, 0.0F, 5, 6, 8, 0.0F, false));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, -0.075F, 6.8F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, -0.0456F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 49, 50, -1.5F, -1.4545F, 0.001F, 3, 4, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.4455F, 5.601F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0456F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 36, 0, -1.0F, -1.0F, 0.0F, 2, 2, 11, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, -0.075F, 10.4F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0456F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 48, -0.5F, -0.5F, 0.0F, 1, 1, 9, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 8.7F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0456F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 48, 30, -0.5F, -0.5F, 0.0F, 1, 1, 9, 0.01F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 8.4F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0456F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 36, 39, -0.5F, -0.5F, 0.0F, 1, 1, 10, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 26, 10, 0.0F, -1.5F, 2.0F, 0, 3, 11, 0.0F, false));

        this.upperlegL = new AdvancedModelRendererExtended(this);
        this.upperlegL.setRotationPoint(-2.0F, 0.55F, 5.4F);
        this.body1.addChild(upperlegL);
        this.setRotateAngle(upperlegL, -0.3206F, 0.0F, 0.5009F);
        this.upperlegL.cubeList.add(new ModelBox(upperlegL, 20, 33, -1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.lowerlegL = new AdvancedModelRendererExtended(this);
        this.lowerlegL.setRotationPoint(-0.1F, 3.7F, -0.3F);
        this.upperlegL.addChild(lowerlegL);
        this.setRotateAngle(lowerlegL, 0.7741F, 0.0F, -0.5463F);
        this.lowerlegL.cubeList.add(new ModelBox(lowerlegL, 36, 0, -0.5F, -0.2F, -0.5F, 1, 7, 1, 0.0F, false));

        this.footL = new AdvancedModelRendererExtended(this);
        this.footL.setRotationPoint(0.0F, 6.6F, -0.3F);
        this.lowerlegL.addChild(footL);
        this.setRotateAngle(footL, -0.4098F, 0.5918F, -0.2276F);
        this.footL.cubeList.add(new ModelBox(footL, 22, 11, -1.0F, -0.5F, -3.0F, 2, 1, 4, 0.0F, false));

        this.legwing11 = new AdvancedModelRendererExtended(this);
        this.legwing11.setRotationPoint(-0.1F, 0.2F, 0.4F);
        this.lowerlegL.addChild(legwing11);
        this.setRotateAngle(legwing11, -0.0911F, 0.0F, 0.0F);
        this.legwing11.cubeList.add(new ModelBox(legwing11, 26, 0, 0.0F, 0.0F, 0.0F, 0, 6, 3, 0.001F, false));

        this.legwing12 = new AdvancedModelRendererExtended(this);
        this.legwing12.setRotationPoint(-0.3F, 0.0F, 0.9F);
        this.upperlegL.addChild(legwing12);
        this.legwing12.cubeList.add(new ModelBox(legwing12, 0, 20, -0.5F, 0.0F, 0.0F, 1, 4, 3, 0.0F, false));

        this.upperlegR = new AdvancedModelRendererExtended(this);
        this.upperlegR.setRotationPoint(2.0F, 0.55F, 5.4F);
        this.body1.addChild(upperlegR);
        this.setRotateAngle(upperlegR, -0.3206F, 0.0F, -0.5009F);
        this.upperlegR.cubeList.add(new ModelBox(upperlegR, 20, 33, -1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F, true));

        this.lowerlegR = new AdvancedModelRendererExtended(this);
        this.lowerlegR.setRotationPoint(0.1F, 3.7F, -0.3F);
        this.upperlegR.addChild(lowerlegR);
        this.setRotateAngle(lowerlegR, 0.7741F, 0.0F, 0.5463F);
        this.lowerlegR.cubeList.add(new ModelBox(lowerlegR, 36, 0, -0.5F, -0.2F, -0.5F, 1, 7, 1, 0.0F, true));

        this.footR = new AdvancedModelRendererExtended(this);
        this.footR.setRotationPoint(0.0F, 6.6F, -0.3F);
        this.lowerlegR.addChild(footR);
        this.setRotateAngle(footR, -0.4098F, -0.5918F, 0.2276F);
        this.footR.cubeList.add(new ModelBox(footR, 22, 11, -1.0F, -0.5F, -3.0F, 2, 1, 4, 0.0F, true));

        this.legwing2 = new AdvancedModelRendererExtended(this);
        this.legwing2.setRotationPoint(0.1F, 0.2F, 0.4F);
        this.lowerlegR.addChild(legwing2);
        this.setRotateAngle(legwing2, -0.0911F, 0.0F, 0.0F);
        this.legwing2.cubeList.add(new ModelBox(legwing2, 26, 0, 0.0F, 0.0F, 0.0F, 0, 6, 3, 0.001F, true));

        this.legwing3 = new AdvancedModelRendererExtended(this);
        this.legwing3.setRotationPoint(0.3F, 0.0F, 0.9F);
        this.upperlegR.addChild(legwing3);
        this.legwing3.cubeList.add(new ModelBox(legwing3, 0, 20, -0.5F, 0.0F, 0.0F, 1, 4, 3, 0.0F, true));

        this.wingright1 = new AdvancedModelRendererExtended(this);
        this.wingright1.setRotationPoint(-2.1F, -0.2F, -1.6F);
        this.chest.addChild(wingright1);
        this.setRotateAngle(wingright1, 0.0429F, 0.0359F, 0.1006F);
        this.wingright1.cubeList.add(new ModelBox(wingright1, 0, 21, -6.0F, -1.0F, -1.0F, 8, 2, 10, 0.0F, false));

        this.wingright2 = new AdvancedModelRendererExtended(this);
        this.wingright2.setRotationPoint(-5.2F, 0.1F, -0.7F);
        this.wingright1.addChild(wingright2);
        this.wingright2.cubeList.add(new ModelBox(wingright2, 18, 0, -0.5F, 0.0F, 0.0F, 1, 12, 3, 0.0F, false));

        this.wingrightmembrane = new AdvancedModelRendererExtended(this);
        this.wingrightmembrane.setRotationPoint(9.3F, 11.6F, 7.0F);
        this.wingright2.addChild(wingrightmembrane);
        this.wingrightmembrane.cubeList.add(new ModelBox(wingrightmembrane, 37, 50, -9.8F, -11.6F, -4.0F, 1, 12, 5, 0.0F, false));

        this.wingright3 = new AdvancedModelRendererExtended(this);
        this.wingright3.setRotationPoint(-0.1F, 12.05F, 0.3F);
        this.wingright2.addChild(wingright3);
        this.setRotateAngle(wingright3, 0.0F, 0.0F, 0.0F);
        this.wingright3.cubeList.add(new ModelBox(wingright3, 17, 45, -0.5F, -3.0F, 0.0F, 1, 3, 9, 0.0F, false));

        this.wingrightmembranemiddle = new AdvancedModelRendererExtended(this);
        this.wingrightmembranemiddle.setRotationPoint(9.4F, -0.4F, 6.7F);
        this.wingright3.addChild(wingrightmembranemiddle);
        this.wingrightmembranemiddle.cubeList.add(new ModelBox(wingrightmembranemiddle, 46, 15, -9.9F, -5.575F, -6.7F, 1, 3, 9, -0.01F, false));

        this.wingright4 = new AdvancedModelRendererExtended(this);
        this.wingright4.setRotationPoint(0.1F, 0.0F, 8.7F);
        this.wingright3.addChild(wingright4);
        this.setRotateAngle(wingright4, 0.9599F, 0.0F, 0.0F);
        this.wingright4.cubeList.add(new ModelBox(wingright4, 18, 3, -0.5F, -2.0F, 0.0F, 1, 2, 16, 0.0F, false));

        this.wingrightmembraneend = new AdvancedModelRendererExtended(this);
        this.wingrightmembraneend.setRotationPoint(9.3F, -0.4F, -4.0F);
        this.wingright4.addChild(wingrightmembraneend);
        this.wingrightmembraneend.cubeList.add(new ModelBox(wingrightmembraneend, 0, 0, -9.8F, -4.575F, 4.0F, 1, 3, 16, -0.01F, false));

        this.handL = new AdvancedModelRendererExtended(this);
        this.handL.setRotationPoint(0.0F, -0.4F, 0.0F);
        this.wingright3.addChild(handL);
        this.handL.cubeList.add(new ModelBox(handL, 0, 27, -1.5F, -0.5F, 0.2F, 2, 1, 3, 0.0F, false));

        this.wingleft1 = new AdvancedModelRendererExtended(this);
        this.wingleft1.setRotationPoint(2.1F, -0.2F, -1.6F);
        this.chest.addChild(wingleft1);
        this.setRotateAngle(wingleft1, 0.0429F, 0.0359F, -0.0911F);
        this.wingleft1.cubeList.add(new ModelBox(wingleft1, 0, 21, -2.0F, -1.0F, -1.0F, 8, 2, 10, 0.0F, true));

        this.wingleft2 = new AdvancedModelRendererExtended(this);
        this.wingleft2.setRotationPoint(5.2F, 0.1F, -0.7F);
        this.wingleft1.addChild(wingleft2);
        this.wingleft2.cubeList.add(new ModelBox(wingleft2, 18, 0, -0.5F, 0.0F, 0.0F, 1, 12, 3, 0.0F, true));

        this.wingleftmembrane = new AdvancedModelRendererExtended(this);
        this.wingleftmembrane.setRotationPoint(-9.3F, 11.6F, 7.0F);
        this.wingleft2.addChild(wingleftmembrane);
        this.wingleftmembrane.cubeList.add(new ModelBox(wingleftmembrane, 37, 50, 8.8F, -11.6F, -4.0F, 1, 12, 5, 0.0F, true));

        this.wingleft3 = new AdvancedModelRendererExtended(this);
        this.wingleft3.setRotationPoint(0.1F, 12.05F, 0.3F);
        this.wingleft2.addChild(wingleft3);
        this.setRotateAngle(wingleft3, 0.0F, 0.0F, 0.0F);
        this.wingleft3.cubeList.add(new ModelBox(wingleft3, 17, 45, -0.5F, -3.0F, 0.0F, 1, 3, 9, 0.0F, true));

        this.wingleftmembranemiddle = new AdvancedModelRendererExtended(this);
        this.wingleftmembranemiddle.setRotationPoint(-9.4F, -0.4F, 6.7F);
        this.wingleft3.addChild(wingleftmembranemiddle);
        this.wingleftmembranemiddle.cubeList.add(new ModelBox(wingleftmembranemiddle, 46, 15, 8.9F, -5.575F, -6.7F, 1, 3, 9, -0.01F, true));

        this.wingleft4 = new AdvancedModelRendererExtended(this);
        this.wingleft4.setRotationPoint(-0.1F, 0.0F, 8.7F);
        this.wingleft3.addChild(wingleft4);
        this.setRotateAngle(wingleft4, 0.9599F, 0.0F, 0.0F);
        this.wingleft4.cubeList.add(new ModelBox(wingleft4, 18, 3, -0.5F, -2.0F, 0.0F, 1, 2, 16, 0.0F, true));

        this.wingleftmembraneend = new AdvancedModelRendererExtended(this);
        this.wingleftmembraneend.setRotationPoint(-9.3F, -0.4F, -4.0F);
        this.wingleft4.addChild(wingleftmembraneend);
        this.wingleftmembraneend.cubeList.add(new ModelBox(wingleftmembraneend, 0, 0, 8.8F, -4.575F, 4.0F, 1, 3, 16, -0.01F, true));

        this.handR = new AdvancedModelRendererExtended(this);
        this.handR.setRotationPoint(0.0F, -0.4F, 0.0F);
        this.wingleft3.addChild(handR);
        this.handR.cubeList.add(new ModelBox(handR, 0, 27, -0.5F, -0.5F, 0.2F, 2, 1, 3, 0.0F, true));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, 0.5F, -1.3F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.1309F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 0, -2.0F, -2.0F, -4.0F, 4, 6, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.2618F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 59, 27, -1.5F, -1.0F, -4.0F, 3, 5, 4, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.48F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 49, 60, -2.0F, -1.0F, -3.0F, 4, 3, 4, 0.0F, false));

        this.wukong = new AdvancedModelRendererExtended(this);
        this.wukong.setRotationPoint(-1.25F, 0.05F, -3.7F);
        this.head.addChild(wukong);
        this.setRotateAngle(wukong, 0.6545F, 0.0F, 0.0F);
        this.wukong.cubeList.add(new ModelBox(wukong, 0, 7, 0.0F, -1.25F, 0.0F, 0, 2, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(-0.0436F, 1.6912F, 12.3184F);
        this.wukong.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.8287F, 0.0167F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 5, 0.0305F, -0.301F, 0.037F, 0, 1, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, -1.25F, 6.0F);
        this.wukong.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3924F, 0.0167F, 0.0403F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 3, 0.0F, 0.0F, 0.0F, 0, 2, 7, 0.0F, false));

        this.wukong2 = new AdvancedModelRendererExtended(this);
        this.wukong2.setRotationPoint(1.25F, 0.05F, -3.7F);
        this.head.addChild(wukong2);
        this.setRotateAngle(wukong2, 0.6545F, 0.0F, 0.0F);
        this.wukong2.cubeList.add(new ModelBox(wukong2, 0, 7, 0.0F, -1.25F, 0.0F, 0, 2, 6, 0.0F, true));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0436F, 1.6912F, 12.3184F);
        this.wukong2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.8287F, -0.0167F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 5, -0.0305F, -0.301F, 0.037F, 0, 1, 7, 0.0F, true));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, -1.25F, 6.0F);
        this.wukong2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3924F, -0.0167F, -0.0403F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 3, 0.0F, 0.0F, 0.0F, 0, 2, 7, 0.0F, true));

        this.head2 = new AdvancedModelRendererExtended(this);
        this.head2.setRotationPoint(0.0F, 2.0F, -3.0F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, 0.1309F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 48, 40, -1.5F, -2.0F, -5.0F, 3, 2, 7, 0.002F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, -4.5F, -2.0F);
        this.head2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 29, 0.0F, -3.05F, -4.0F, 0, 6, 10, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.head2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1571F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 24, -1.0F, -0.125F, 4.1F, 2, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.head2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 57, 16, -1.5F, 0.0F, 0.0F, 3, 1, 6, 0.0F, false));

        this.head3 = new AdvancedModelRendererExtended(this);
        this.head3.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.1309F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 13, 57, -1.0F, -2.0F, -7.0F, 2, 1, 7, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(1.0F, -1.0F, 0.0F);
        this.head3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.4363F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 14, 0.0F, -0.525F, -7.0F, 0, 1, 5, 0.0F, true));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(-1.0F, -1.0F, 0.0F);
        this.head3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.4363F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 14, 0.0F, -0.525F, -7.0F, 0, 1, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(-0.001F, -2.0008F, -7.0012F);
        this.head3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.144F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 51, 0, -0.999F, 0.0F, 0.0F, 2, 1, 7, -0.001F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 28, 45, -2.0F, 0.0F, -3.0F, 4, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3272F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 11, 46, -1.5F, -3.0F, 0.0F, 3, 3, 3, 0.001F, false));

        this.jaw2 = new AdvancedModelRendererExtended(this);
        this.jaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.1309F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 36, 13, -1.5F, 0.0F, -5.0F, 3, 1, 5, 0.0F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 9, 19, -1.5F, 0.0F, -2.5F, 3, 1, 1, -0.001F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(1.0F, -0.3135F, -7.2828F);
        this.jaw2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1231F, 0.0447F, 0.3463F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 10, 0.0F, -0.2957F, -4.5653F, 0, 1, 5, 0.0F, true));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(-1.0F, -0.3135F, -7.2828F);
        this.jaw2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1231F, -0.0447F, -0.3463F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 10, 0.0F, -0.2957F, -4.5653F, 0, 1, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.jaw2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 57, 8, -1.0F, -1.0F, -7.0F, 2, 1, 7, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(chest, -1.5F, 3.1F, 0.0F);
        this.setRotateAngle(body1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.1F, -0.05F, -0.2F);
        this.setRotateAngle(neck2, -0.2F, -0.1F, -0.2F);
        this.setRotateAngle(head, 0.5F, 0.0F, -0.3F);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(upperlegR, 0.0F, 0.0F, -1.0F);
        this.setRotateAngle(lowerlegR, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(footR, -0.2F, 0.5F, 0.8F);
        this.setRotateAngle(upperlegL, 0.0F, 0.0F, 1.0F);
        this.setRotateAngle(lowerlegL, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(footL, 0.2F, -0.5F, -0.8F);
        this.setRotateAngle(wingleft1, 0.0F, 0.0F, -0.05F);
        this.setRotateAngle(wingleft2, 0.0F, 0.0F, -0.9F);
        this.setRotateAngle(wingleft3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(wingleft4, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(handR, 0.0F, 0.0F, 1.0F);
        this.setRotateAngle(wingright1, 0.0F, 0.0F, 0.05F);
        this.setRotateAngle(wingright2, 0.0F, 0.0F, 0.9F);
        this.setRotateAngle(wingright3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(wingright4, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(handL, 0.0F, 0.0F, 1.0F);
        this.root.offsetY = -0.15F;
        this.root.offsetX = 0.0F;
        this.root.offsetZ = 0.0F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(chest, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(body1, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.02F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.02F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(tail5, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(upperlegR, 0.3F, -0.3F, -0.5F);
        this.setRotateAngle(lowerlegR, 1.2F, 0.2F, 0.2F);
        this.setRotateAngle(footR, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(upperlegL, -0.3F, 0.0F, 0.5F);
        this.setRotateAngle(lowerlegL, 0.2F, 0.0F, -0.5F);
        this.setRotateAngle(footL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(wingleft1, 0.0F, 0.0F, -0.5F);
        this.setRotateAngle(wingleft2, 0.0F, 0.0F, -1.5F);
        this.setRotateAngle(wingleft3, -1.5F, 0.0F, 0.2F);
        this.setRotateAngle(wingleft4, 0.0F, -0.6F, 0.0F);
        this.setRotateAngle(handR, 0.0F, 0.0F, 1.5F);
        this.setRotateAngle(wingright1, 0.0F, 0.0F, 0.5F);
        this.setRotateAngle(wingright2, 0.0F, 0.0F, 1.5F);
        this.setRotateAngle(wingright3, -1.5F, 0.0F, -0.2F);
        this.setRotateAngle(wingright4, 0.0F, 0.6F, 0.0F);
        this.setRotateAngle(handL, 0.0F, 0.0F, -1.5F);
        this.root.offsetY = 0.2F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticSuspended(float f) {
        this.setRotateAngle(chest, 0.0F, -0.1F, 0.05F);
        this.setRotateAngle(body1, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(neck, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.0F, 0.02F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.02F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.04F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.04F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, 0.04F, 0.0F);
        this.setRotateAngle(upperlegR, 0.4F, 0.0F, -1.3F);
        this.setRotateAngle(lowerlegR, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(footR, 0.8F, 0.0F, 0.0F);
        this.setRotateAngle(upperlegL, 0.4F, 0.0F, 1.3F);
        this.setRotateAngle(lowerlegL, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(footL, 0.8F, 0.0F, 0.0F);
        this.setRotateAngle(wingleft1, 0.0F, 0.0F, -0.05F);
        this.setRotateAngle(wingleft2, 0.0F, 0.0F, -1.45F);
        this.setRotateAngle(wingleft3, -1.5F, 0.0F, 0.09F);
        this.setRotateAngle(wingleft4, 0.0F, 0.07F, -0.05F);
        this.setRotateAngle(wingright1, 0.0F, 0.0F, 0.05F);
        this.setRotateAngle(wingright2, 0.0F, 0.0F, 1.45F);
        this.setRotateAngle(wingright3, -1.5F, 0.0F, -0.09F);
        this.setRotateAngle(wingright4, 0.0F, -0.05F, 0.0F);
        this.root.offsetY = -0.12F;
        this.root.offsetZ = 0.02F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -2.5F;
        this.root.offsetX = -0.37F;
        this.root.rotateAngleY = (float)Math.toRadians(130);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 1.58F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(chest, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(body1, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.02F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.02F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(tail5, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(upperlegR, 0.3F, -0.3F, -0.5F);
        this.setRotateAngle(lowerlegR, 1.2F, 0.2F, 0.2F);
        this.setRotateAngle(footR, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(upperlegL, -0.3F, 0.0F, 0.5F);
        this.setRotateAngle(lowerlegL, 0.2F, 0.0F, -0.5F);
        this.setRotateAngle(footL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(wingleft1, 0.0F, 0.0F, -0.5F);
        this.setRotateAngle(wingleft2, 0.0F, 0.0F, -1.5F);
        this.setRotateAngle(wingleft3, -1.5F, 0.0F, 0.2F);
        this.setRotateAngle(wingleft4, 0.0F, -0.6F, 0.0F);
        this.setRotateAngle(handR, 0.0F, 0.0F, 1.5F);
        this.setRotateAngle(wingright1, 0.0F, 0.0F, 0.5F);
        this.setRotateAngle(wingright2, 0.0F, 0.0F, 1.5F);
        this.setRotateAngle(wingright3, -1.5F, 0.0F, -0.2F);
        this.setRotateAngle(wingright4, 0.0F, 0.6F, 0.0F);
        this.setRotateAngle(handL, 0.0F, 0.0F, -1.5F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {

        EntityPrehistoricFloraLandClimbingFlyingWalkingBase flier = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) e;

        AdvancedModelRenderer[] tailFull = {this.tail1};

        float speed = 0.76F;

        //Animations:

        if (flier.isReallyFlying()) { //flying
            this.faceTarget(f3, f4, 8, neck);
            this.faceTarget(f3, f4, 8, neck2);
            this.faceTarget(f3, f4, 4, head);

            //if (ee.getIsMoving()) {
            AdvancedModelRenderer[] wingLeft = {this.wingleft1, this.wingleft2, this.wingleft3, this.wingleft4};
            AdvancedModelRenderer[] wingRight = {this.wingright1, this.wingright2, this.wingright3, this.wingright4};

            AdvancedModelRenderer[] legLeft = {this.upperlegL, this.lowerlegL, this.footL};
            AdvancedModelRenderer[] legRight = {this.upperlegR, this.lowerlegR, this.footR};

            AdvancedModelRenderer[] tailFullFly = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
            float speedFly = 1.50F;
            float fixedY = 0; //The standard offset to centre the mob
            if (flier.getIsFast()) { //Flying fast
                speedFly = 2.24F;
            }
            else { //Flying regular

            }

            //Animations:
            this.chainFlap(wingLeft, speedFly, 0.35F, 0.3F, f2, 1F);
            this.chainFlap(wingRight, speedFly, -0.35F, -0.3F, f2, 1F);

            this.swing(wingleft3, speedFly, 0.7F, false, 2.0F, 0.12F, f2, 1F);
            this.swing(wingright3, speedFly, -0.7F, false, 2.0F, -0.12F, f2, 1F);

            this.swing(wingleft1, speedFly, 0.10F, false, 2.0F, 0.08F, f2, 1F);
            this.swing(wingright1, speedFly, -0.10F, false, 2.0F, -0.08F, f2, 1F);

            float floatMoveZ = this.moveBoxExtended(speedFly * 0.3F, 0.30F, false, 4, f2, 1);
            this.root.offsetZ = floatMoveZ;
            float floatMoveY = this.moveBoxExtended(speedFly * 0.6F, 0.50F, false, 4, f2, 1);
            this.root.offsetY = (floatMoveY) + fixedY;

            this.chainWaveExtended(legLeft, speedFly, 0.055F, 0.1F, 0F, f2, 1F);
            this.chainWaveExtended(legRight, speedFly, -0.055F, -0.1F, 3F, f2, 1F);
            this.chainWave(tailFullFly, speedFly * 0.5F, 0.02F, 0.5F, f2, 1F);
            this.chainSwing(tailFullFly, speedFly * 0.5F, 0.15F, 2.0F, f2, 1F);

        }
        else { //not flying
            if (flier.getIsFast()) {
                speed = speed;
            }
            else {
                speed = speed / 1.5F;
            }
            this.faceTarget(f3, f4, 12, neck);
            this.faceTarget(f3, f4, 12, neck2);
            this.faceTarget(f3, f4, 8, head);

            this.chainWave(tailFull, speed * 0.5F, 0.02F, 0.2F, f2, 1F);
            this.chainSwing(tailFull, speed * 0.5F, 0.05F, 0.5F, f2, 1F);

        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraWukongopterus ee = (EntityPrehistoricFloraWukongopterus) entitylivingbaseIn;

        if (ee.isReallyFlying() || ee.getAnimation() == ee.UNFLY_ANIMATION) {
            //flight pose
            this.setRotateAngle(chest, -0.0892F, 0.0F, 0.0F);
            this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);
            this.setRotateAngle(tail1, -0.0456F, 0.0F, 0.0F);
            this.setRotateAngle(tail2, 0.0456F, 0.0F, 0.0F);
            this.setRotateAngle(tail3, 0.0456F, 0.0F, 0.0F);
            this.setRotateAngle(tail4, 0.0456F, 0.0F, 0.0F);
            this.setRotateAngle(tail5, 0.0456F, 0.0F, 0.0F);
            this.setRotateAngle(upperlegL, -0.1286F, -0.0332F, -1.4914F);
            this.setRotateAngle(lowerlegL, 0.8647F, 0.1147F, 0.2812F);
            this.setRotateAngle(footL, 1.0606F, -0.5918F, 0.2276F);
            this.setRotateAngle(legwing11, -0.0911F, 0.0F, 0.0F);
            this.setRotateAngle(upperlegR, -0.1286F, 0.0332F, 1.4914F);
            this.setRotateAngle(lowerlegR, 0.8647F, -0.1147F, -0.2812F);
            this.setRotateAngle(footR, 1.0606F, 0.5918F, -0.2276F);
            this.setRotateAngle(legwing2, -0.0911F, 0.0F, 0.0F);
            this.setRotateAngle(wingleft1, 0.0429F, 0.0206F, -0.0911F);
            this.setRotateAngle(wingleft2, 0.0F, 0.0F, -1.5509F);
            this.setRotateAngle(wingleft3, -1.4748F, 0.0F, 0.0F);
            this.setRotateAngle(wingleft4, 0.1375F, 0.0F, 0.0F);
            this.setRotateAngle(handL, 0.0F, 0.0F, 1.5533F);
            this.setRotateAngle(wingright1, 0.0429F, -0.0206F, 0.0911F);
            this.setRotateAngle(wingright2, 0.0F, 0.0F, 1.5509F);
            this.setRotateAngle(wingright3, -1.4748F, 0.0F, 0.0F);
            this.setRotateAngle(wingright4, 0.1375F, 0.0F, 0.0F);
            this.setRotateAngle(handR, 0.0F, 0.0F, -1.5621F);
            this.setRotateAngle(neck, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(neck2, -0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(head, 0.48F, 0.0F, 0.0F);
            this.setRotateAngle(wukong, 0.6545F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, -0.8287F, 0.0167F, 0.0F);
            this.setRotateAngle(cube_r2, -0.3924F, 0.0167F, 0.0403F);
            this.setRotateAngle(wukong2, 0.6545F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r3, -0.8287F, -0.0167F, 0.0F);
            this.setRotateAngle(cube_r4, -0.3924F, -0.0167F, -0.0403F);
            this.setRotateAngle(head2, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, 0.1571F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(head3, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.4363F);
            this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.4363F);
            this.setRotateAngle(cube_r10, 0.144F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r11, -0.3272F, 0.0F, 0.0F);
            this.setRotateAngle(jaw2, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r12, -0.1231F, 0.0447F, 0.3463F);
            this.setRotateAngle(cube_r13, -0.1231F, -0.0447F, -0.3463F);
            this.setRotateAngle(cube_r14, -0.1309F, 0.0F, 0.0F);

            if (ee.getAttachmentPos() == null ) {
                //if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Flying fast
                    //animFlyFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
                else { //Flying regular
                    //animFly(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
                //}
            }

        } else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is walking:
                //The model is already reset to default each cycle so no need to do more here
            }
            else {
                //Climb pose
                this.setRotateAngle(chest, -0.0892F, 0.0F, 0.0F);
                this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);
                this.setRotateAngle(tail1, -0.0456F, 0.0F, 0.0F);
                this.setRotateAngle(tail2, 0.0456F, 0.0F, 0.0F);
                this.setRotateAngle(tail3, 0.0456F, 0.0F, 0.0F);
                this.setRotateAngle(tail4, 0.0456F, 0.0F, 0.0F);
                this.setRotateAngle(tail5, 0.0456F, 0.0F, 0.0F);
                this.setRotateAngle(upperlegL, -0.0045F, 0.1874F, 1.1089F);
                this.setRotateAngle(lowerlegL, 0.7126F, 0.1021F, 0.1306F);
                this.setRotateAngle(footL, 0.1012F, -0.4664F, -1.1122F);
                this.setRotateAngle(legwing11, -0.0911F, 0.0F, 0.0F);
                this.setRotateAngle(upperlegR, 0.0045F, -0.1874F, -1.1089F);
                this.setRotateAngle(lowerlegR, 0.7126F, 0.1021F, 0.1306F);
                this.setRotateAngle(footR, -0.3607F, -0.3571F, 0.1209F);
                this.setRotateAngle(cube_r1, 0.3004F, 0.2841F, 0.968F);
                this.setRotateAngle(legwing2, -0.0911F, 0.0F, 0.0F);
                this.setRotateAngle(wingright1, 0.0528F, -0.0186F, 0.2576F);
                this.setRotateAngle(wingright2, 0.0F, 0.0F, 0.4887F);
                this.setRotateAngle(wingright3, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(wingright4, 0.528F, 0.0F, 0.0F);
                this.setRotateAngle(handL, 0.0F, 0.0F, -0.8072F);
                this.setRotateAngle(wingleft1, 0.0482F, -0.0286F, -0.2619F);
                this.setRotateAngle(wingleft2, 0.0F, 0.0F, -0.4887F);
                this.setRotateAngle(wingleft3, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(wingleft4, 0.528F, 0.0F, 0.0F);
                this.setRotateAngle(handR, 0.0F, 0.0F, 0.6981F);
                this.setRotateAngle(neck, 0.0785F, 0.0F, 0.0F);
                this.setRotateAngle(neck2, -0.2618F, 0.0F, 0.0F);
                this.setRotateAngle(head, 0.3142F, 0.0F, 0.0F);
                this.setRotateAngle(wukong, 0.6545F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r2, -0.8287F, 0.0167F, 0.0F);
                this.setRotateAngle(cube_r3, -0.3924F, 0.0167F, 0.0403F);
                this.setRotateAngle(wukong2, 0.6545F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r4, -0.8287F, -0.0167F, 0.0F);
                this.setRotateAngle(cube_r5, -0.3924F, -0.0167F, -0.0403F);
                this.setRotateAngle(head2, 0.1309F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r7, 0.1571F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r8, 0.1309F, 0.0F, 0.0F);
                //this.setRotateAngle(head3, -0.1309F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.4363F);
                this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.4363F);
                this.setRotateAngle(cube_r11, 0.144F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r12, -0.3272F, 0.0F, 0.0F);
                this.setRotateAngle(jaw2, 0.1309F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r13, -0.1231F, 0.0447F, 0.3463F);
                this.setRotateAngle(cube_r14, -0.1231F, -0.0447F, -0.3463F);
            }
        }

        if (ee.getAttachmentPos() == null ) {
            //if (ee.getIsMoving()) {
//                if (ee.getIsFast()) { //Flying fast
//                    animFlyFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
//                }
//                else { //Flying regular
//                    animFly(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
//                }
            //}
        }
        else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is Walking:
                if (ee.getIsMoving()) {
                    if (ee.getIsFast()) { //Walking fast
                        animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else { //Walking regular
                        animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }

            }
            else if (!ee.getHeadCollided()){
                //Climbing
                animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.PREEN_ANIMATION) {
            animPreen(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) {
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraWukongopterus entity = (EntityPrehistoricFloraWukongopterus) entitylivingbaseIn;

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraWukongopterus entity = (EntityPrehistoricFloraWukongopterus) entitylivingbaseIn;

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraWukongopterus entity = (EntityPrehistoricFloraWukongopterus) entitylivingbaseIn;

    }

    public void animPreen(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraWukongopterus entity = (EntityPrehistoricFloraWukongopterus) entitylivingbaseIn;

        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-5 + (((tickAnim - 10) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-5)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 40) / 5) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2.5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2.5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2.5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2.5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5 + (((tickAnim - 20) / 5) * (25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5 + (((tickAnim - 20) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-28-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15 + (((tickAnim - 20) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-22.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5 + (((tickAnim - 25) / 15) * (25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*4-(25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-28 + (((tickAnim - 25) / 15) * (-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-28)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-22.5 + (((tickAnim - 25) / 15) * (-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-22.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*4 + (((tickAnim - 40) / 5) * (0-(25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*4)));
            yy = -20 + (((tickAnim - 40) / 5) * (0-(-20)));
            zz = -30 + (((tickAnim - 40) / 5) * (0-(-30)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*20 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*20)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*20 + (((tickAnim - 20) / 5) * (25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*20)));
            yy = 0 + (((tickAnim - 20) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-28-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10 + (((tickAnim - 20) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-60))*5 + (((tickAnim - 25) / 15) * (25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*2-(25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-28 + (((tickAnim - 25) / 15) * (-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-28)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10 + (((tickAnim - 25) / 15) * (-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*2 + (((tickAnim - 40) / 5) * (0-(25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*2)));
            yy = -15 + (((tickAnim - 40) / 5) * (0-(-15)));
            zz = -15 + (((tickAnim - 40) / 5) * (0-(-15)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*15 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*15)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15 + (((tickAnim - 20) / 7) * (16.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15)));
            yy = 0 + (((tickAnim - 20) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-15-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10 + (((tickAnim - 20) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 16.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*5 + (((tickAnim - 27) / 6) * (26.02634-(16.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-15 + (((tickAnim - 27) / 6) * (-8.65939-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-15)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10 + (((tickAnim - 27) / 6) * (-3.69939-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 26.02634 + (((tickAnim - 33) / 7) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+120))-(26.02634)));
            yy = -8.65939 + (((tickAnim - 33) / 7) * (-15-(-8.65939)));
            zz = -3.69939 + (((tickAnim - 33) / 7) * (-10-(-3.69939)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+120)) + (((tickAnim - 40) / 5) * (0-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+120)))));
            yy = -15 + (((tickAnim - 40) / 5) * (0-(-15)));
            zz = -10 + (((tickAnim - 40) / 5) * (0-(-10)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*10-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*10 + (((tickAnim - 25) / 15) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*10-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*10)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*10 + (((tickAnim - 40) / 5) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*10)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5 + (((tickAnim - 10) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 40) / 5) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegL, upperlegL.rotateAngleX + (float) Math.toRadians(xx), upperlegL.rotateAngleY + (float) Math.toRadians(yy), upperlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5 + (((tickAnim - 10) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 40) / 5) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegR, upperlegR.rotateAngleX + (float) Math.toRadians(xx), upperlegR.rotateAngleY + (float) Math.toRadians(yy), upperlegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5 + (((tickAnim - 10) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 40) / 5) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright1, wingright1.rotateAngleX + (float) Math.toRadians(xx), wingright1.rotateAngleY + (float) Math.toRadians(yy), wingright1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*2.5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*5-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*-5-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62+120))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*5 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*-5 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62+120))*10 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62+120))*10)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-10 + (((tickAnim - 13) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/2))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*10 + (((tickAnim - 13) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-10 + (((tickAnim - 13) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*12-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-10)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/2))*-10 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/2))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*12 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*12)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-10 + (((tickAnim - 40) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*10 + (((tickAnim - 40) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-5 + (((tickAnim - 40) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft1, wingleft1.rotateAngleX + (float) Math.toRadians(xx), wingleft1.rotateAngleY + (float) Math.toRadians(yy), wingleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*2.5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*-5-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*-5 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*-5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62+60))*5 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62+60))*5)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10 + (((tickAnim - 13) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-20 + (((tickAnim - 13) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-22-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-20)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10 + (((tickAnim - 25) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-22 + (((tickAnim - 25) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-22)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-10 + (((tickAnim - 40) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-10)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-30 + (((tickAnim - 40) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-30)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft2, wingleft2.rotateAngleX + (float) Math.toRadians(xx), wingleft2.rotateAngleY + (float) Math.toRadians(yy), wingleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (-5-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (2.5-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -5 + (((tickAnim - 40) / 5) * (0-(-5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 2.5 + (((tickAnim - 40) / 5) * (0-(2.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft3, wingleft3.rotateAngleX + (float) Math.toRadians(xx), wingleft3.rotateAngleY + (float) Math.toRadians(yy), wingleft3.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraWukongopterus entity = (EntityPrehistoricFloraWukongopterus) entitylivingbaseIn;
        
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-10 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-10)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 30) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-0.5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-0.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*1 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*1)));
            zz = 0 + (((tickAnim - 5) / 30) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-2.5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 30) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-2.5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 30) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5)));
            yy = 0 + (((tickAnim - 0) / 5) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-30 + (((tickAnim - 5) / 15) * (-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-30)));
            yy = 10 + (((tickAnim - 5) / 15) * (10-(10)));
            zz = 5 + (((tickAnim - 5) / 15) * (5-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -30 + (((tickAnim - 20) / 5) * (-40-(-30)));
            yy = 10 + (((tickAnim - 20) / 5) * (-10-(10)));
            zz = 5 + (((tickAnim - 20) / 5) * (-5-(5)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -40 + (((tickAnim - 25) / 10) * (-40-(-40)));
            yy = -10 + (((tickAnim - 25) / 10) * (-10-(-10)));
            zz = -5 + (((tickAnim - 25) / 10) * (-5-(-5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -40 + (((tickAnim - 35) / 5) * (0-(-40)));
            yy = -10 + (((tickAnim - 35) / 5) * (0-(-10)));
            zz = -5 + (((tickAnim - 35) / 5) * (0-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-15 + (((tickAnim - 5) / 15) * (-8-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-15)));
            yy = 10 + (((tickAnim - 5) / 15) * (10-(10)));
            zz = 5 + (((tickAnim - 5) / 15) * (5-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -8 + (((tickAnim - 20) / 5) * (10-(-8)));
            yy = 10 + (((tickAnim - 20) / 5) * (-10-(10)));
            zz = 5 + (((tickAnim - 20) / 5) * (-5-(5)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 10 + (((tickAnim - 25) / 10) * (10-(10)));
            yy = -10 + (((tickAnim - 25) / 10) * (-10-(-10)));
            zz = -5 + (((tickAnim - 25) / 10) * (-5-(-5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 35) / 5) * (0-(10)));
            yy = -10 + (((tickAnim - 35) / 5) * (0-(-10)));
            zz = -5 + (((tickAnim - 35) / 5) * (0-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (15-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*30 + (((tickAnim - 5) / 15) * (30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*30)));
            yy = 15 + (((tickAnim - 5) / 15) * (15-(15)));
            zz = 5 + (((tickAnim - 5) / 15) * (5-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3 + (((tickAnim - 20) / 5) * (40-(30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3)));
            yy = 15 + (((tickAnim - 20) / 5) * (-15-(15)));
            zz = 5 + (((tickAnim - 20) / 5) * (-10-(5)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 40 + (((tickAnim - 25) / 10) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3-(40)));
            yy = -15 + (((tickAnim - 25) / 10) * (-15-(-15)));
            zz = -10 + (((tickAnim - 25) / 10) * (-10-(-10)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3 + (((tickAnim - 35) / 5) * (0-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3)));
            yy = -15 + (((tickAnim - 35) / 5) * (0-(-15)));
            zz = -10 + (((tickAnim - 35) / 5) * (0-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*3 + (((tickAnim - 5) / 5) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*3)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*3-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*3 + (((tickAnim - 25) / 5) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*3)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-2.5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 30) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegL, upperlegL.rotateAngleX + (float) Math.toRadians(xx), upperlegL.rotateAngleY + (float) Math.toRadians(yy), upperlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-2.5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 30) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegR, upperlegR.rotateAngleX + (float) Math.toRadians(xx), upperlegR.rotateAngleY + (float) Math.toRadians(yy), upperlegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5)));
        }
        else if (tickAnim >= 5 && tickAnim < 38) {
            xx = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75)) + (((tickAnim - 5) / 33) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75)))));
            yy = 0 + (((tickAnim - 5) / 33) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-15 + (((tickAnim - 5) / 33) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-15)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))* + (((tickAnim - 38) / 2) * (0-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2)))));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-15 + (((tickAnim - 38) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright1, wingright1.rotateAngleX + (float) Math.toRadians(xx), wingright1.rotateAngleY + (float) Math.toRadians(yy), wingright1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*12.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*12.5 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*12.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*12.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*12.5 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright2, wingright2.rotateAngleX + (float) Math.toRadians(xx), wingright2.rotateAngleY + (float) Math.toRadians(yy), wingright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3.92-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-2.97-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.39-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 3.92 + (((tickAnim - 5) / 7) * (6.77832-(3.92)));
            yy = -2.97 + (((tickAnim - 5) / 7) * (-4.95712-(-2.97)));
            zz = -0.39 + (((tickAnim - 5) / 7) * (-0.65426-(-0.39)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 6.77832 + (((tickAnim - 12) / 11) * (7.52832-(6.77832)));
            yy = -4.95712 + (((tickAnim - 12) / 11) * (-4.95712-(-4.95712)));
            zz = -0.65426 + (((tickAnim - 12) / 11) * (-0.65426-(-0.65426)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 7.52832 + (((tickAnim - 23) / 7) * (6.26091-(7.52832)));
            yy = -4.95712 + (((tickAnim - 23) / 7) * (-0.98053-(-4.95712)));
            zz = -0.65426 + (((tickAnim - 23) / 7) * (-0.22841-(-0.65426)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 6.26091 + (((tickAnim - 30) / 10) * (0-(6.26091)));
            yy = -0.98053 + (((tickAnim - 30) / 10) * (0-(-0.98053)));
            zz = -0.22841 + (((tickAnim - 30) / 10) * (0-(-0.22841)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright3, wingright3.rotateAngleX + (float) Math.toRadians(xx), wingright3.rotateAngleY + (float) Math.toRadians(yy), wingright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75)) + (((tickAnim - 5) / 30) * (-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75)))));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2)) + (((tickAnim - 35) / 5) * (0-(-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2)))));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft1, wingleft1.rotateAngleX + (float) Math.toRadians(xx), wingleft1.rotateAngleY + (float) Math.toRadians(yy), wingleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-12.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-12.5 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-12.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-12.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-12.5 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft2, wingleft2.rotateAngleX + (float) Math.toRadians(xx), wingleft2.rotateAngleY + (float) Math.toRadians(yy), wingleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3.92-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (2.97-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.39-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 3.92 + (((tickAnim - 5) / 7) * (6.7783-(3.92)));
            yy = 2.97 + (((tickAnim - 5) / 7) * (4.9571-(2.97)));
            zz = -0.39 + (((tickAnim - 5) / 7) * (-0.65426-(-0.39)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 6.7783 + (((tickAnim - 12) / 11) * (7.5283-(6.7783)));
            yy = 4.9571 + (((tickAnim - 12) / 11) * (4.9571-(4.9571)));
            zz = -0.65426 + (((tickAnim - 12) / 11) * (-0.65426-(-0.65426)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 7.5283 + (((tickAnim - 23) / 7) * (6.2609-(7.5283)));
            yy = 4.9571 + (((tickAnim - 23) / 7) * (0.9805-(4.9571)));
            zz = -0.65426 + (((tickAnim - 23) / 7) * (-0.22841-(-0.65426)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 6.2609 + (((tickAnim - 30) / 10) * (0-(6.2609)));
            yy = 0.9805 + (((tickAnim - 30) / 10) * (0-(0.9805)));
            zz = -0.22841 + (((tickAnim - 30) / 10) * (0-(-0.22841)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft3, wingleft3.rotateAngleX + (float) Math.toRadians(xx), wingleft3.rotateAngleY + (float) Math.toRadians(yy), wingleft3.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraWukongopterus entity = (EntityPrehistoricFloraWukongopterus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*10), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*2.5));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-0.5);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*-2);


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+120))*-10), body1.rotateAngleY + (float) Math.toRadians(0), body1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(12+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*-10), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*5), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*-2.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*-2.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*-5), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*5), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-2.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-180))*5), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-180))*-2.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*-5), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-240))*5), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-210))*-2.5));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-10), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*-2.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*-10), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*10), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 25 + (((tickAnim - 0) / 2) * (10-(25)));
            yy = -2.5 + (((tickAnim - 0) / 2) * (-2.5-(-2.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 2) / 1) * (-15-(10)));
            yy = -2.5 + (((tickAnim - 2) / 1) * (5-(-2.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (-7.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -15 + (((tickAnim - 3) / 2) * (-30-(-15)));
            yy = 5 + (((tickAnim - 3) / 2) * (5-(5)));
            zz = -7.5 + (((tickAnim - 3) / 2) * (-5-(-7.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -30 + (((tickAnim - 5) / 1) * (0-(-30)));
            yy = 5 + (((tickAnim - 5) / 1) * (5-(5)));
            zz = -5 + (((tickAnim - 5) / 1) * (-7.5-(-5)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (15-(0)));
            yy = 5 + (((tickAnim - 6) / 1) * (0-(5)));
            zz = -7.5 + (((tickAnim - 6) / 1) * (-2.5-(-7.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 7) / 1) * (27.5-(15)));
            yy = 0 + (((tickAnim - 7) / 1) * (-1.25-(0)));
            zz = -2.5 + (((tickAnim - 7) / 1) * (-1.25-(-2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 27.5 + (((tickAnim - 8) / 0) * (40-(27.5)));
            yy = -1.25 + (((tickAnim - 8) / 0) * (-2.5-(-1.25)));
            zz = -1.25 + (((tickAnim - 8) / 0) * (0-(-1.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 40 + (((tickAnim - 8) / 2) * (25-(40)));
            yy = -2.5 + (((tickAnim - 8) / 2) * (-2.5-(-2.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegL, upperlegL.rotateAngleX + (float) Math.toRadians(xx), upperlegL.rotateAngleY + (float) Math.toRadians(yy), upperlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 2) * (1-(0.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1 + (((tickAnim - 2) / 1) * (1-(1)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 3) / 2) * (0-(1)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0.25-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 6) / 1) * (0.5-(0.25)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 7) / 1) * (0.25-(0.5)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.25 + (((tickAnim - 8) / 0) * (0-(0.25)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.5-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegL.rotationPointX = this.upperlegL.rotationPointX + (float)(xx);
        this.upperlegL.rotationPointY = this.upperlegL.rotationPointY - (float)(yy);
        this.upperlegL.rotationPointZ = this.upperlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 7.5 + (((tickAnim - 0) / 2) * (20-(7.5)));
            yy = -5 + (((tickAnim - 0) / 2) * (2.5-(-5)));
            zz = 12.5 + (((tickAnim - 0) / 2) * (12.5-(12.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 20 + (((tickAnim - 2) / 1) * (27.5-(20)));
            yy = 2.5 + (((tickAnim - 2) / 1) * (2.5-(2.5)));
            zz = 12.5 + (((tickAnim - 2) / 1) * (12.5-(12.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 27.5 + (((tickAnim - 3) / 2) * (25-(27.5)));
            yy = 2.5 + (((tickAnim - 3) / 2) * (5-(2.5)));
            zz = 12.5 + (((tickAnim - 3) / 2) * (12.5-(12.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 25 + (((tickAnim - 5) / 1) * (-25-(25)));
            yy = 5 + (((tickAnim - 5) / 1) * (2.5-(5)));
            zz = 12.5 + (((tickAnim - 5) / 1) * (17.5-(12.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -25 + (((tickAnim - 6) / 1) * (-20-(-25)));
            yy = 2.5 + (((tickAnim - 6) / 1) * (0-(2.5)));
            zz = 17.5 + (((tickAnim - 6) / 1) * (12.5-(17.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -20 + (((tickAnim - 7) / 1) * (-20-(-20)));
            yy = 0 + (((tickAnim - 7) / 1) * (-2.5-(0)));
            zz = 12.5 + (((tickAnim - 7) / 1) * (12.5-(12.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -20 + (((tickAnim - 8) / 0) * (-25-(-20)));
            yy = -2.5 + (((tickAnim - 8) / 0) * (-5-(-2.5)));
            zz = 12.5 + (((tickAnim - 8) / 0) * (12.5-(12.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -25 + (((tickAnim - 8) / 2) * (7.5-(-25)));
            yy = -5 + (((tickAnim - 8) / 2) * (-5-(-5)));
            zz = 12.5 + (((tickAnim - 8) / 2) * (12.5-(12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegL, lowerlegL.rotateAngleX + (float) Math.toRadians(xx), lowerlegL.rotateAngleY + (float) Math.toRadians(yy), lowerlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 47.5 + (((tickAnim - 0) / 2) * (10-(47.5)));
            yy = -42.5 + (((tickAnim - 0) / 2) * (-42.5-(-42.5)));
            zz = 7.5 + (((tickAnim - 0) / 2) * (7.5-(7.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 2) / 1) * (-2.5-(10)));
            yy = -42.5 + (((tickAnim - 2) / 1) * (-32.5-(-42.5)));
            zz = 7.5 + (((tickAnim - 2) / 1) * (7.5-(7.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2.5 + (((tickAnim - 3) / 2) * (30-(-2.5)));
            yy = -32.5 + (((tickAnim - 3) / 2) * (-32.5-(-32.5)));
            zz = 7.5 + (((tickAnim - 3) / 2) * (7.5-(7.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 30 + (((tickAnim - 5) / 1) * (32.5-(30)));
            yy = -32.5 + (((tickAnim - 5) / 1) * (-37.5-(-32.5)));
            zz = 7.5 + (((tickAnim - 5) / 1) * (7.5-(7.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 32.5 + (((tickAnim - 6) / 1) * (10-(32.5)));
            yy = -37.5 + (((tickAnim - 6) / 1) * (-40-(-37.5)));
            zz = 7.5 + (((tickAnim - 6) / 1) * (7.5-(7.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 7) / 1) * (-2.5-(10)));
            yy = -40 + (((tickAnim - 7) / 1) * (-41.25-(-40)));
            zz = 7.5 + (((tickAnim - 7) / 1) * (7.5-(7.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 8) / 0) * (10-(-2.5)));
            yy = -41.25 + (((tickAnim - 8) / 0) * (-42.5-(-41.25)));
            zz = 7.5 + (((tickAnim - 8) / 0) * (7.5-(7.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 8) / 2) * (47.5-(10)));
            yy = -42.5 + (((tickAnim - 8) / 2) * (-42.5-(-42.5)));
            zz = 7.5 + (((tickAnim - 8) / 2) * (7.5-(7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footL, footL.rotateAngleX + (float) Math.toRadians(xx), footL.rotateAngleY + (float) Math.toRadians(yy), footL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 40 + (((tickAnim - 0) / 2) * (25-(40)));
            yy = 2.5 + (((tickAnim - 0) / 2) * (2.5-(2.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 25 + (((tickAnim - 2) / 1) * (10-(25)));
            yy = 2.5 + (((tickAnim - 2) / 1) * (2.5-(2.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 10 + (((tickAnim - 3) / 2) * (-15-(10)));
            yy = 2.5 + (((tickAnim - 3) / 2) * (-5-(2.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (7.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -15 + (((tickAnim - 5) / 2) * (-30-(-15)));
            yy = -5 + (((tickAnim - 5) / 2) * (-5-(-5)));
            zz = 7.5 + (((tickAnim - 5) / 2) * (5-(7.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -30 + (((tickAnim - 7) / 1) * (0-(-30)));
            yy = -5 + (((tickAnim - 7) / 1) * (-5-(-5)));
            zz = 5 + (((tickAnim - 7) / 1) * (7.5-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (15-(0)));
            yy = -5 + (((tickAnim - 8) / 0) * (0-(-5)));
            zz = 7.5 + (((tickAnim - 8) / 0) * (2.5-(7.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 15 + (((tickAnim - 8) / 1) * (27.5-(15)));
            yy = 0 + (((tickAnim - 8) / 1) * (1.25-(0)));
            zz = 2.5 + (((tickAnim - 8) / 1) * (1.25-(2.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 27.5 + (((tickAnim - 9) / 1) * (40-(27.5)));
            yy = 1.25 + (((tickAnim - 9) / 1) * (2.5-(1.25)));
            zz = 1.25 + (((tickAnim - 9) / 1) * (0-(1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegR, upperlegR.rotateAngleX + (float) Math.toRadians(xx), upperlegR.rotateAngleY + (float) Math.toRadians(yy), upperlegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 2) / 1) * (1-(0.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 3) / 2) * (1-(1)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 5) / 2) * (0-(1)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0.25-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.25 + (((tickAnim - 8) / 0) * (0.5-(0.25)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 8) / 1) * (0.25-(0.5)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 9) / 1) * (0-(0.25)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegR.rotationPointX = this.upperlegR.rotationPointX + (float)(xx);
        this.upperlegR.rotationPointY = this.upperlegR.rotationPointY - (float)(yy);
        this.upperlegR.rotationPointZ = this.upperlegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -25 + (((tickAnim - 0) / 2) * (7.5-(-25)));
            yy = 5 + (((tickAnim - 0) / 2) * (5-(5)));
            zz = -12.5 + (((tickAnim - 0) / 2) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 7.5 + (((tickAnim - 2) / 1) * (20-(7.5)));
            yy = 5 + (((tickAnim - 2) / 1) * (-2.5-(5)));
            zz = -12.5 + (((tickAnim - 2) / 1) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 20 + (((tickAnim - 3) / 2) * (27.5-(20)));
            yy = -2.5 + (((tickAnim - 3) / 2) * (-2.5-(-2.5)));
            zz = -12.5 + (((tickAnim - 3) / 2) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 27.5 + (((tickAnim - 5) / 2) * (25-(27.5)));
            yy = -2.5 + (((tickAnim - 5) / 2) * (-5-(-2.5)));
            zz = -12.5 + (((tickAnim - 5) / 2) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 25 + (((tickAnim - 7) / 1) * (-25-(25)));
            yy = -5 + (((tickAnim - 7) / 1) * (-2.5-(-5)));
            zz = -12.5 + (((tickAnim - 7) / 1) * (-17.5-(-12.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -25 + (((tickAnim - 8) / 0) * (-20-(-25)));
            yy = -2.5 + (((tickAnim - 8) / 0) * (0-(-2.5)));
            zz = -17.5 + (((tickAnim - 8) / 0) * (-12.5-(-17.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -20 + (((tickAnim - 8) / 1) * (-20-(-20)));
            yy = 0 + (((tickAnim - 8) / 1) * (2.5-(0)));
            zz = -12.5 + (((tickAnim - 8) / 1) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -20 + (((tickAnim - 9) / 1) * (-25-(-20)));
            yy = 2.5 + (((tickAnim - 9) / 1) * (5-(2.5)));
            zz = -12.5 + (((tickAnim - 9) / 1) * (-12.5-(-12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegR, lowerlegR.rotateAngleX + (float) Math.toRadians(xx), lowerlegR.rotateAngleY + (float) Math.toRadians(yy), lowerlegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (47.5-(0)));
            yy = 42.5 + (((tickAnim - 0) / 2) * (42.5-(42.5)));
            zz = -7.5 + (((tickAnim - 0) / 2) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 47.5 + (((tickAnim - 2) / 1) * (10-(47.5)));
            yy = 42.5 + (((tickAnim - 2) / 1) * (42.5-(42.5)));
            zz = -7.5 + (((tickAnim - 2) / 1) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 10 + (((tickAnim - 3) / 2) * (-2.5-(10)));
            yy = 42.5 + (((tickAnim - 3) / 2) * (32.5-(42.5)));
            zz = -7.5 + (((tickAnim - 3) / 2) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -2.5 + (((tickAnim - 5) / 2) * (30-(-2.5)));
            yy = 32.5 + (((tickAnim - 5) / 2) * (32.5-(32.5)));
            zz = -7.5 + (((tickAnim - 5) / 2) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 30 + (((tickAnim - 7) / 1) * (32.5-(30)));
            yy = 32.5 + (((tickAnim - 7) / 1) * (37.5-(32.5)));
            zz = -7.5 + (((tickAnim - 7) / 1) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 32.5 + (((tickAnim - 8) / 0) * (10-(32.5)));
            yy = 37.5 + (((tickAnim - 8) / 0) * (40-(37.5)));
            zz = -7.5 + (((tickAnim - 8) / 0) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 10 + (((tickAnim - 8) / 1) * (-2.5-(10)));
            yy = 40 + (((tickAnim - 8) / 1) * (41.25-(40)));
            zz = -7.5 + (((tickAnim - 8) / 1) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 9) / 1) * (10-(-2.5)));
            yy = 41.25 + (((tickAnim - 9) / 1) * (42.5-(41.25)));
            zz = -7.5 + (((tickAnim - 9) / 1) * (-7.5-(-7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footR, footR.rotateAngleX + (float) Math.toRadians(xx), footR.rotateAngleY + (float) Math.toRadians(yy), footR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -15.45275 + (((tickAnim - 0) / 1) * (-10-(-15.45275)));
            yy = -20.30292 + (((tickAnim - 0) / 1) * (1.25-(-20.30292)));
            zz = -20.67676 + (((tickAnim - 0) / 1) * (-7.5-(-20.67676)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -10 + (((tickAnim - 1) / 1) * (-10-(-10)));
            yy = 1.25 + (((tickAnim - 1) / 1) * (15-(1.25)));
            zz = -7.5 + (((tickAnim - 1) / 1) * (0-(-7.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -10 + (((tickAnim - 2) / 1) * (0-(-10)));
            yy = 15 + (((tickAnim - 2) / 1) * (20-(15)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (7.5-(0)));
            yy = 20 + (((tickAnim - 3) / 0) * (25-(20)));
            zz = 0 + (((tickAnim - 3) / 0) * (-10-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 7.5 + (((tickAnim - 3) / 2) * (7.5-(7.5)));
            yy = 25 + (((tickAnim - 3) / 2) * (32.5-(25)));
            zz = -10 + (((tickAnim - 3) / 2) * (-7.5-(-10)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 7.5 + (((tickAnim - 5) / 2) * (5-(7.5)));
            yy = 32.5 + (((tickAnim - 5) / 2) * (20-(32.5)));
            zz = -7.5 + (((tickAnim - 5) / 2) * (10-(-7.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 5 + (((tickAnim - 7) / 2) * (0.24917-(5)));
            yy = 20 + (((tickAnim - 7) / 2) * (-26.97821-(20)));
            zz = 10 + (((tickAnim - 7) / 2) * (8.98402-(10)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0.24917 + (((tickAnim - 9) / 1) * (-15.45275-(0.24917)));
            yy = -26.97821 + (((tickAnim - 9) / 1) * (-20.30292-(-26.97821)));
            zz = 8.98402 + (((tickAnim - 9) / 1) * (-20.67676-(8.98402)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright1, wingright1.rotateAngleX + (float) Math.toRadians(xx), wingright1.rotateAngleY + (float) Math.toRadians(yy), wingright1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 1) * (0.25-(0.5)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 1) / 1) * (-0.25-(0.25)));
            zz = 0 + (((tickAnim - 1) / 1) * (0.5-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.25 + (((tickAnim - 2) / 1) * (0-(-0.25)));
            zz = 0.5 + (((tickAnim - 2) / 1) * (0.5-(0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (0.5-(0)));
            zz = 0.5 + (((tickAnim - 3) / 0) * (0.5-(0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 3) / 2) * (0-(0.5)));
            zz = 0.5 + (((tickAnim - 3) / 2) * (0.5-(0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0.5-(0)));
            zz = 0.5 + (((tickAnim - 5) / 2) * (-0.5-(0.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 7) / 2) * (0.5-(0.5)));
            zz = -0.5 + (((tickAnim - 7) / 2) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 9) / 1) * (0.5-(0.5)));
            zz = -0.5 + (((tickAnim - 9) / 1) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingright1.rotationPointX = this.wingright1.rotationPointX + (float)(xx);
        this.wingright1.rotationPointY = this.wingright1.rotationPointY - (float)(yy);
        this.wingright1.rotationPointZ = this.wingright1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -2.5 + (((tickAnim - 0) / 1) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 30 + (((tickAnim - 0) / 1) * (11.25-(30)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -2.5 + (((tickAnim - 1) / 1) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 11.25 + (((tickAnim - 1) / 1) * (2.5-(11.25)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (2.5-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 2.5 + (((tickAnim - 2) / 1) * (5-(2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 3) / 0) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 5 + (((tickAnim - 3) / 0) * (20-(5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2.5 + (((tickAnim - 3) / 2) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (-5-(0)));
            zz = 20 + (((tickAnim - 3) / 2) * (22.5-(20)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 2.5 + (((tickAnim - 5) / 2) * (-5-(2.5)));
            yy = -5 + (((tickAnim - 5) / 2) * (0-(-5)));
            zz = 22.5 + (((tickAnim - 5) / 2) * (7.5-(22.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -5 + (((tickAnim - 7) / 2) * (-10-(-5)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 7.5 + (((tickAnim - 7) / 2) * (10-(7.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 9) / 1) * (-2.5-(-10)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 10 + (((tickAnim - 9) / 1) * (30-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright2, wingright2.rotateAngleX + (float) Math.toRadians(xx), wingright2.rotateAngleY + (float) Math.toRadians(yy), wingright2.rotateAngleZ + (float) Math.toRadians(zz));







        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 10 + (((tickAnim - 0) / 1) * (7.5-(10)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 7.5 + (((tickAnim - 1) / 1) * (10-(7.5)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 2) / 1) * (2.5-(10)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 3) / 0) * (0-(2.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (1.61452-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (-5.26116-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (-7.92129-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 1.61452 + (((tickAnim - 4) / 1) * (2.5-(1.61452)));
            yy = -5.26116 + (((tickAnim - 4) / 1) * (0-(-5.26116)));
            zz = -7.92129 + (((tickAnim - 4) / 1) * (0-(-7.92129)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 2.5 + (((tickAnim - 5) / 2) * (0-(2.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (2.5-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 2.5 + (((tickAnim - 9) / 1) * (10-(2.5)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright4, wingright4.rotateAngleX + (float) Math.toRadians(xx), wingright4.rotateAngleY + (float) Math.toRadians(yy), wingright4.rotateAngleZ + (float) Math.toRadians(zz));







        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 27.5 + (((tickAnim - 0) / 1) * (17.5-(27.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = -25 + (((tickAnim - 0) / 1) * (-15-(-25)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 17.5 + (((tickAnim - 1) / 1) * (15-(17.5)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = -15 + (((tickAnim - 1) / 1) * (-10-(-15)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 15 + (((tickAnim - 2) / 1) * (-2.5-(15)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -10 + (((tickAnim - 2) / 1) * (2.5-(-10)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -2.5 + (((tickAnim - 3) / 0) * (-15-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 2.5 + (((tickAnim - 3) / 0) * (2.5-(2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -15 + (((tickAnim - 3) / 2) * (-15-(-15)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 2.5 + (((tickAnim - 3) / 2) * (-7.5-(2.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -15 + (((tickAnim - 5) / 2) * (-10-(-15)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = -7.5 + (((tickAnim - 5) / 2) * (-15-(-7.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -10 + (((tickAnim - 7) / 2) * (-10-(-10)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = -15 + (((tickAnim - 7) / 2) * (-27.5-(-15)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 9) / 1) * (27.5-(-10)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = -27.5 + (((tickAnim - 9) / 1) * (-25-(-27.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handL, handL.rotateAngleX + (float) Math.toRadians(xx), handL.rotateAngleY + (float) Math.toRadians(yy), handL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -10.09882 + (((tickAnim - 0) / 1) * (-10-(-10.09882)));
            yy = 7.17582 + (((tickAnim - 0) / 1) * (-15-(7.17582)));
            zz = 6.37411 + (((tickAnim - 0) / 1) * (0-(6.37411)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -10 + (((tickAnim - 1) / 1) * (0-(-10)));
            yy = -15 + (((tickAnim - 1) / 1) * (-20-(-15)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (7.5-(0)));
            yy = -20 + (((tickAnim - 2) / 1) * (-25-(-20)));
            zz = 0 + (((tickAnim - 2) / 1) * (10-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 7.5 + (((tickAnim - 3) / 1) * (7.5-(7.5)));
            yy = -25 + (((tickAnim - 3) / 1) * (-32.5-(-25)));
            zz = 10 + (((tickAnim - 3) / 1) * (7.5-(10)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 7.5 + (((tickAnim - 4) / 2) * (5-(7.5)));
            yy = -32.5 + (((tickAnim - 4) / 2) * (-20-(-32.5)));
            zz = 7.5 + (((tickAnim - 4) / 2) * (-10-(7.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 6) / 2) * (0-(5)));
            yy = -20 + (((tickAnim - 6) / 2) * (5-(-20)));
            zz = -10 + (((tickAnim - 6) / 2) * (-10-(-10)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (-15.79176-(0)));
            yy = 5 + (((tickAnim - 8) / 1) * (22.24769-(5)));
            zz = -10 + (((tickAnim - 8) / 1) * (20.12906-(-10)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -15.79176 + (((tickAnim - 9) / 1) * (-10.09882-(-15.79176)));
            yy = 22.24769 + (((tickAnim - 9) / 1) * (7.17582-(22.24769)));
            zz = 20.12906 + (((tickAnim - 9) / 1) * (6.37411-(20.12906)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft1, wingleft1.rotateAngleX + (float) Math.toRadians(xx), wingleft1.rotateAngleY + (float) Math.toRadians(yy), wingleft1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 0) / 1) * (-0.25-(0.25)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.5-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = -0.25 + (((tickAnim - 1) / 1) * (0-(-0.25)));
            zz = 0.5 + (((tickAnim - 1) / 1) * (0.5-(0.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0.5-(0)));
            zz = 0.5 + (((tickAnim - 2) / 1) * (0.5-(0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 3) / 1) * (0-(0.5)));
            zz = 0.5 + (((tickAnim - 3) / 1) * (0.5-(0.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0.5-(0)));
            zz = 0.5 + (((tickAnim - 4) / 2) * (-0.5-(0.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 6) / 2) * (0.5-(0.5)));
            zz = -0.5 + (((tickAnim - 6) / 2) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 8) / 1) * (0.5-(0.5)));
            zz = -0.5 + (((tickAnim - 8) / 1) * (0-(-0.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 9) / 1) * (0.25-(0.5)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingleft1.rotationPointX = this.wingleft1.rotationPointX + (float)(xx);
        this.wingleft1.rotationPointY = this.wingleft1.rotationPointY - (float)(yy);
        this.wingleft1.rotationPointZ = this.wingleft1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -2.5 + (((tickAnim - 0) / 1) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = -11.25 + (((tickAnim - 0) / 1) * (-2.5-(-11.25)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (2.5-(0)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = -2.5 + (((tickAnim - 1) / 1) * (-5-(-2.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 2) / 1) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -5 + (((tickAnim - 2) / 1) * (-20-(-5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 2.5 + (((tickAnim - 3) / 1) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (5-(0)));
            zz = -20 + (((tickAnim - 3) / 1) * (-22.5-(-20)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 2.5 + (((tickAnim - 4) / 2) * (-5-(2.5)));
            yy = 5 + (((tickAnim - 4) / 2) * (0-(5)));
            zz = -22.5 + (((tickAnim - 4) / 2) * (-7.5-(-22.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -5 + (((tickAnim - 6) / 2) * (-10-(-5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = -7.5 + (((tickAnim - 6) / 2) * (-10-(-7.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -10 + (((tickAnim - 8) / 1) * (-2.5-(-10)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = -10 + (((tickAnim - 8) / 1) * (-30-(-10)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 9) / 1) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = -30 + (((tickAnim - 9) / 1) * (-11.25-(-30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft2, wingleft2.rotateAngleX + (float) Math.toRadians(xx), wingleft2.rotateAngleY + (float) Math.toRadians(yy), wingleft2.rotateAngleZ + (float) Math.toRadians(zz));







        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 7.5 + (((tickAnim - 0) / 1) * (10-(7.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 10 + (((tickAnim - 1) / 1) * (2.5-(10)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 2) / 1) * (0-(2.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (17.25-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (3.78875-(0)));
            yy = 17.25 + (((tickAnim - 3) / 1) * (9.55735-(17.25)));
            zz = 0 + (((tickAnim - 3) / 1) * (15.32481-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 3.78875 + (((tickAnim - 4) / 2) * (0-(3.78875)));
            yy = 9.55735 + (((tickAnim - 4) / 2) * (0-(9.55735)));
            zz = 15.32481 + (((tickAnim - 4) / 2) * (0-(15.32481)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (2.5-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 2.5 + (((tickAnim - 8) / 1) * (10-(2.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 9) / 1) * (7.5-(10)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft4, wingleft4.rotateAngleX + (float) Math.toRadians(xx), wingleft4.rotateAngleY + (float) Math.toRadians(yy), wingleft4.rotateAngleZ + (float) Math.toRadians(zz));







        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 17.5 + (((tickAnim - 0) / 1) * (15-(17.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 15 + (((tickAnim - 0) / 1) * (10-(15)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 15 + (((tickAnim - 1) / 1) * (-2.5-(15)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 10 + (((tickAnim - 1) / 1) * (-2.5-(10)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -2.5 + (((tickAnim - 2) / 1) * (-15-(-2.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -2.5 + (((tickAnim - 2) / 1) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -15 + (((tickAnim - 3) / 1) * (-15-(-15)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = -2.5 + (((tickAnim - 3) / 1) * (7.5-(-2.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -15 + (((tickAnim - 4) / 2) * (-10-(-15)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 7.5 + (((tickAnim - 4) / 2) * (15-(7.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 6) / 2) * (-10-(-10)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 15 + (((tickAnim - 6) / 2) * (27.5-(15)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -10 + (((tickAnim - 8) / 1) * (27.5-(-10)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 27.5 + (((tickAnim - 8) / 1) * (25-(27.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 27.5 + (((tickAnim - 9) / 1) * (17.5-(27.5)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 25 + (((tickAnim - 9) / 1) * (15-(25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR, handR.rotateAngleX + (float) Math.toRadians(xx), handR.rotateAngleY + (float) Math.toRadians(yy), handR.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraWukongopterus entity = (EntityPrehistoricFloraWukongopterus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -6.75 + (((tickAnim - 0) / 8) * (41.5692-(-6.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (-7.4242-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-1.06662-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 41.5692 + (((tickAnim - 8) / 5) * (13.6472-(41.5692)));
            yy = -7.4242 + (((tickAnim - 8) / 5) * (-5.36192-(-7.4242)));
            zz = -1.06662 + (((tickAnim - 8) / 5) * (-0.77034-(-1.06662)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 13.6472 + (((tickAnim - 13) / 8) * (-13.75-(13.6472)));
            yy = -5.36192 + (((tickAnim - 13) / 8) * (0-(-5.36192)));
            zz = -0.77034 + (((tickAnim - 13) / 8) * (0-(-0.77034)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -13.75 + (((tickAnim - 21) / 9) * (-6.75-(-13.75)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegL, upperlegL.rotateAngleX + (float) Math.toRadians(xx), upperlegL.rotateAngleY + (float) Math.toRadians(yy), upperlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.29-(0)));
            yy = -1.1 + (((tickAnim - 0) / 5) * (-0.9-(-1.1)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.25-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.29 + (((tickAnim - 5) / 3) * (0.375-(0.29)));
            yy = -0.9 + (((tickAnim - 5) / 3) * (-1.65-(-0.9)));
            zz = -0.25 + (((tickAnim - 5) / 3) * (-0.325-(-0.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0.375 + (((tickAnim - 8) / 5) * (0.27-(0.375)));
            yy = -1.65 + (((tickAnim - 8) / 5) * (-1.025-(-1.65)));
            zz = -0.325 + (((tickAnim - 8) / 5) * (-0.23-(-0.325)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0.27 + (((tickAnim - 13) / 8) * (0-(0.27)));
            yy = -1.025 + (((tickAnim - 13) / 8) * (-0.75-(-1.025)));
            zz = -0.23 + (((tickAnim - 13) / 8) * (0-(-0.23)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = -0.75 + (((tickAnim - 21) / 9) * (-1.1-(-0.75)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegL.rotationPointX = this.upperlegL.rotationPointX + (float)(xx);
        this.upperlegL.rotationPointY = this.upperlegL.rotationPointY - (float)(yy);
        this.upperlegL.rotationPointZ = this.upperlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 7.83188 + (((tickAnim - 0) / 8) * (-11.75-(7.83188)));
            yy = -3.25121 + (((tickAnim - 0) / 8) * (0-(-3.25121)));
            zz = 5.91859 + (((tickAnim - 0) / 8) * (0-(5.91859)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -11.75 + (((tickAnim - 8) / 5) * (25.40511-(-11.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (9.72421-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (21.84924-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 25.40511 + (((tickAnim - 13) / 5) * (-27.30176-(25.40511)));
            yy = 9.72421 + (((tickAnim - 13) / 5) * (3.73555-(9.72421)));
            zz = 21.84924 + (((tickAnim - 13) / 5) * (14.49663-(21.84924)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -27.30176 + (((tickAnim - 18) / 3) * (-15.66812-(-27.30176)));
            yy = 3.73555 + (((tickAnim - 18) / 3) * (-3.25121-(3.73555)));
            zz = 14.49663 + (((tickAnim - 18) / 3) * (5.91859-(14.49663)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -15.66812 + (((tickAnim - 21) / 9) * (7.83188-(-15.66812)));
            yy = -3.25121 + (((tickAnim - 21) / 9) * (-3.25121-(-3.25121)));
            zz = 5.91859 + (((tickAnim - 21) / 9) * (5.91859-(5.91859)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegL, lowerlegL.rotateAngleX + (float) Math.toRadians(xx), lowerlegL.rotateAngleY + (float) Math.toRadians(yy), lowerlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.075 + (((tickAnim - 0) / 2) * (-0.2-(0.075)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            yy = -0.2 + (((tickAnim - 2) / 6) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (-0.15-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0.34-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-0.325-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -0.15 + (((tickAnim - 13) / 5) * (-0.325-(-0.15)));
            yy = 0.34 + (((tickAnim - 13) / 5) * (1.575-(0.34)));
            zz = -0.325 + (((tickAnim - 13) / 5) * (-0.05-(-0.325)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -0.325 + (((tickAnim - 18) / 3) * (0-(-0.325)));
            yy = 1.575 + (((tickAnim - 18) / 3) * (-0.075-(1.575)));
            zz = -0.05 + (((tickAnim - 18) / 3) * (0.125-(-0.05)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = -0.075 + (((tickAnim - 21) / 9) * (0.075-(-0.075)));
            zz = 0.125 + (((tickAnim - 21) / 9) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegL.rotationPointX = this.lowerlegL.rotationPointX + (float)(xx);
        this.lowerlegL.rotationPointY = this.lowerlegL.rotationPointY - (float)(yy);
        this.lowerlegL.rotationPointZ = this.lowerlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -0.71927 + (((tickAnim - 0) / 8) * (-23.0426-(-0.71927)));
            yy = -27.0357 + (((tickAnim - 0) / 8) * (-28.029-(-27.0357)));
            zz = 1.42683 + (((tickAnim - 0) / 8) * (13.3479-(1.42683)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -23.0426 + (((tickAnim - 8) / 5) * (36.27658-(-23.0426)));
            yy = -28.029 + (((tickAnim - 8) / 5) * (-34.85269-(-28.029)));
            zz = 13.3479 + (((tickAnim - 8) / 5) * (8.53987-(13.3479)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 36.27658 + (((tickAnim - 13) / 5) * (27.48678-(36.27658)));
            yy = -34.85269 + (((tickAnim - 13) / 5) * (-25.62692-(-34.85269)));
            zz = 8.53987 + (((tickAnim - 13) / 5) * (6.75952-(8.53987)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 27.48678 + (((tickAnim - 18) / 3) * (31.857-(27.48678)));
            yy = -25.62692 + (((tickAnim - 18) / 3) * (-14.86352-(-25.62692)));
            zz = 6.75952 + (((tickAnim - 18) / 3) * (4.68245-(6.75952)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 31.857 + (((tickAnim - 21) / 9) * (-0.71927-(31.857)));
            yy = -14.86352 + (((tickAnim - 21) / 9) * (-27.0357-(-14.86352)));
            zz = 4.68245 + (((tickAnim - 21) / 9) * (1.42683-(4.68245)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footL, footL.rotateAngleX + (float) Math.toRadians(xx), footL.rotateAngleY + (float) Math.toRadians(yy), footL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0.65-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0.1-(0)));
            zz = 0.65 + (((tickAnim - 13) / 5) * (1.015-(0.65)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0.1 + (((tickAnim - 18) / 3) * (0.275-(0.1)));
            zz = 1.015 + (((tickAnim - 18) / 3) * (0-(1.015)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = 0.275 + (((tickAnim - 21) / 9) * (0-(0.275)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footL.rotationPointX = this.footL.rotationPointX + (float)(xx);
        this.footL.rotationPointY = this.footL.rotationPointY - (float)(yy);
        this.footL.rotationPointZ = this.footL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -1.53149 + (((tickAnim - 0) / 6) * (-13.21723-(-1.53149)));
            yy = 11.05023 + (((tickAnim - 0) / 6) * (-4.65267-(11.05023)));
            zz = -7.82023 + (((tickAnim - 0) / 6) * (24.26164-(-7.82023)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -13.21723 + (((tickAnim - 6) / 6) * (-0.88752-(-13.21723)));
            yy = -4.65267 + (((tickAnim - 6) / 6) * (-17.36897-(-4.65267)));
            zz = 24.26164 + (((tickAnim - 6) / 6) * (-1.59189-(24.26164)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = -0.88752 + (((tickAnim - 12) / 18) * (-1.53149-(-0.88752)));
            yy = -17.36897 + (((tickAnim - 12) / 18) * (11.05023-(-17.36897)));
            zz = -1.59189 + (((tickAnim - 12) / 18) * (-7.82023-(-1.59189)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright1, wingright1.rotateAngleX + (float) Math.toRadians(xx), wingright1.rotateAngleY + (float) Math.toRadians(yy), wingright1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -2.925 + (((tickAnim - 0) / 5) * (-1.035-(-2.925)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.545-(0)));
            zz = 1.275 + (((tickAnim - 0) / 5) * (0.655-(1.275)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -1.035 + (((tickAnim - 5) / 6) * (0-(-1.035)));
            yy = 0.545 + (((tickAnim - 5) / 6) * (-0.825-(0.545)));
            zz = 0.655 + (((tickAnim - 5) / 6) * (1.125-(0.655)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 11) / 19) * (-2.925-(0)));
            yy = -0.825 + (((tickAnim - 11) / 19) * (0-(-0.825)));
            zz = 1.125 + (((tickAnim - 11) / 19) * (1.275-(1.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingright1.rotationPointX = this.wingright1.rotationPointX + (float)(xx);
        this.wingright1.rotationPointY = this.wingright1.rotationPointY - (float)(yy);
        this.wingright1.rotationPointZ = this.wingright1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-4.99077-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.23527-(0)));
            zz = 4 + (((tickAnim - 0) / 6) * (-16.77386-(4)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -4.99077 + (((tickAnim - 6) / 6) * (0-(-4.99077)));
            yy = -0.23527 + (((tickAnim - 6) / 6) * (0-(-0.23527)));
            zz = -16.77386 + (((tickAnim - 6) / 6) * (0-(-16.77386)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 18) * (4-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright2, wingright2.rotateAngleX + (float) Math.toRadians(xx), wingright2.rotateAngleY + (float) Math.toRadians(yy), wingright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.2-(0)));
            yy = 0.4 + (((tickAnim - 0) / 5) * (0.475-(0.4)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -0.2 + (((tickAnim - 5) / 6) * (0-(-0.2)));
            yy = 0.475 + (((tickAnim - 5) / 6) * (0.6-(0.475)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            yy = 0.6 + (((tickAnim - 11) / 19) * (0.4-(0.6)));
            zz = 0 + (((tickAnim - 11) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingright2.rotationPointX = this.wingright2.rotationPointX + (float)(xx);
        this.wingright2.rotationPointY = this.wingright2.rotationPointY - (float)(yy);
        this.wingright2.rotationPointZ = this.wingright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 5.25 + (((tickAnim - 0) / 6) * (1.07727-(5.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (6.79494-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-75.73006-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 1.07727 + (((tickAnim - 6) / 6) * (0-(1.07727)));
            yy = 6.79494 + (((tickAnim - 6) / 6) * (0-(6.79494)));
            zz = -75.73006 + (((tickAnim - 6) / 6) * (0-(-75.73006)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 12) / 18) * (5.25-(0)));
            yy = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handL, handL.rotateAngleX + (float) Math.toRadians(xx), handL.rotateAngleY + (float) Math.toRadians(yy), handL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-0.125-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -0.125 + (((tickAnim - 6) / 5) * (0-(-0.125)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handL.rotationPointX = this.handL.rotationPointX + (float)(xx);
        this.handL.rotationPointY = this.handL.rotationPointY - (float)(yy);
        this.handL.rotationPointZ = this.handL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright3, wingright3.rotateAngleX + (float) Math.toRadians(xx), wingright3.rotateAngleY + (float) Math.toRadians(yy), wingright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            yy = -0.5 + (((tickAnim - 11) / 19) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 11) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingright3.rotationPointX = this.wingright3.rotationPointX + (float)(xx);
        this.wingright3.rotationPointY = this.wingright3.rotationPointY - (float)(yy);
        this.wingright3.rotationPointZ = this.wingright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 5 + (((tickAnim - 6) / 6) * (15.75-(5)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 15.75 + (((tickAnim - 12) / 18) * (0-(15.75)));
            yy = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright4, wingright4.rotateAngleX + (float) Math.toRadians(xx), wingright4.rotateAngleY + (float) Math.toRadians(yy), wingright4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5))*2), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+120))*3), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-3));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)((Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*360/1.5+30))*-0.2);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)((-0.025+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*700/1.5+30))*-0.2);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)((Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*750/1.5+35))*-0.5);


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5))*0.5), body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+120))*-3.5), body1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5+50))*-3), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-2), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5+50))*-5), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-2), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-3));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-200))*5), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+200))*3), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-200))*2), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+100))*-3), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-250))*-2.5), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+100))*-3), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5+50))*-3), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-2), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5+50))*-2), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-2.5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-3));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 37.8192 + (((tickAnim - 0) / 3) * (6.01451-(37.8192)));
            yy = -7.4242 + (((tickAnim - 0) / 3) * (-4.53701-(-7.4242)));
            zz = -1.06662 + (((tickAnim - 0) / 3) * (-0.65183-(-1.06662)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 6.01451 + (((tickAnim - 3) / 5) * (-13.75-(6.01451)));
            yy = -4.53701 + (((tickAnim - 3) / 5) * (0-(-4.53701)));
            zz = -0.65183 + (((tickAnim - 3) / 5) * (0-(-0.65183)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = -13.75 + (((tickAnim - 8) / 22) * (37.8192-(-13.75)));
            yy = 0 + (((tickAnim - 8) / 22) * (-7.4242-(0)));
            zz = 0 + (((tickAnim - 8) / 22) * (-1.06662-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegR, upperlegR.rotateAngleX + (float) Math.toRadians(xx), upperlegR.rotateAngleY + (float) Math.toRadians(yy), upperlegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -1.075 + (((tickAnim - 0) / 3) * (-0.225-(-1.075)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.225 + (((tickAnim - 3) / 5) * (-0.75-(-0.225)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 8) / 19) * (0-(0)));
            yy = -0.75 + (((tickAnim - 8) / 19) * (-0.385-(-0.75)));
            zz = 0 + (((tickAnim - 8) / 19) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = -0.385 + (((tickAnim - 27) / 3) * (-1.075-(-0.385)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegR.rotationPointX = this.upperlegR.rotationPointX + (float)(xx);
        this.upperlegR.rotationPointY = this.upperlegR.rotationPointY - (float)(yy);
        this.upperlegR.rotationPointZ = this.upperlegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -8.75 + (((tickAnim - 0) / 3) * (30.22396-(-8.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (-5.6002-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-12.87079-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 30.22396 + (((tickAnim - 3) / 2) * (-7.33791-(30.22396)));
            yy = -5.6002 + (((tickAnim - 3) / 2) * (-5.31288-(-5.6002)));
            zz = -12.87079 + (((tickAnim - 3) / 2) * (-10.57252-(-12.87079)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -7.33791 + (((tickAnim - 5) / 3) * (-15.66812-(-7.33791)));
            yy = -5.31288 + (((tickAnim - 5) / 3) * (-3.25121-(-5.31288)));
            zz = -10.57252 + (((tickAnim - 5) / 3) * (5.91859-(-10.57252)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = -15.66812 + (((tickAnim - 8) / 22) * (-8.75-(-15.66812)));
            yy = -3.25121 + (((tickAnim - 8) / 22) * (0-(-3.25121)));
            zz = 5.91859 + (((tickAnim - 8) / 22) * (0-(5.91859)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegR, lowerlegR.rotateAngleX + (float) Math.toRadians(xx), lowerlegR.rotateAngleY + (float) Math.toRadians(yy), lowerlegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.35-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0.2-(0)));
            yy = 0.125 + (((tickAnim - 3) / 2) * (1.705-(0.125)));
            zz = -0.35 + (((tickAnim - 3) / 2) * (-0.15-(-0.35)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.2 + (((tickAnim - 5) / 3) * (0-(0.2)));
            yy = 1.705 + (((tickAnim - 5) / 3) * (0-(1.705)));
            zz = -0.15 + (((tickAnim - 5) / 3) * (0-(-0.15)));
        }
        else if (tickAnim >= 8 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 8) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 16) * (0.45-(0)));
            zz = 0 + (((tickAnim - 8) / 16) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = 0.45 + (((tickAnim - 24) / 6) * (0-(0.45)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegR.rotationPointX = this.lowerlegR.rotationPointX + (float)(xx);
        this.lowerlegR.rotationPointY = this.lowerlegR.rotationPointY - (float)(yy);
        this.lowerlegR.rotationPointZ = this.lowerlegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -16.79259 + (((tickAnim - 0) / 3) * (57.75117-(-16.79259)));
            yy = 28.02905 + (((tickAnim - 0) / 3) * (23.87256-(28.02905)));
            zz = -13.34791 + (((tickAnim - 0) / 3) * (-15.40035-(-13.34791)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 57.75117 + (((tickAnim - 3) / 2) * (36.75516-(57.75117)));
            yy = 23.87256 + (((tickAnim - 3) / 2) * (21.29388-(23.87256)));
            zz = -15.40035 + (((tickAnim - 3) / 2) * (-16.67368-(-15.40035)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 36.75516 + (((tickAnim - 5) / 3) * (30.89136-(36.75516)));
            yy = 21.29388 + (((tickAnim - 5) / 3) * (17.34093-(21.29388)));
            zz = -16.67368 + (((tickAnim - 5) / 3) * (-18.62562-(-16.67368)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = 30.89136 + (((tickAnim - 8) / 22) * (-16.79259-(30.89136)));
            yy = 17.34093 + (((tickAnim - 8) / 22) * (28.02905-(17.34093)));
            zz = -18.62562 + (((tickAnim - 8) / 22) * (-13.34791-(-18.62562)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footR, footR.rotateAngleX + (float) Math.toRadians(xx), footR.rotateAngleY + (float) Math.toRadians(yy), footR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.45-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.15 + (((tickAnim - 3) / 2) * (0.225-(-0.15)));
            zz = 0.45 + (((tickAnim - 3) / 2) * (0.45-(0.45)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.225 + (((tickAnim - 5) / 3) * (0-(0.225)));
            zz = 0.45 + (((tickAnim - 5) / 3) * (0-(0.45)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footR.rotationPointX = this.footR.rotationPointX + (float)(xx);
        this.footR.rotationPointY = this.footR.rotationPointY - (float)(yy);
        this.footR.rotationPointZ = this.footR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 10 + (((tickAnim - 0) / 13) * (0-(10)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (10-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft4, wingleft4.rotateAngleX + (float) Math.toRadians(xx), wingleft4.rotateAngleY + (float) Math.toRadians(yy), wingleft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-4.75-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = -4.75 + (((tickAnim - 13) / 7) * (22.13-(-4.75)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -4.75 + (((tickAnim - 20) / 6) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 22.13 + (((tickAnim - 20) / 6) * (0-(22.13)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft2, wingleft2.rotateAngleX + (float) Math.toRadians(xx), wingleft2.rotateAngleY + (float) Math.toRadians(yy), wingleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0.125 + (((tickAnim - 0) / 13) * (1.225-(0.125)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0.35-(0)));
            yy = 1.225 + (((tickAnim - 13) / 7) * (0.68-(1.225)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0.35 + (((tickAnim - 20) / 6) * (0-(0.35)));
            yy = 0.68 + (((tickAnim - 20) / 6) * (0.125-(0.68)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingleft2.rotationPointX = this.wingleft2.rotationPointX + (float)(xx);
        this.wingleft2.rotationPointY = this.wingleft2.rotationPointY - (float)(yy);
        this.wingleft2.rotationPointZ = this.wingleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 1.38707 + (((tickAnim - 0) / 13) * (-0.10954-(1.38707)));
            yy = 3.9612 + (((tickAnim - 0) / 13) * (-3.56975-(3.9612)));
            zz = 3.30437 + (((tickAnim - 0) / 13) * (11.30921-(3.30437)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -0.10954 + (((tickAnim - 13) / 7) * (-7.92792-(-0.10954)));
            yy = -3.56975 + (((tickAnim - 13) / 7) * (5.68346-(-3.56975)));
            zz = 11.30921 + (((tickAnim - 13) / 7) * (-21.30745-(11.30921)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -7.92792 + (((tickAnim - 20) / 6) * (1.4752-(-7.92792)));
            yy = 5.68346 + (((tickAnim - 20) / 6) * (13.9581-(5.68346)));
            zz = -21.30745 + (((tickAnim - 20) / 6) * (3.56881-(-21.30745)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 1.4752 + (((tickAnim - 26) / 4) * (1.38707-(1.4752)));
            yy = 13.9581 + (((tickAnim - 26) / 4) * (3.9612-(13.9581)));
            zz = 3.56881 + (((tickAnim - 26) / 4) * (3.30437-(3.56881)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft1, wingleft1.rotateAngleX + (float) Math.toRadians(xx), wingleft1.rotateAngleY + (float) Math.toRadians(yy), wingleft1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 1.45 + (((tickAnim - 0) / 13) * (2.4-(1.45)));
            yy = -0.425 + (((tickAnim - 0) / 13) * (-0.425-(-0.425)));
            zz = 0.5 + (((tickAnim - 0) / 13) * (1.375-(0.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 2.4 + (((tickAnim - 13) / 7) * (0.97-(2.4)));
            yy = -0.425 + (((tickAnim - 13) / 7) * (-0.23-(-0.425)));
            zz = 1.375 + (((tickAnim - 13) / 7) * (0.52-(1.375)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0.97 + (((tickAnim - 20) / 6) * (0.275-(0.97)));
            yy = -0.23 + (((tickAnim - 20) / 6) * (-0.425-(-0.23)));
            zz = 0.52 + (((tickAnim - 20) / 6) * (0.15-(0.52)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0.275 + (((tickAnim - 26) / 4) * (1.45-(0.275)));
            yy = -0.425 + (((tickAnim - 26) / 4) * (-0.425-(-0.425)));
            zz = 0.15 + (((tickAnim - 26) / 4) * (0.5-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingleft1.rotationPointX = this.wingleft1.rotationPointX + (float)(xx);
        this.wingleft1.rotationPointY = this.wingleft1.rotationPointY - (float)(yy);
        this.wingleft1.rotationPointZ = this.wingleft1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6.29355-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-3.04221-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (4.1067-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 6.29355 + (((tickAnim - 15) / 6) * (0-(6.29355)));
            yy = -3.04221 + (((tickAnim - 15) / 6) * (-20.75-(-3.04221)));
            zz = 4.1067 + (((tickAnim - 15) / 6) * (79.25-(4.1067)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            yy = -20.75 + (((tickAnim - 21) / 5) * (0-(-20.75)));
            zz = 79.25 + (((tickAnim - 21) / 5) * (0-(79.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR, handR.rotateAngleX + (float) Math.toRadians(xx), handR.rotateAngleY + (float) Math.toRadians(yy), handR.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animClimb(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraWukongopterus entity = (EntityPrehistoricFloraWukongopterus) entitylivingbaseIn;
        int animCycle = 27;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*785/1.5))*1), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*392/1.5+105))*3), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*392/1.5))*-1));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)((Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*360/1.5-10))*-0.2);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)((-0.025+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*700/1.5+55))*-0.2);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)((Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*750/1.5+65))*-0.2);


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*785/1.5))*0.5), body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*392/1.5+120))*-3.5), body1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*392/1.5))*3));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(4.5), tail1.rotateAngleY + (float) Math.toRadians(0), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*785/1.5+50))*-3), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*392/1.5+50))*-2), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*392/1.5+50))*-3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*785/1.5+50))*-3), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*392/1.5+50))*-2), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*392/1.5+50))*-3));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -22.01673 + (((tickAnim - 0) / 8) * (20.5-(-22.01673)));
            yy = -3.93219 + (((tickAnim - 0) / 8) * (0-(-3.93219)));
            zz = -4.52709 + (((tickAnim - 0) / 8) * (0-(-4.52709)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 20.5 + (((tickAnim - 8) / 7) * (12.32794-(20.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (-5.84234-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (24.74261-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 12.32794 + (((tickAnim - 15) / 7) * (-28.66426-(12.32794)));
            yy = -5.84234 + (((tickAnim - 15) / 7) * (-5.05547-(-5.84234)));
            zz = 24.74261 + (((tickAnim - 15) / 7) * (8.1294-(24.74261)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -28.66426 + (((tickAnim - 22) / 6) * (-22.01673-(-28.66426)));
            yy = -5.05547 + (((tickAnim - 22) / 6) * (-3.93219-(-5.05547)));
            zz = 8.1294 + (((tickAnim - 22) / 6) * (-4.52709-(8.1294)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegL, upperlegL.rotateAngleX + (float) Math.toRadians(xx), upperlegL.rotateAngleY + (float) Math.toRadians(yy), upperlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1.4 + (((tickAnim - 0) / 8) * (0-(1.4)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 8) / 14) * (1.725-(0)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 1.725 + (((tickAnim - 22) / 6) * (1.4-(1.725)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegL.rotationPointX = this.upperlegL.rotationPointX + (float)(xx);
        this.upperlegL.rotationPointY = this.upperlegL.rotationPointY - (float)(yy);
        this.upperlegL.rotationPointZ = this.upperlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 7.75 + (((tickAnim - 8) / 7) * (4.15977-(7.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (7.33227-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-7.26788-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 4.15977 + (((tickAnim - 15) / 7) * (0-(4.15977)));
            yy = 7.33227 + (((tickAnim - 15) / 7) * (0-(7.33227)));
            zz = -7.26788 + (((tickAnim - 15) / 7) * (-28.75-(-7.26788)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = -28.75 + (((tickAnim - 22) / 6) * (0-(-28.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegL, lowerlegL.rotateAngleX + (float) Math.toRadians(xx), lowerlegL.rotateAngleY + (float) Math.toRadians(yy), lowerlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 7.25 + (((tickAnim - 0) / 8) * (-21.52952-(7.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (-41.26321-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (14.99287-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -21.52952 + (((tickAnim - 8) / 7) * (33.32571-(-21.52952)));
            yy = -41.26321 + (((tickAnim - 8) / 7) * (-28.56683-(-41.26321)));
            zz = 14.99287 + (((tickAnim - 8) / 7) * (10.37968-(14.99287)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 33.32571 + (((tickAnim - 15) / 7) * (-5.25152-(33.32571)));
            yy = -28.56683 + (((tickAnim - 15) / 7) * (16.97045-(-28.56683)));
            zz = 10.37968 + (((tickAnim - 15) / 7) * (15.95412-(10.37968)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -5.25152 + (((tickAnim - 22) / 6) * (7.25-(-5.25152)));
            yy = 16.97045 + (((tickAnim - 22) / 6) * (0-(16.97045)));
            zz = 15.95412 + (((tickAnim - 22) / 6) * (0-(15.95412)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footL, footL.rotateAngleX + (float) Math.toRadians(xx), footL.rotateAngleY + (float) Math.toRadians(yy), footL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 20.5 + (((tickAnim - 0) / 4) * (10.41047-(20.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (2.20739-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-22.9636-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 10.41047 + (((tickAnim - 4) / 5) * (-28.66426-(10.41047)));
            yy = 2.20739 + (((tickAnim - 4) / 5) * (-5.05547-(2.20739)));
            zz = -22.9636 + (((tickAnim - 4) / 5) * (8.1294-(-22.9636)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -28.66426 + (((tickAnim - 9) / 11) * (2.04013-(-28.66426)));
            yy = -5.05547 + (((tickAnim - 9) / 11) * (-1.88518-(-5.05547)));
            zz = 8.1294 + (((tickAnim - 9) / 11) * (-0.33843-(8.1294)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 2.04013 + (((tickAnim - 20) / 8) * (20.5-(2.04013)));
            yy = -1.88518 + (((tickAnim - 20) / 8) * (0-(-1.88518)));
            zz = -0.33843 + (((tickAnim - 20) / 8) * (0-(-0.33843)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegR, upperlegR.rotateAngleX + (float) Math.toRadians(xx), upperlegR.rotateAngleY + (float) Math.toRadians(yy), upperlegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-1.725-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 28) {
            xx = -1.725 + (((tickAnim - 9) / 19) * (0-(-1.725)));
            yy = 0 + (((tickAnim - 9) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegR.rotationPointX = this.upperlegR.rotationPointX + (float)(xx);
        this.upperlegR.rotationPointY = this.upperlegR.rotationPointY - (float)(yy);
        this.upperlegR.rotationPointZ = this.upperlegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 7.75 + (((tickAnim - 0) / 4) * (5.66181-(7.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (-3.43918-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (3.28539-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 5.66181 + (((tickAnim - 4) / 5) * (0-(5.66181)));
            yy = -3.43918 + (((tickAnim - 4) / 5) * (0-(-3.43918)));
            zz = 3.28539 + (((tickAnim - 4) / 5) * (0-(3.28539)));
        }
        else if (tickAnim >= 9 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 9) / 19) * (7.75-(0)));
            yy = 0 + (((tickAnim - 9) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegR, lowerlegR.rotateAngleX + (float) Math.toRadians(xx), lowerlegR.rotateAngleY + (float) Math.toRadians(yy), lowerlegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -31.04585 + (((tickAnim - 0) / 4) * (-2.41089-(-31.04585)));
            yy = 11.65399 + (((tickAnim - 0) / 4) * (24.77522-(11.65399)));
            zz = 0.42084 + (((tickAnim - 0) / 4) * (-25.86111-(0.42084)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -2.41089 + (((tickAnim - 4) / 5) * (16.09564-(-2.41089)));
            yy = 24.77522 + (((tickAnim - 4) / 5) * (7.18246-(24.77522)));
            zz = -25.86111 + (((tickAnim - 4) / 5) * (-9.11786-(-25.86111)));
        }
        else if (tickAnim >= 9 && tickAnim < 28) {
            xx = 16.09564 + (((tickAnim - 9) / 19) * (-31.04585-(16.09564)));
            yy = 7.18246 + (((tickAnim - 9) / 19) * (11.65399-(7.18246)));
            zz = -9.11786 + (((tickAnim - 9) / 19) * (0.42084-(-9.11786)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footR, footR.rotateAngleX + (float) Math.toRadians(xx), footR.rotateAngleY + (float) Math.toRadians(yy), footR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 7.31638 + (((tickAnim - 0) / 4) * (8.30101-(7.31638)));
            yy = 7.32801 + (((tickAnim - 0) / 4) * (18.29879-(7.32801)));
            zz = 0.10058 + (((tickAnim - 0) / 4) * (4.05181-(0.10058)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 8.30101 + (((tickAnim - 4) / 4) * (6.43454-(8.30101)));
            yy = 18.29879 + (((tickAnim - 4) / 4) * (5.0512-(18.29879)));
            zz = 4.05181 + (((tickAnim - 4) / 4) * (25.3762-(4.05181)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 6.43454 + (((tickAnim - 8) / 8) * (0-(6.43454)));
            yy = 5.0512 + (((tickAnim - 8) / 8) * (-19.75-(5.0512)));
            zz = 25.3762 + (((tickAnim - 8) / 8) * (0-(25.3762)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 16) / 12) * (7.31638-(0)));
            yy = -19.75 + (((tickAnim - 16) / 12) * (7.32801-(-19.75)));
            zz = 0 + (((tickAnim - 16) / 12) * (0.10058-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright1, wingright1.rotateAngleX + (float) Math.toRadians(xx), wingright1.rotateAngleY + (float) Math.toRadians(yy), wingright1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (-19.87-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = -19.87 + (((tickAnim - 8) / 8) * (0-(-19.87)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright2, wingright2.rotateAngleX + (float) Math.toRadians(xx), wingright2.rotateAngleY + (float) Math.toRadians(yy), wingright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright3, wingright3.rotateAngleX + (float) Math.toRadians(xx), wingright3.rotateAngleY + (float) Math.toRadians(yy), wingright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (17-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 17 + (((tickAnim - 10) / 5) * (17-(17)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 17 + (((tickAnim - 15) / 13) * (0-(17)));
            yy = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright4, wingright4.rotateAngleX + (float) Math.toRadians(xx), wingright4.rotateAngleY + (float) Math.toRadians(yy), wingright4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (-43.25-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = -43.25 + (((tickAnim - 13) / 5) * (0-(-43.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handL, handL.rotateAngleX + (float) Math.toRadians(xx), handL.rotateAngleY + (float) Math.toRadians(yy), handL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (8.83365-(0)));
            yy = 19.75 + (((tickAnim - 0) / 14) * (-18.05888-(19.75)));
            zz = 0 + (((tickAnim - 0) / 14) * (-0.88103-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 8.83365 + (((tickAnim - 14) / 6) * (5.94342-(8.83365)));
            yy = -18.05888 + (((tickAnim - 14) / 6) * (-2.03527-(-18.05888)));
            zz = -0.88103 + (((tickAnim - 14) / 6) * (-26.89743-(-0.88103)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 5.94342 + (((tickAnim - 20) / 8) * (0-(5.94342)));
            yy = -2.03527 + (((tickAnim - 20) / 8) * (19.75-(-2.03527)));
            zz = -26.89743 + (((tickAnim - 20) / 8) * (0-(-26.89743)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft1, wingleft1.rotateAngleX + (float) Math.toRadians(xx), wingleft1.rotateAngleY + (float) Math.toRadians(yy), wingleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-1.25-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = -1.25 + (((tickAnim - 14) / 6) * (23.5-(-1.25)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 23.5 + (((tickAnim - 20) / 8) * (0-(23.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft2, wingleft2.rotateAngleX + (float) Math.toRadians(xx), wingleft2.rotateAngleY + (float) Math.toRadians(yy), wingleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 17 + (((tickAnim - 0) / 14) * (0-(17)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (17-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 17 + (((tickAnim - 20) / 8) * (17-(17)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft4, wingleft4.rotateAngleX + (float) Math.toRadians(xx), wingleft4.rotateAngleY + (float) Math.toRadians(yy), wingleft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (48-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 48 + (((tickAnim - 20) / 8) * (0-(48)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR, handR.rotateAngleX + (float) Math.toRadians(xx), handR.rotateAngleY + (float) Math.toRadians(yy), handR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(6.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*785/1.5-200))*2), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*392/1.5+200))*3), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*392/1.5))*-1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*785/1.5-200))*1), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*392/1.5+100))*-3), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*392/1.5))*-1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-6), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-1-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = -1 + (((tickAnim - 7) / 7) * (0-(-1)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (-1-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = -1 + (((tickAnim - 21) / 7) * (0-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);

    }

    public void animFly(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraWukongopterus entity = (EntityPrehistoricFloraWukongopterus) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 60) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 60) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-1.75 + (((tickAnim - 0) / 30) * (-3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-1.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-3.25-(-3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 30) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-3.25 + (((tickAnim - 60) / 10) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-3.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-1.75-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5 + (((tickAnim - 0) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5 + (((tickAnim - 30) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5 + (((tickAnim - 60) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5 + (((tickAnim - 70) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 0) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 30) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 60) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 70) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5 + (((tickAnim - 0) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5 + (((tickAnim - 30) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5 + (((tickAnim - 60) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5 + (((tickAnim - 70) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 0) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 30) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 60) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 70) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegL, upperlegL.rotateAngleX + (float) Math.toRadians(xx), upperlegL.rotateAngleY + (float) Math.toRadians(yy), upperlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20 + (((tickAnim - 0) / 30) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 30) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            zz = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5 + (((tickAnim - 30) / 30) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            zz = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5 + (((tickAnim - 60) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft1, wingleft1.rotateAngleX + (float) Math.toRadians(xx), wingleft1.rotateAngleY + (float) Math.toRadians(yy), wingleft1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingleft1.rotationPointX = this.wingleft1.rotationPointX + (float)(xx);
        this.wingleft1.rotationPointY = this.wingleft1.rotationPointY - (float)(yy);
        this.wingleft1.rotationPointZ = this.wingleft1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0.4984+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 0) / 30) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-0.4984+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.25 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-13 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-13)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (0.9968+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.0007-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0.9968+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 70) / 10) * (-0.4984+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(0.9968+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.0007 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.0007)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-13-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft2, wingleft2.rotateAngleX + (float) Math.toRadians(xx), wingleft2.rotateAngleY + (float) Math.toRadians(yy), wingleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 60) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft3, wingleft3.rotateAngleX + (float) Math.toRadians(xx), wingleft3.rotateAngleY + (float) Math.toRadians(yy), wingleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5 + (((tickAnim - 30) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*15-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*15 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*15)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft4, wingleft4.rotateAngleX + (float) Math.toRadians(xx), wingleft4.rotateAngleY + (float) Math.toRadians(yy), wingleft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20 + (((tickAnim - 0) / 30) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 30) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            zz = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 30) / 30) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 60) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            zz = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 60) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5 + (((tickAnim - 70) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright1, wingright1.rotateAngleX + (float) Math.toRadians(xx), wingright1.rotateAngleY + (float) Math.toRadians(yy), wingright1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingright1.rotationPointX = this.wingright1.rotationPointX + (float)(xx);
        this.wingright1.rotationPointY = this.wingright1.rotationPointY - (float)(yy);
        this.wingright1.rotationPointZ = this.wingright1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0.2356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 0) / 30) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-0.2356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = -4.234+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(-4.234+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (0.4986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 60) / 10) * (-3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0.4986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 70) / 10) * (-0.2356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(0.4986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = -3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 70) / 10) * (-4.234+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(-3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright2, wingright2.rotateAngleX + (float) Math.toRadians(xx), wingright2.rotateAngleY + (float) Math.toRadians(yy), wingright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25-(0)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5 + (((tickAnim - 30) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25 + (((tickAnim - 60) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5 + (((tickAnim - 60) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25 + (((tickAnim - 70) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright3, wingright3.rotateAngleX + (float) Math.toRadians(xx), wingright3.rotateAngleY + (float) Math.toRadians(yy), wingright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-15-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-15 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-15)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright4, wingright4.rotateAngleX + (float) Math.toRadians(xx), wingright4.rotateAngleY + (float) Math.toRadians(yy), wingright4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5 + (((tickAnim - 0) / 30) * (-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5-(-1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-9-(-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-9 + (((tickAnim - 60) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-9)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5 + (((tickAnim - 70) / 10) * (-1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 30) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 60) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 70) / 10) * (4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5 + (((tickAnim - 0) / 30) * (-5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5-(-6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5 + (((tickAnim - 30) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5-(-5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5 + (((tickAnim - 30) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5 + (((tickAnim - 60) / 10) * (-8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5 + (((tickAnim - 70) / 10) * (-6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5-(-8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5 + (((tickAnim - 70) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5 + (((tickAnim - 30) / 30) * (-11.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10 + (((tickAnim - 30) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10 + (((tickAnim - 30) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -11.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5-(-11.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegR, upperlegR.rotateAngleX + (float) Math.toRadians(xx), upperlegR.rotateAngleY + (float) Math.toRadians(yy), upperlegR.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animFlyFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraWukongopterus entity = (EntityPrehistoricFloraWukongopterus) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*2.5));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*-0.5);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-2);


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*-2.5), body1.rotateAngleY + (float) Math.toRadians(0), body1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+120))*-2.5));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(2.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*-5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-2.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*-2.5), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-2.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-2.5), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-2.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*-2.5), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-2.5), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperlegL, upperlegL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*5), upperlegL.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5), upperlegL.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*-10));


        this.setRotateAngle(lowerlegL, lowerlegL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*-5), lowerlegL.rotateAngleY + (float) Math.toRadians(0), lowerlegL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(footL, footL.rotateAngleX + (float) Math.toRadians(0), footL.rotateAngleY + (float) Math.toRadians(0), footL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(wingleft1, wingleft1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+75))*-10), wingleft1.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+105))*-5), wingleft1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-30));
        this.wingleft1.rotationPointX = this.wingleft1.rotationPointX + (float)(0);
        this.wingleft1.rotationPointY = this.wingleft1.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*0.5);
        this.wingleft1.rotationPointZ = this.wingleft1.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.2493+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 0) / 5) * (1.95525-(-0.2493+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 1.95525 + (((tickAnim - 5) / 4) * (2.7507+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(1.95525)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75 + (((tickAnim - 5) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20 + (((tickAnim - 5) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 2.7507+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 9) / 9) * (6.2507+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(2.7507+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75 + (((tickAnim - 9) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20 + (((tickAnim - 9) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20)));
        }
        else if (tickAnim >= 18 && tickAnim < 48) {
            xx = 6.2507+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 18) / 30) * (0.63726-(6.2507+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75 + (((tickAnim - 18) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20 + (((tickAnim - 18) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20)));
        }
        else if (tickAnim >= 48 && tickAnim < 68) {
            xx = 0.63726 + (((tickAnim - 48) / 20) * (0.01476-(0.63726)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75 + (((tickAnim - 48) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20 + (((tickAnim - 48) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 0.01476 + (((tickAnim - 68) / 7) * (-0.40802-(0.01476)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75 + (((tickAnim - 68) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20 + (((tickAnim - 68) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = -0.40802 + (((tickAnim - 75) / 3) * (-1.33444-(-0.40802)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75 + (((tickAnim - 75) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20 + (((tickAnim - 75) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = -1.33444 + (((tickAnim - 78) / 2) * (-0.2493+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(-1.33444)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75 + (((tickAnim - 78) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20 + (((tickAnim - 78) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft2, wingleft2.rotateAngleX + (float) Math.toRadians(xx), wingleft2.rotateAngleY + (float) Math.toRadians(yy), wingleft2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(wingleft3, wingleft3.rotateAngleX + (float) Math.toRadians(0), wingleft3.rotateAngleY + (float) Math.toRadians(0), wingleft3.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*-25));


        this.setRotateAngle(wingleft4, wingleft4.rotateAngleX + (float) Math.toRadians(0), wingleft4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*10), wingleft4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(handL, handL.rotateAngleX + (float) Math.toRadians(0), handL.rotateAngleY + (float) Math.toRadians(-35), handL.rotateAngleZ + (float) Math.toRadians(87.5));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10 + (((tickAnim - 2) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5 + (((tickAnim - 2) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30 + (((tickAnim - 2) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10 + (((tickAnim - 3) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5 + (((tickAnim - 3) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30 + (((tickAnim - 3) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10 + (((tickAnim - 4) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5 + (((tickAnim - 4) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30 + (((tickAnim - 4) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10 + (((tickAnim - 5) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5 + (((tickAnim - 5) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30 + (((tickAnim - 5) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10 + (((tickAnim - 7) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5 + (((tickAnim - 7) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30 + (((tickAnim - 7) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10 + (((tickAnim - 11) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5 + (((tickAnim - 11) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30 + (((tickAnim - 11) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10 + (((tickAnim - 12) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5 + (((tickAnim - 12) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30 + (((tickAnim - 12) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10 + (((tickAnim - 13) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5 + (((tickAnim - 13) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30 + (((tickAnim - 13) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10 + (((tickAnim - 13) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+75))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5 + (((tickAnim - 13) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+105))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30 + (((tickAnim - 13) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright1, wingright1.rotateAngleX + (float) Math.toRadians(xx), wingright1.rotateAngleY + (float) Math.toRadians(yy), wingright1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 2) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 3) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 4) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 5) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 7) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 11) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 12) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 13) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 13) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingright1.rotationPointX = this.wingright1.rotationPointX + (float)(xx);
        this.wingright1.rotationPointY = this.wingright1.rotationPointY - (float)(yy);
        this.wingright1.rotationPointZ = this.wingright1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.5055+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 0) / 5) * (1.98681-(0.5055+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = -3.4977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 0) / 5) * (4.2474+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(-3.4977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 1.98681 + (((tickAnim - 5) / 4) * (3.2555+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(1.98681)));
            yy = 4.2474+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 5) / 4) * (-3.4977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(4.2474+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 5) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 3.2555+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 9) / 6) * (3.2266+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(3.2555+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = -3.4977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 9) / 6) * (2.5439+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(-3.4977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 9) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 3.2266+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 15) / 7) * (3.1725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(3.2266+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 2.5439+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 15) / 7) * (-3.6523+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(2.5439+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 15) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 3.1725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 22) / 4) * (3.1736+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(3.1725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = -3.6523+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 22) / 4) * (4.0977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(-3.6523+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 22) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 3.1736+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 26) / 6) * (3.0927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(3.1736+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 4.0977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 26) / 6) * (-3.5868+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(4.0977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 26) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 3.0927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 32) / 4) * (3.0927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(3.0927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = -3.5868+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 32) / 4) * (4.6632+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(-3.5868+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 32) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 3.0927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 36) / 5) * (4.5074+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(3.0927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 4.6632+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 36) / 5) * (-5.034+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(4.6632+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 36) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 41 && tickAnim < 47) {
            xx = 4.5074+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 41) / 6) * (3.0118+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(4.5074+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = -5.034+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 41) / 6) * (3.5375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(-5.034+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 41) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 47 && tickAnim < 52) {
            xx = 3.0118+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 47) / 5) * (2.9424+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(3.0118+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 3.5375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 47) / 5) * (-4.6457+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(3.5375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 47) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 52 && tickAnim < 57) {
            xx = 2.9424+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 52) / 5) * (2.9593+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(2.9424+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = -4.6457+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 52) / 5) * (3.3519+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(-4.6457+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 52) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 57 && tickAnim < 61) {
            xx = 2.9593+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 57) / 4) * (2.9115+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(2.9593+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 3.3519+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 57) / 4) * (-6.7153+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(3.3519+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 57) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 61 && tickAnim < 66) {
            xx = 2.9115+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 61) / 5) * (2.9113+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(2.9115+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = -6.7153+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 61) / 5) * (5.8699+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(-6.7153+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 61) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 66 && tickAnim < 70) {
            xx = 2.9113+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 66) / 4) * (2.8652+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(2.9113+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 5.8699+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 66) / 4) * (-4.3672+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(5.8699+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 66) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 2.8652+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 70) / 5) * (2.8318+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(2.8652+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = -4.3672+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 70) / 5) * (3.2856+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(-4.3672+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 70) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 2.8318+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 75) / 5) * (0.5055+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(2.8318+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 3.2856+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 75) / 5) * (-3.4977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(3.2856+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 75) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright2, wingright2.rotateAngleX + (float) Math.toRadians(xx), wingright2.rotateAngleY + (float) Math.toRadians(yy), wingright2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(wingright3, wingright3.rotateAngleX + (float) Math.toRadians(0), wingright3.rotateAngleY + (float) Math.toRadians(0), wingright3.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*25));


        this.setRotateAngle(wingright4, wingright4.rotateAngleX + (float) Math.toRadians(0), wingright4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-10), wingright4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(handR, handR.rotateAngleX + (float) Math.toRadians(0), handR.rotateAngleY + (float) Math.toRadians(35), handR.rotateAngleZ + (float) Math.toRadians(-87.5));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-3.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*-5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-2.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-2.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(2.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*2.5));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperlegR, upperlegR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*5), upperlegR.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*5), upperlegR.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*10));


        this.setRotateAngle(lowerlegR, lowerlegR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*-5), lowerlegR.rotateAngleY + (float) Math.toRadians(0), lowerlegR.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(footR, footR.rotateAngleX + (float) Math.toRadians(0), footR.rotateAngleY + (float) Math.toRadians(0), footR.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingFlyingWalkingBase e = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) entity;
        animator.update(entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body1, ((-0.0456F)-(-0.0456F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(chest, ((-0.0892F)-(-0.0892F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r1, ((-0.8287F)-(-0.8287F)), ((0.0167F)-(0.0167F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r10, ((0.144F)-(0.144F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r11, ((-0.3272F)-(-0.3272F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r12, ((-0.1231F)-(-0.1231F)), ((0.0447F)-(0.0447F)),((0.3463F)-(0.3463F)));
        animator.rotate(cube_r13, ((-0.1231F)-(-0.1231F)), ((-0.0447F)-(-0.0447F)),((-0.3463F)-(-0.3463F)));
        animator.rotate(cube_r14, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r2, ((-0.3924F)-(-0.3924F)), ((0.0167F)-(0.0167F)),((0.0403F)-(0.0403F)));
        animator.rotate(cube_r3, ((-0.8287F)-(-0.8287F)), ((-0.0167F)-(-0.0167F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r4, ((-0.3924F)-(-0.3924F)), ((-0.0167F)-(-0.0167F)),((-0.0403F)-(-0.0403F)));
        animator.rotate(cube_r5, ((0.0436F)-(0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r6, ((0.1571F)-(0.1571F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r7, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r8, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.4363F)-(-0.4363F)));
        animator.rotate(cube_r9, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.4363F)-(0.4363F)));
        animator.rotate(footL, ((1.0606F)-(-0.4098F)), ((-0.5918F)-(0.5918F)),((0.2276F)-(-0.2276F)));
        animator.rotate(footR, ((1.0606F)-(-0.4098F)), ((0.5918F)-(-0.5918F)),((-0.2276F)-(0.2276F)));
        animator.rotate(handL, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((1.5533F)-(0.0F)));
        animator.rotate(handR, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-1.5621F)-(0.0F)));
        animator.rotate(head, ((0.48F)-(0.48F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head2, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head3, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw2, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(legwing11, ((-0.0911F)-(-0.0911F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(legwing2, ((-0.0911F)-(-0.0911F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(lowerlegL, ((0.8647F)-(0.7741F)), ((0.1147F)-(0.0F)),((0.2812F)-(-0.5463F)));
        animator.rotate(lowerlegR, ((0.8647F)-(0.7741F)), ((-0.1147F)-(0.0F)),((-0.2812F)-(0.5463F)));
        animator.rotate(neck, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck2, ((-0.2618F)-(-0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail1, ((-0.0456F)-(-0.0456F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail2, ((0.0456F)-(0.0456F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail3, ((0.0456F)-(0.0456F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail4, ((0.0456F)-(0.0456F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail5, ((0.0456F)-(0.0456F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(upperlegL, ((-0.1286F)-(-0.3206F)), ((-0.0332F)-(0.0F)),((-1.4914F)-(0.5009F)));
        animator.rotate(upperlegR, ((-0.1286F)-(-0.3206F)), ((0.0332F)-(0.0F)),((1.4914F)-(-0.5009F)));
        animator.rotate(wingleft1, ((0.0429F)-(0.0429F)), ((0.0206F)-(0.0359F)),((-0.0911F)-(-0.0911F)));
        animator.rotate(wingleft2, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-1.5509F)-(0.0F)));
        animator.rotate(wingleft3, ((-1.4748F)-(0.0F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(wingleft4, ((0.1375F)-(0.9599F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(wingright1, ((0.0429F)-(0.0429F)), ((-0.0206F)-(0.0359F)),((0.0911F)-(0.1006F)));
        animator.rotate(wingright2, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((1.5509F)-(0.0F)));
        animator.rotate(wingright3, ((-1.4748F)-(0.0F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(wingright4, ((0.1375F)-(0.9599F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(wukong, ((0.6545F)-(0.6545F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(wukong2, ((0.6545F)-(0.6545F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body1, -((-0.0456F)-(-0.0456F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(chest, -((-0.0892F)-(-0.0892F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r1, -((-0.8287F)-(-0.8287F)), -((0.0167F)-(0.0167F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r10, -((0.144F)-(0.144F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r11, -((-0.3272F)-(-0.3272F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r12, -((-0.1231F)-(-0.1231F)), -((0.0447F)-(0.0447F)),-((0.3463F)-(0.3463F)));
        animator.rotate(cube_r13, -((-0.1231F)-(-0.1231F)), -((-0.0447F)-(-0.0447F)),-((-0.3463F)-(-0.3463F)));
        animator.rotate(cube_r14, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r2, -((-0.3924F)-(-0.3924F)), -((0.0167F)-(0.0167F)),-((0.0403F)-(0.0403F)));
        animator.rotate(cube_r3, -((-0.8287F)-(-0.8287F)), -((-0.0167F)-(-0.0167F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r4, -((-0.3924F)-(-0.3924F)), -((-0.0167F)-(-0.0167F)),-((-0.0403F)-(-0.0403F)));
        animator.rotate(cube_r5, -((0.0436F)-(0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r6, -((0.1571F)-(0.1571F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r7, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r8, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.4363F)-(-0.4363F)));
        animator.rotate(cube_r9, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.4363F)-(0.4363F)));
        animator.rotate(footL, -((1.0606F)-(-0.4098F)), -((-0.5918F)-(0.5918F)),-((0.2276F)-(-0.2276F)));
        animator.rotate(footR, -((1.0606F)-(-0.4098F)), -((0.5918F)-(-0.5918F)),-((-0.2276F)-(0.2276F)));
        animator.rotate(handL, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((1.5533F)-(0.0F)));
        animator.rotate(handR, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-1.5621F)-(0.0F)));
        animator.rotate(head, -((0.48F)-(0.48F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head2, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head3, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw2, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(legwing11, -((-0.0911F)-(-0.0911F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(legwing2, -((-0.0911F)-(-0.0911F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(lowerlegL, -((0.8647F)-(0.7741F)), -((0.1147F)-(0.0F)),-((0.2812F)-(-0.5463F)));
        animator.rotate(lowerlegR, -((0.8647F)-(0.7741F)), -((-0.1147F)-(0.0F)),-((-0.2812F)-(0.5463F)));
        animator.rotate(neck, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck2, -((-0.2618F)-(-0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail1, -((-0.0456F)-(-0.0456F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail2, -((0.0456F)-(0.0456F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail3, -((0.0456F)-(0.0456F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail4, -((0.0456F)-(0.0456F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail5, -((0.0456F)-(0.0456F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(upperlegL, -((-0.1286F)-(-0.3206F)), -((-0.0332F)-(0.0F)),-((-1.4914F)-(0.5009F)));
        animator.rotate(upperlegR, -((-0.1286F)-(-0.3206F)), -((0.0332F)-(0.0F)),-((1.4914F)-(-0.5009F)));
        animator.rotate(wingleft1, -((0.0429F)-(0.0429F)), -((0.0206F)-(0.0359F)),-((-0.0911F)-(-0.0911F)));
        animator.rotate(wingleft2, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-1.5509F)-(0.0F)));
        animator.rotate(wingleft3, -((-1.4748F)-(0.0F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(wingleft4, -((0.1375F)-(0.9599F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(wingright1, -((0.0429F)-(0.0429F)), -((-0.0206F)-(0.0359F)),-((0.0911F)-(0.1006F)));
        animator.rotate(wingright2, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((1.5509F)-(0.0F)));
        animator.rotate(wingright3, -((-1.4748F)-(0.0F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(wingright4, -((0.1375F)-(0.9599F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(wukong, -((0.6545F)-(0.6545F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(wukong2, -((0.6545F)-(0.6545F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
